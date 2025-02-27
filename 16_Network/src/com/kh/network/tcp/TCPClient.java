package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 클라이언트 용 프로그램
public class TCPClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw  =null;
		Socket socket = null;
		
		// 서버로 요청할 때 필요한 정보
		// IP주소, 포트번호
		//String serverIP = "192.168.10.104";
		//방화벽 풀어야 실행/연결됨 firewall.cpl
		String serverIP = "192.168.10.32";
		int port = 3000;
		
		try {
			// 1) 서버로 연결 요청: IP주소와 포트번호를 가지고 Socket 객체 생성
			socket = new Socket(serverIP, port);
			if(socket != null) {
				System.out.println("==== 서버와 연결됨 ====");
				
				// 2) 서버와의 입출력 스트림 새엇ㅇ
				// 3) 보조스트림을 사용하여 성능 개선
				
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
				while(true) {
					System.out.print("서버로 보낼 메세지: ");
					String sendMsg = sc.nextLine();
					
					pw.println(sendMsg);
					pw.flush();
					
					String msg = br.readLine();
					System.out.println("서버로부터 온 메세지: "+ msg);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 4) 통신 종료 => 자원 반납
			try {
				if(br!=null) br.close();
				if(pw!=null) pw.close();
				if(socket!=null) socket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}	
		}
}

}
