package day0626;

/**
 * 사용자 정의 자료형 : Java에서 제공하는 데이터 형을 조합하여 새로운 이름(클래스명)의
 * 데이터 형을 만드는 것.
 * @author USER
 */
public class Student {
	private String name;
	private int age;
	private double height;
	private double weight;
	private String email;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public String getEmail() {
		return email;
	}
	
	
}
