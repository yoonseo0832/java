package com.kh.generic.ex4;

//타입 매개변수는 여러개도 선언 가능함
public class DBox<L, R> {
	private L left; // 첫번째 전달된 타입 사용
	private R right; // 두번째 전달된 타입 사용
	
	public void set(L left, R right) {
		this.left=left;
		this.right=right;
	}

	@Override
	public String toString() {
		return left +" & "+ right;
	}
	
}
