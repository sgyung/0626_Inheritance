package day0626;

public class ConChild extends ConParent {
	
	public ConChild() {
		//this(100); // 2번
		super(200);
		System.out.println("자식 기본 생성자");
	}

	public ConChild (int i) {
		this();
		System.out.println("자식매개생성자 " + i);
	}
}
