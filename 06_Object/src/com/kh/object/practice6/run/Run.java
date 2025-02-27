package com.kh.object.practice6.run;
import com.kh.object.practice6.model.vo.Book;
public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("노인과 바다");
		b1.setPublisher("데니엘 허니");
		b1.setAuthor("로버트다우니 주니어");
		b1.inform();
	}

}
