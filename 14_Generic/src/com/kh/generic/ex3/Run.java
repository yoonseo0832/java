package com.kh.generic.ex3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box<Apple> aBox = new Box<>();
		// Number 클래스를 상속 받지 않아서 오류 발생
		// Number 클래스를 상속시킴녀 오류 발생 안함
		Box<Number> nBox = new Box<>();
		
		Box<Integer> iBox = new Box<>();
		Box<Double> dBox = new Box<>();
		Box<Float> fBox = new Box<>();
		Box<Byte> bBox = new Box<>();
		Box<Long> lBox = new Box<>();
		// => Number 또는 Number타입을 상속받아 타입 사용 가능!
	}

}
