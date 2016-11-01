package test;
// 2016.10.19 수요일

public class Exam027 {
  public static void main(String[] args) {
    int a = 0b1100; //12

    System.out.println(a >> 1);
    System.out.println(a >> 2);
    System.out.println(a >> 3);
    System.out.println(a >> 4);
    System.out.println(a >> 5);

    int b = -0b1100; //12
    System.out.println(b >>> 1);
    System.out.println(b >>> 2);
    System.out.println(b >>> 3);
    System.out.println(b >>> 4);
    System.out.println(b >>> 5);


  }
}
