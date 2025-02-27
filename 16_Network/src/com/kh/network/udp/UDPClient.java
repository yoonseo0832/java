package com.kh.network.udp;

import java.net.*;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		// 사용자한테 입력받은 값을 UDP 서버로 전송
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전송 메세지: ");
		String msg = sc.nextLine();
		
		try(DatagramSocket ds = new DatagramSocket()) {
			InetAddress ia = InetAddress.getByName("192.168.10.32");
			int port = 8888;
			
			//전송데이터 byte[] , 전송데이터 길이, 서버 네트워크 정보(IP), 포트번호
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, port);
		}catch(SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
