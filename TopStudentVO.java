package day0626;

/**
 * 최고학생의 정보를 저장하기 위한 객체
 * 최고 학생의 번호와 이름을 저장
 * @author USER
 */
public class TopStudentVO {
	private int num;
	private String name;
	
	// 기본생성자
	public TopStudentVO() {
		
	}
	
	// 생성자 Overload
	public TopStudentVO(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	// setter method
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// getter method
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
}
