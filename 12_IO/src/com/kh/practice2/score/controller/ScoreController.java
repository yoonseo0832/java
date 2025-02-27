package com.kh.practice2.score.controller;
import java.io.DataInputStream;
import java.io.FileNotFoundException;

import com.kh.practice2.score.model.dao.*;
public class ScoreController {
	private ScoreDAO sd = new ScoreDAO();
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		sd.saveScore(name, kor, eng, math, sum, avg);
	}
	
	public DataInputStream readScore() throws  FileNotFoundException{
		return sd.readScore();
	}
}
