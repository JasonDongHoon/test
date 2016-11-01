package test02; // 

//메서드를 역할에 따라 적절히 분류하여 유지보수 좋게한다. 관련있는 메서드 들은 서로 묶어놓는 것이 유지 보수에 좋다.

// 2016년 10월 24일 월요일
public class Exam018 {
	public static void main(String[] args) {
		Student[] arr = new Student[3];

		arr[0] = new Student("홍길동", "hong-test.com", "111-1111", 20, true);
		arr[1] = new Student("임꺽정", "leem-test.com", "111-1112", 30, false);
		arr[2] = new Student("유관순", "yoo-test.com", "111-1113", 40, true);

		for (Student student : arr) {
			student.printStudent(student);
		}

	}
}