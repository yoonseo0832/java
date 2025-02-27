package com.kh.practice2.score.model.dao;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		String data ="";
		File f = new File(data);
		try(DataInputStream dis = new DataInputStream(
					new FileInputStream(data)
				);){
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public DataInputStream  readScore() throws  FileNotFoundException{
		return null;
	}
}
