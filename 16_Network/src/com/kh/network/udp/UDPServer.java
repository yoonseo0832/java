package com.kh.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		// 1) IP(PC에 지정되어 있음)와 port(**)
		int port = 8888;

		// 2) UDP용 소켓 객체 생성
		try (DatagramSocket ds = new DatagramSocket(port)) {
			// ---데이터 받을 준비 완료---
			while(true){
				System.out.println("===== 요청 대기중 =====");

				// 클라이언트로부터 받을 packet 객체 생성
				byte[] data = new byte[1024];
				DatagramPacket dp = new DatagramPacket(data, data.length);
				
				// 전송된 데이터 받기
				ds.receive(dp);
				
				// 데이터 정보 확인
				System.out.println("클라이언트 IP: "+ dp.getAddress());
				
				String msg = new String(dp.getData(), "UTF-8");
				System.out.println("전송된 메세지: "+msg);
			}
		}catch (SocketException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
