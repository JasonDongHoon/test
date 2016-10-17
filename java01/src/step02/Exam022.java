package step02;

public class Exam022 {
  public static void main(String[] args) {
    System.out.println(100); // 4바이트 메모리 차지
    System.out.println(1);  // 4바이트 메모리 차지
    System.out.println(100L); // 8바이트 메모리 차지
    System.out.println(1l); // 8바이트 메모리 차지

  }
}
