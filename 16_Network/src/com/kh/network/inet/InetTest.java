package com.kh.network.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetTest {
	public void test() {
		//InetAddress: IP주소 관련 정보를 확인할 수 있는 클래스
		
		// 내 PC에 대한 정보 확인
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			// pc정보/IP주소
			// DESKTOP-PFHFRRD/192.168.10.32
			System.out.println("내 PC정보: "+ localhost.getHostName());
			System.out.println("내 IP주소: "+ localhost.getHostAddress());
			System.out.println("내 IP주소: "+ localhost.isMulticastAddress());
			
			//도메인을 통해서 서버 정보 확인
			InetAddress google = InetAddress.getByName("www.google.com");
			System.out.println("구글 서버명: "+ google.getHostName());
			System.out.println("구굴 IP주소: "+ google.getHostAddress());
			// IP주소는 사람마다 다르게 나올수 있음
			System.out.println("================================");
			//
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버의 호스트 개수: "+ naver.length);
			for(InetAddress ia:naver) {
				System.out.println("네이버의 호스트명: "+ ia.getHostName());
				System.out.println("네이버의 IP주소: "+ ia.getHostAddress());
			}
			System.out.println("================================");
			InetAddress[] facebook = InetAddress.getAllByName("www.facebook.com");
			System.out.println("네이버의 호스트 개수: "+ facebook.length);
			for(InetAddress ia:facebook) {
				System.out.println("네이버의 호스트명: "+ ia.getHostName());
				System.out.println("네이버의 IP주소: "+ ia.getHostAddress());
			}
			System.out.println("================================");
			InetAddress[] youtube = InetAddress.getAllByName("www.youtube.com");
			System.out.println("네이버의 호스트 개수: "+ youtube.length);
			for(InetAddress ia:youtube) {
				System.out.println("네이버의 호스트명: "+ ia.getHostName());
				System.out.println("네이버의 IP주소: "+ ia.getHostAddress());
			}
			System.out.println("================================");
			InetAddress[] notion = InetAddress.getAllByName("www.notion.com");
			System.out.println("네이버의 호스트 개수: "+ notion.length);
			for(InetAddress ia:notion) {
				System.out.println("네이버의 호스트명: "+ ia.getHostName());
				System.out.println("네이버의 IP주소: "+ ia.getHostAddress());
			}
			System.out.println("================================");
			InetAddress[] x = InetAddress.getAllByName("www.x.com");
			System.out.println("네이버의 호스트 개수: "+ x.length);
			for(InetAddress ia:x) {
				System.out.println("네이버의 호스트명: "+ ia.getHostName());
				System.out.println("네이버의 IP주소: "+ ia.getHostAddress());
			}
			System.out.println("================================");
			InetAddress[] linkedin = InetAddress.getAllByName("www.linkedin.com");
			System.out.println("네이버의 호스트 개수: "+ linkedin.length);
			for(InetAddress ia:linkedin) {
				System.out.println("네이버의 호스트명: "+ ia.getHostName());
				System.out.println("네이버의 IP주소: "+ ia.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

