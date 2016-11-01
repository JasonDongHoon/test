package test02; // 사용자 정의 타입의 인스턴스 - 응용4

//메서드를 역할에 따라 적절히 분류하여 유지보수 좋게한다. 관련있는 메서드 들은 서로 묶어놓는 것이 유지 보수에 좋다.

// 2016년 10월 24일 월요일
public class Exam016 {
	// 1) 레퍼런스 변수 3개 준비

	static void printStudent(Student student) {
		System.out.printf("%s,%s,%s,%d,%b\n", student.name, student.email, student.tel, student.age, student.working);

	}

	public static void main(String[] args) {
		Student[] arr = new Student[3]; // 레퍼런스 배열을 3개 준비한다.
		// Student 인스턴스가 아니다.
		// Student s1, s2, s3; 와 같은 의미다.

		// 2) 각 레퍼런스 변수에 Student 인스턴스 주소를 저장한다.
		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();

		// 3) 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
		init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
		init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
		init(arr[2], "유관순", "yoo@test.com", "111-1113", 40, true);

		// 4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
		for (Student student : arr) {
			printStudent(student);
		}

	}

	static void init(Student student, String name, String email, String tel, int age, boolean working) {
		student.name = name;
		student.email = email;
		student.tel = tel;
		student.age = age;
		student.working = working;
	}
}
