package com.kh.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// (1) port 임의로 지정 => IP는 PC에서 지정
		int port = 7979;
		
		try {
			// (2) ServerSocket 객체 생성(포트 번호 포함)
			ServerSocket server = new ServerSocket(port);
			
			// (3) Socket 객체 생성(요청에 대한 수락)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress()+ "에 연결됨");
			
			// 클라이언트로부터 메세지를 받는 스레드 => ServerReceiver
			ServerReceiver sr = new ServerReceiver(socket);
			
			// 클라이언트로 메세지를 보내는 스레드 => ServerSender
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
