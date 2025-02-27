package com.kh.io;
import java.io.*;
public class IO00_IOStream {
	/*
	 * 입출력(IO, Input, Output)
	 * : 프로그램 상의 데이터를 외부 매체로 출력하거나 반대로 외부 매체로부터 데이터를 입력받고자할 떄
	 *  프로그램과 외부 매체 사이에 데이터를 주고받는 연결통로로서 역할을 하는 것을 "스트림"이라고 함
	 * 외부 매체
	 * ----------        ----------				-----------
	 * |모니터   | ======	  |         |  ======   |외부매체		|
	 * 	파일,     |-데이터-->| 프로그램  | --데이터-->|*모니터		|	
	 * 프로그램...}| ====== 	|		| ======    |*파일		|
	 *|		    |		|           |           |*프로그램	|
	 * -----------       ----------				--------------
	 * * 스트림의 특징
	 * - 단방향: 입력용 스트림, 출력용 스트림이 나눠져 있음
	 * 		=> 입력과 출력을 동시에 하고자하면 => 입력 스트림, 출력 스트림 각각 사용
	 * - 선입선출(FIFO): 먼저 들어온 값이 먼저 나감(파이프 생각해)
	 * - 시간지연(delay) 발생할 수도 있음
	 * 
	 *  *스트림 구분
	 *  > 사이즈: 바이트(1byte) / 문자(2byte)
	 *   	- 바이트 스트림: 1byte씩 데이터가 왔다갔다 하는 통로
	 *   	=> 입력용: InputStream
	 *   	=> 출력용: OutputStream
	 *   	- 문자 스트림: 2byte씩 데이터가 왔다갔다 하는 통로
	 *		=> 입력용: Reader
	 *   	=> 출력용: Writer
	 *   > 외부 매체와 직접 연결유무
	 *   - 기반스트림: 외부 매체와 직접적으로 연결되는 통로. 필수로 사용해야함
	 *   - 보조스트림: 기반스트림을 보조하는 통로, 속도를 빠르게 하거나 유용한 기능을 제공.
	 *   			단독으로 사용 불가 => 반드시 기반스트림과 함께 사용해야 함
	 */
	public static void main(String[] args) {
		// I/OStream 사용해 키보드로 입력받아 콘솔창에 출력하는 프로그램
		
		// 키보드입력  --> 프로그램 --> 콘솔창 출력
		InputStream in = System.in;    //표준 입력 스트림 Scanner 대신
		OutputStream out = System.out; //표준 출력 스트림
		
		byte[] buf = new byte[1024];
		//입출력 시 버퍼의 데이터를 저장하기 위한 변수
		
		int len =0;  //데이터 길이를 저장하기 위한 변수
		try {
			while((len = in.read(buf)) != -1) {
				// 무한히 입력을 받겠다 => 프로그램 종료까지
				out.write(buf, 0, len); // 0부터 길이 만큼
				// write(출력할 값, 시작위치, 길이) => offset: 시작위치
				out.flush(); // 잔여물 남지 않도록 쭉 밀어버림
			}

		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 자원 반납 및 해제 => 프로그램에서 사용한 외부 장치 연결 해제
			try {
				// in/out null이 아닌경우 해제 // 직접 종료해야함
				if(in!=null) in.close();
				if(out!=null) out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
