package com.kh.practice.file.model.dao;

import java.io.*;

public class FileDAO {
	
	// 생성자를 톻해 특정 경로에 폴더가 없을 경우 폴더 생성
	String path = "./resources/files";
	
	public FileDAO() {
		File folder = new File(path);
		if(!folder.exists()) {
			if(folder.mkdirs()) {// 모든 파일을 생성 가능
			System.out.println("[ERROR] 초기화 실패, 폴더 생성 실패!");
			}
		}
	}
	/**
	 * 존재하는 파일인지 확인 후 반환
	 * @param file 파일명
	 * @return 존재하는 파일인지 여부(boolean)
	 */
	public boolean checkName(String file) {
		File f1 = new File(path, file);
		// new File(상위폴더경로, 파일명);  => 상위폴더경로/파일명
		return f1.exists();
	}
	/**
	 * 매개변수로 받은 파일 명에 문자열 저장
	 * @param file 파일명
	 * @param s 저장할 내용
	 */
	public void fileSave(String file, String s) {
		File f = new File(path, file);
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter(f)
				);){
			bw.write(s);
		}catch(IOException e) {
			e.printStackTrace();
	}

	/*
	 * File f1 = new File(file); String name = f1.getName(); try {
	 * f1.createNewFile(); }catch(IOException e) { e.printStackTrace(); }
	 */
	}
	/**
	 * 매개변수로 받은 파일 명을 이용하여 저장되어 있는 데이터 반환(입력)
	 * @param file 파일명
	 * @return 파일 내용()
	 */
	public String fileOpen(String file) {
		File f = new File(path, file);
		String fileContents =""; //(최종적으로)파일 전체 데이터 저장하는 변수
		try(BufferedReader br = new BufferedReader(
				new FileReader(f)
				);){
			String data = null; // 한줄한줄 읽어와서 저장하는 변수
			while((data = br.readLine()) !=null) {
				fileContents+=data+ "\n";
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return fileContents;
	}
	/**
	 * 매개변수로 받은 파일 명에 문자열 저장(기존 내용에 이어서 저장(수정), 출력)
	 * @param file 파일명
	 * @param s 추가할 내용
	 */
	public void fileEdit(String file, String s) {
		File f = new File(path, file);
		try(BufferedWriter bw = new BufferedWriter(
					new FileWriter(f, true)
				);){
			bw.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
