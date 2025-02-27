package com.kh.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IO02_AssistantStream {
/*
 * 보조 스트림: - 기반 스트림만으로 부족한 성능을 향상시켜주는 스트림(보조해줌)
 * 			 	기반 스트림에서 제공하지 않는 추가적인 메소드 제공
 * 			 => 데이터 전송 속도 향상
 * 			  - 외부 매체와 직접적으로 연결되지 않기 때문에 단독 사용 불가
 * 			 => 반드시 기반 스트림과 함께 사용
 */
	public static void main(String[] args) {
		//fileSave();
		//fileRead();
		//objectSave();
		// 객체 직렬화
		objectRead();
		
	}// 파일 ===> 프로그램: 입력. 객체로 저장된 데이터
	public static void objectRead() {
		// FileInputStream : 기반스트림
		// ObjectInputStream : 보조스트림
		try(ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("myProduct.txt")
				);){
			// 반복문으로 변경하는 방법
			while(true) {
				System.out.println(ois.readObject());
			}
			//System.out.println(ois.readObject());
			//System.out.println(ois.readObject());
			//System.out.println(ois.readObject());
			
			// input stream을 읽는 중에 더 이상 데이터가 존재하지 않기 때문 catch문에 넣기
			//System.out.println(ois.readObject());
			
			// End of File Exception의 의미 EOFException
		}catch(EOFException e){
			System.out.println("파일 데이터 모두 입력 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 프로그램 ===> 파일: 출력. 객체에 저장된 데이터
	public static void objectSave() {
		//출력할 데이터
		Product p1 = new Product("머그컵", 10000);
		Product p2 = new Product("풍선", 4000);
		Product p3 = new Product("추러스", 3500);
		
		// FileOutputStream : 기반스트림, 1바이트 단위로 파일에 출력하는 스트림
		// ObjectOutputStream : 보조스트림, 객체 단위로 출력을 도와주는 스트림
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("myProduct.txt")
				);){
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void fileRead() {
		// FileReader : 기반 스트림, 파일에 직접 연결하여 2바이트씩 데이터를 입력 받는 스트림
		// BufferedReader : 한 줄씩 데이터를 읽어오도록 도와주는 보조스트림
		System.out.println("========= fileRead start===========");
		/*
		try(BufferedReader br = new BufferedReader(
					new FileReader("as_test.txt"));){
			br.read();
		}
		*/
		try {
			FileReader fr = new FileReader("as_test.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//파일 내용 읽어오기
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine());
			System.out.println(br.readLine()); */
			
			// => 읽어올 내용이 없을때는 null 값으로 확인됨
			
			String data = null;
			while((data = br.readLine()) !=null){
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다");
			System.out.println(e.getMessage());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	// 프로그램 ---> 파일 : 출력
	public static void fileSave() {
		// FileWriter : 기반 스트림. 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림
		// BufferedWriter : 속도 향상을 도와주는 보조 스트림
		
		System.out.println("========= fileSave start===========");
		// try with resources 구문: 자원을 알아서 해제/반납해주는 문법
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter("as_test.txt")
				)) {
			
		/*
		try {
			// 1. 기반스트림 생성
			FileWriter fw = new FileWriter("as_test.txt");
			
			// 2. 보조스트림 생성 => 기반스트림 객체를 전달
			BufferedWriter bw = new BufferedWriter(fw);
		*/	
			bw.write("기반스트림 사용!1!");
			bw.newLine();
			bw.write("반가워요! 좋은 아침이네요");
			bw.newLine(); //줄바꿈(다음줄에)
			bw.write("이제는 우리가 헤어져야 할시간!");
			
			bw.flush();
			
			//bw.close(); 알아서 해제해주는 try with resources 구문 사용해 close() 필요없음
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
