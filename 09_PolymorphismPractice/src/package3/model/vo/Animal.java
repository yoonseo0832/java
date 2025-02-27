package package3.model.vo;

public abstract class Animal {
	// 접근제한자 예약어 class 클래스명
	// abstract
	private String name;
	private String kinds;
	
	protected Animal() {}
	
	protected Animal(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	/*
	 * protected 생성자를 정의하면 해당 클래스는 
	 * 같은 패키지 내에서 또는 상속 관계에서만 인스턴스 생성 가능
	 * => 현재 클래스는 추상클래스 => 직접 구현 불가
	 * 자식 클래스에서 super() 생성자를 사용해 구현
	 */

	@Override //어노테이션 => 오버라이딩된 메소드임을 의미함
	public String toString() {
		return String.format("저의 이름은 %s이고, 저의 종은 %s입니다. ", name, kinds);
		//return "저의 이름은 "+ name+ "저의 이름은  "+kinds+"입니다.";
		//toString() Object 클래스에 정의되있는 메소드,
		// 현재 클래스에서 재정의됨*(오버라이딩!)
		//보통 toString 메소드는 현재 클래스의 모든 필드의 정보를 
		//문자열로 반환하는 역할을 하도록 재정의함
		// => 참조변수를 문자열로 사용할때 toString() 메소드 호출됨!
	}
	
	public abstract void speak();
	//접근제한자 예약어 반환형 메소드명(매개변수정보);
	//=> 예약어 위치에 "abstract" 사용되면 추상메소드됨
	// 추상메소드는 구현부 없음, 메소드 머리부 끝에 세미콜론으로 끝남 ();
}
