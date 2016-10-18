package step03;

public class Exam023 {
  public static void main(String[] args) {
    char v1 = 0x41;  //A
    char v2 = 0xAC00; //가
    char v3 = 0x31; //1
    char v4 = '공'; //공 유니코드값

    System.out.printf("v1 = %c\n", v1);
    System.out.printf("v2 = %c\n", v2);
    System.out.printf("v3 = %c\n", v3);
    System.out.printf("v4 = %c\n", v4);
    System.out.printf("v4 = %d\n", (int)v4); //공의 유니코드값(숫자) 44277

  }
}
