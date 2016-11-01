package test02; // 인스턴스 생성 - 생성 위치

// 2016년 10월 24일 월요일
public class Student {

	String name;
	String email;
	String tel;
	int age;
	boolean working;

	void printStudent(Student student) {
		System.out.printf("%s,%s,%s,%d,%b\n", student.name, student.email, student.tel, student.age, student.working);
	}

	void init(String name, String email, String tel, int age, boolean working) {
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.age = age;
		this.working = working;
	}

	public static void main(String[] args) {

	}
}

/*
 * 스태틱 메서드 스태틱 매서드는 클래스 이름으로 호출한다. ex) Student2.init(arr "홍길"
 */