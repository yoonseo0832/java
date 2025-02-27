package com.kh.inherit.after;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d1 = new Desktop("apple", "ip-14-2315", "iphone14pro", 1200000, true);
		System.out.println(d1.information());
		TV t1 = new TV("삼성", "rend13-9345", "레노베이션LED", 30000000, 32);
		System.out.println(t1.information());
		
		String t2 = new TV("삼성", "rend13-9345", "레노베이션LED", 30000000, 32).information();
		System.out.println(t2);
	}

}
