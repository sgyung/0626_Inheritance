package day0626;

public class ConParent {
	
	public ConParent() {
		//this(100);// 2번
		System.out.println("부모 기본 생성자");
	}
	
	public ConParent(int i) {
		this();
		System.out.println("부모매개생성자 " + i);
	}
	
}
