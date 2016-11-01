package test02; // 사용자 정의 타입의 인스턴스 - 응용4

//메서드를 역할에 따라 적절히 분류하여 유지보수 좋게한다. 관련있는 메서드 들은 서로 묶어놓는 것이 유지 보수에 좋다.

// 2016년 10월 24일 월요일
public class Exam16 {
	static void printStudent(Student student) {
		System.out.printf("%s,%s,%s,%d,%b\n", student.name, student.email, student.tel, student.age, student.working);
	}

	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();

		init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
		init(arr[1], "임꺽정", "Leem@test.com", "111-1112", 30, false);
		init(arr[2], "유관순", "Yoo@test.com", "111-1113", 40, true);

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