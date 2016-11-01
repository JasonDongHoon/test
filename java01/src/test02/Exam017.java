package test02; // 사용자 정의 타입의 인스턴스 - 응용5

//메서드를 이용하여 객체를 초기화한다!!

// 2016년 10월 24일 월요일
public class Exam017 {
	// 1) 레퍼런스 변수 3개 준비

	static void printStudent(Student student) {
		System.out.printf("%s,%s,%s,%d,%b\n", student.name, student.email, student.tel, student.age, student.working);

	}

	public static void main(String[] args) {
		Student[] arr = new Student[3]; // 레퍼런스 배열을 3개 준비한다.
										// Student 인스턴스가 아니다.
										// Student s1, s2, s3; 와 같은 의미다.

		// 2) 각 레퍼런스 변수에 Student 인스턴스 주소ㅎ 를 저장한다.
		arr[0] = new Student2();
		arr[1] = new Student2();
		arr[2] = new Student2();

		// 3) 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
		Student2.init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
		Student2.init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
		Student2.init(arr[2], "유관순", "yoo@test.com", "111-1113", 40, true);

		// 4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
		for (Student student : arr) {
			Student2.printStudent(student);
		}

	}

for(student3 student:arr){
	student
	}

}

/* 인스턴스와 매서드
인스턴스란 클래스 설계도에 따라 준비한 메모리를 말한다.
어떤 메모리? 변수 선언 메모리.
주의!!! 메서드는 인스턴스 만들 때 함께 만들어지는 것이 아니다.
메서드는 메서드 Area 영역에 존재한다. 왜? 명령이기 때문이다.*/

