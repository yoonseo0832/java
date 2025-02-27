package com.kh.api;

public class API2_String {
/*
 * java.lang.String 클래스 (따로 추가할 경로 없음 ; import)
 */
	public static void main(String[] args) {
		//test1();
		test2();
	}
	public static void test2() {
		// 1) equals => 문자열A.equals(문자열B): boolean
		// 				문자열A와 문자열B가 같은지 비교 (true/false 반환)
		String str1 = "Hello";
		System.out.println("[1]같은 문자열: "+ str1.equals("Hello"));
		System.out.println("[2]다른 문자열: "+ str1.equals("World"));
		
		// 2) charAt => 문자열.charAt(인덱스):char
		// 				해당 문자열의 인덱스 위치의 문자값을 반환
		System.out.println("[3]문자열에서 문자 추출: "+ str1.charAt(1)); //Hello에서 'e'의 인덱스 번호 1
		
		// 3) length => 문자열.length() : int
		//				문자열의 길이를 반환
		System.out.println("[4]문자열 길이: "+ str1.length());
		System.out.println("[5]마지막 문자 출력: "+ str1.charAt(str1.length()-1));
		//str1.length() -1 ==> 마지막 문자
		
		// 4) toUpperCase => 문자열.toUpperCase() : String
		//					 해당 문자열의 알파벳을 모두 대문자로 변환하여 반환
		//	  toLowerCase =>  문자열.toLowerCase() : String
		//					 해당 문자열의 알파벳을 모두 소문자로 변환하여 반환
		System.out.println("[6]toUpperCase: "+str1.toUpperCase()); //모두 대문자로
		System.out.println("[7]toLowerCase: "+str1.toLowerCase()); //모두 소문자로
		
		// 5) contains => 문자열A.contains(문자열B): boolean
		//				  문자열A에 문자열B가 포함되는지
		System.out.println("[8]contains: "+str1.contains("el")); 
		System.out.println("[9]{Not}contains: "+str1.contains("kbs")); 
		
		// 6) indexOf() => 문자열A.indexOf(문자열B):int
		//				   문자열A에 문자열B의 시작 인덱스 반환(있으면 1/없으면 -1)
		System.out.println("[10]indexOf: "+str1.indexOf("el")); // 1
		System.out.println("[11]{Not}indexOf: "+str1.indexOf("k"));  //-1
		
		// 7)substring => 문자열.substring(시작 인덱스):String
		//				  문자열에서 시작인덱스부터 마지막위치까지 문자열을 추출하여 반환
		//				  문자열.substring(시작인덱스, 끝인덱스):String
		//				  문자열에서 시작인데스부터 끝인덱스까지 문자열을 추출하여 반환
		System.out.println("[12]substring: "+str1.substring(2)); 
		System.out.println("[13]{start, end}substring: "+str1.substring(2, 4));
		
		// 8) repeat => 문자열.repeat(개수):String
		//				문자열을 개수만큼 반복하여 문자열을 리턴
		System.out.println("[14]repeat: "+("HappyDay ".repeat(4)));
		System.out.println(("= ".repeat(20)));
		
		// 9) split => 문자열.split(구분자): String[]
		//			   해당 문자열을 구분자를 기준으로 분리하여 문자열 배열형태로 반환
		String str2 ="HTML#CSS#JS#JAVA";
		String[] arr = str2.split("#");
		for(String s: arr) {
			System.out.println(s);
		}
		
		String str0 ="HTML CSS JS JAVA";
		String[] ddd = str0.split(" ");
		for(String s: ddd) {
			System.out.print(s+" ");
		}
	}
	
	public static void test1() {
		String str1 = "apple"; // 값 자체를 대입 -> 상수풀
		String str2 = "apple";
		
		System.out.println("[1] "+ (str1 == str2)); // 결과: true
// str1 == str2 -> 문자열 값을 비교 X -> 주소값을 비교
// 문자열 값 자체를 대입하게 되면 "상수풀"이라는 공간에 값을 저장해 같은곳을 가르키게 되서 [주소값이 같음]
		
		System.out.println("[2] "+ (str1 == "apple")); // 결과: true
		// str1이 가르키는 주소와 "apple"이라는 값 자체가 저장된 주소 비교
		// => str1, "apple" 모두 상수풀 공간에서 같은 주소를 가르킴 
		String str3 = new String("apple"); 
		String str4 = new String("apple"); 
		
		System.out.println("[3] "+ (str3==str4));
		// => 문자열 객체를 생성하여 값을 대입 => 메모리에 새로운 영역에 할당하므로 각각 할당된
		// 가르키게 되서 주소값 다름
		
		System.out.println("[4] "+ (str3=="apple"));
		// str3 -> 주소와 "apple" 이라는 값 자체가 저장된 주소를 비교
		// str3는 새로운 메모리 공간에 할당 후 "apple"값을 저장
		// "apple" 값 자체는 상수풀에 저장되어 있어서 서로 가르키는 주소가 달라서 false
		
		// 문자열의 값을 비교하고자 할때 equals 메소드 사용
		System.out.println("문자열 값 비교: "+ str3.equals("apple"));
		
		System.out.println();
		
		String str5 = "Hello";
		String str6 = "World";
		
		System.out.println("[5] "+ str5); // 문자열 변수 출력: Hello
		System.out.println("[6] "+ str6.toString());
		// => String 클래스에서는 toString 메소드가 재정의(오버라이딩)되어 있음
		int hash1=System.identityHashCode(str5);
		//(hashCode)주소값이 궁금한 경우: System.identityHashCode(참조변수명)
		System.out.println("[7] "+hash1);
		
		//str5 변수의 값 변경
		//문자열.concat(추가할 문자열): String형태로 반환
		str5 = str5.concat(str6);
		System.out.println(str5);
		int hash2=System.identityHashCode(str5);
		System.out.println("[8] "+hash2);
	}
}
