package com.kh.object.practice2.run;
import com.kh.object.practice2.model.vo.Product;
public class Run {

	public static void main(String[] args) {
		Product p1 =new Product();
		p1.setProductName("아이폰");
		p1.setPrice(2700);
		p1.setBrand("(주)애플");
		p1.information();
	}

}
