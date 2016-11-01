package test02; // 

// 2016년 10월 21일 금요일
public class Exam001 {
	public static void main(String[] args) {

		String s1; // 문자열이 저장된 메모리의 주소를 저장할 변수. 레퍼런스
		s1 = new String("홍길동");
		System.out.println(s1);
	}
}



/*
 * 문자 3개를 저장할 char 배열을 만들고 그 배열에 문자 코드를 저장한다.
 * 또한 length 메모리에 문자 개수를 저장한다.
 * 그리고 이 메모리의 주소를 리턴한다. s1에 문자열이 저장된 메모리의 주소가 들어있다.
 * 주소를 알고 싶어요? 답 : 자바는 알려주지 않는다.
 */
