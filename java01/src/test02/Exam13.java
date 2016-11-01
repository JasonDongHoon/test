package test02; // 사용자 정의 타입의 인스턴스

// 2016년 10월 24일 월요일
public class Exam13 {

	public static void main(String[] args) {
		Student[] arr = new Student[3];

		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();

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

		System.out.printf("%s,%s,%s,%d,%b\n", arr[0].name, arr[0].email, arr[0].tel, arr[0].age, arr[0].working);
		System.out.printf("%s,%s,%s,%d,%b\n", arr[1].name, arr[1].email, arr[1].tel, arr[1].age, arr[1].working);
		System.out.printf("%s,%s,%s,%d,%b\n", arr[2].name, arr[2].email, arr[2].tel, arr[2].age, arr[2].working);
	}
}