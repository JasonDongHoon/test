package test02; // 사용자 정의 타입의 인스턴스

// 2016년 10월 24일 월요일
public class Exam013 {
	// 1) 레퍼런스 변수 3개 준비
	public static void main(String[] args) {
		Student[] arr = new Student[3]; // 레퍼런스 배열을 3개 준비한다.
										// Student 인스턴스가 아니다.
										// Student s1, s2, s3; 와 같은 의미다.

		// 2) 각 레퍼런스 변수에 Student 인스턴스 주소를 저장한다.
		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();

		// 3) 각 배열 레퍼런스를 통해 인스턴스에 값을 저장한다.
		arr[0].name = "홍길동";
		arr[0].email = "hong@test.com";
		arr[0].tel = "111-1111";
		arr[0].age = 20;
		arr[0].working = true;

		arr[1].name = "임꺽정";
		arr[1].email = "leem@test.com";
		arr[1].tel = "111-1112";
		arr[1].age = 30;
		arr[1].working = false;

		arr[2].name = "유관순";
		arr[2].email = "yoo@test.com";
		arr[2].tel = "111-1113";
		arr[2].age = 40;
		arr[2].working = true;

		// 4) 각 배열 레퍼런스가 가리키는 인스턴스의 값을 출력한다.
		System.out.printf("%s,%s,%s,%d,%b\n", arr[0].name, arr[0].email, arr[0].tel, arr[0].age, arr[0].working);
		System.out.printf("%s,%s,%s,%d,%b\n", arr[1].name, arr[1].email, arr[1].tel, arr[1].age, arr[1].working);
		System.out.printf("%s,%s,%s,%d,%b\n", arr[2].name, arr[2].email, arr[2].tel, arr[2].age, arr[2].working);

	}
}