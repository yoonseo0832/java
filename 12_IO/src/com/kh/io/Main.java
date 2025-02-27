package com.kh.io;

import java.io.*;

//* 다음 코드에서 잘못된 부분을 찾아 수정하시오.
public class Main {

	private static String fileName = "tt.txt";

	public static void main(String[] args) {
		//fileWrite();
		//fileRead();
	}
	/*
	public static void fileWrite() {
		String[] samples = {"안녕하세요", "반가워요", "또만나요"};
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName));) {
			for(String s : samples) {
				br.write(s);
				br.newLine();

			}
		} catch (IOException e) {
			e.printStackTrace();		
		}
	
	}
	
	public static void fileRead() {
	
		try (BufferedReader bw = new BufferedReader(new FileReader(fileName));) {
			String data = null; // ==String data ="";
			while ((data = bw.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
*/

}

//출력  안녕하세요
//	   반가워요
//	   또만나요
