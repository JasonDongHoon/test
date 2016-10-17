public class Exam023 {
  public static void main(String[] args) {
    char v1 = 0x41;   // char 변수의 변수값을 진수로 쓰면 문자 유니코드를 표시한다. A
    char v2 = 0xAC00; // 가
    char v3 = 0x31;   // 0x31은 1, 0x32는 2를 출력한다. 왜지???
    char v4 = '공'; // 44277

    System.out.printf("v1 = %c\n", v1);
    System.out.printf("v2 = %c\n", v2);
    System.out.printf("v3 = %c\n", v3);
    System.out.printf("v4 = %c\n", v4);
    System.out.printf("v4 = %d\n", (int)v4);
    System.out.print("hello ");
    System.out.println("hi");
  }
}

/* %c는 코드(값)에 해당되는 문자를 찾아서 출력하라는 의미.
  System.out.print 함수는 다음에 오는 줄이 같은줄로 출력이 되게 함
  System.out.print \n은 쓸수없는 함수이며 문자는 System.out.println으로 한다
  단 System.out.printf 함수일 때는 \n으로써 줄 간격을 둘 수 있다.*/
