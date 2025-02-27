package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	private boolean coupon;
	
	public CookBook() {}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon=coupon;
	}
	public boolean isCoupon() { //불리언 타입은 get보다는 is를 나중에 라이브러리가 이렇게 사용함
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon=coupon;
	}

	@Override
	public String toString() {
		return "CookBook ["+ super.toString()+", coupon=" + coupon + "]";
	}
	
}
