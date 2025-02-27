package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
// 서버 프로그램만 만든 것
	
/*
 * TCP
 * - 서버, 클라이언트 간에 1:1 소켓통신g
 * - 데이터 교환 전 서버와 클라이언트의 연결이 되어야 함
 *  (서버가 먼저 실행, 클라이언트의 요청을 기다려야함)
 * - 신뢰성 있는 데이터 전달 가능(믿고 주고받음)
 * 
 * Socket
 * - 프로세스 간의 통신을 담당
 * - 스트림(Input/OutputStream)을 가지고 있음
 *  (해당 스트림을 이용하여 입출력이 가능)
 *  
 * ServerSocket
 * : 포트와 연결돠어 외부의 연결 요청을 기다림 => 연결 요청 들어오면 수락함
 * 	* 수락: 통신할 수 있는 Socket 겍체 생성
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) 포트번호 지정, 클라이언트는 3000으로 요청
		Scanner sc = new Scanner(System.in);
		
		// 변수 초기화
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server =null;
		
		int port = 3000;
		
		try {
			//2) ServerSocket 객체 생성(* 지정한 포트번호를 사용)
			server = new ServerSocket(port);
			System.out.println("=== 클라이언트 요청 대기중 ===");
			
			//3) 요청이 들어오면 수락 후 소켓 객체 생성(통신용)
			// 			=> 소켓: 클라이언트와 통신을 담당하는 객체(통로)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress()+ "가 연결됨!");
			
			// 입출력 스트림을 생성
			// 4) 클라이언트와 입출력 기반 스트림 생성(바이트 스트림만 가능)
			// 5) 보조스트림을 활용해 성능 개선
			
			// 입력용 스트림("클라이언트"로부터 전달된 값을 한줄 단위로 읽어오기 위해 사용)
			br = new BufferedReader(
									new InputStreamReader(
											(socket.getInputStream())));
			
			// 출력용 스트림("클라이언트"로 값을 전달)
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter: print, println 메소드 사용 가능
			
			while(true) {
				String msg = br.readLine(); // 클라이언트로부터 온 데이터 읽음(*입력)
				System.out.println("클라이언트로부터 온 메세지: "+msg);
				System.out.println("클라이언트에게 보낼 메세지: ");
				String sendMsg = sc.nextLine();
				
				pw.println(sendMsg); // 클라이언트에게 데이터 전달(*출력)
				pw.flush(); // 해당 스트림에 있는 데이터를 강제로 내보내기!!
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 6) 통신 종료 처리/자원 반납
			try {
				if(pw !=null)pw.close();
				if(br !=null)br.close();
				if(server != null) server.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
