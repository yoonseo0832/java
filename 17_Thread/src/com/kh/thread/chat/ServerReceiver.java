package com.kh.thread.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiver implements Runnable{
	private Socket socket;
	public ServerReceiver(Socket socket) { //객체가 전달됨
		this.socket=socket;
	}
	@Override
	public void run() {
		// 소켓 객체로부터 스트림 객체 생성
		try(BufferedReader br =new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()
							))){
			while(true) {
				String msg = br.readLine();
				System.out.println("클라이언트로부터 온 메세지: "+ msg);
		}
		// 새로운 메세지 도착할때마다 해당 내용을 출력
		
		}
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
