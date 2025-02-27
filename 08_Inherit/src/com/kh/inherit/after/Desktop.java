package com.kh.inherit.after;

public class Desktop extends Product{
	private boolean allInOne;
	
	public Desktop() {}
	
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);
		this.allInOne = allInOne;
	}
	public boolean isAllInOne() {
		//boolean 타입의 필드의 getter 메소드명: isAllInOne()
		//getAllInOne()아닌 isAllInOne()으로 만듦
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	@Override // @Override 오버라이딩된 메소드임을 알리는 
	public String information() {
		//super.information() => 부모클래스에 정의된 information 메소드 호출
		return super.information()+",allInOne: "+allInOne;
	}
}
