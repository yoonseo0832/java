package com.kh.practice.file.controller;
import com.kh.practice.file.model.dao.*;
public class FileController {
	private FileDAO fd = new FileDAO();
	
	/**
	 * DAO에 매개변수 전달하고 DAO로부터 전달받은 값을 다시 반환
	 * @param file
	 * @return 파일 존재 여부 (boolean타입)
	 */
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	/**
	 * 전달받은 매개변수를 DAO에 전달
	 * @param file 파일명
	 * @return 
	 */
	public void fileSave(String file, String sb) {
			fd.fileEdit(file, sb);
	}
	
	/**
	 * DAO에 매개변수를 전달, DAO로부터 전달 받은 값 다시 반환
	 * @param file 파일명
	 * @return 파일에 저장된 내용
	 */
	public String fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	/**
	 * 전달받은 매개변수를 DAO에 전달
	 * @param file 파일명
	 * @param sb 추가할 내용
	 */
	public void fileEdit(String file, String sb) {
			fd.fileEdit(file, sb);
	}
	
}
