package test;
// 2016.10.18 화요일

public class Exam012 {

  public static void main(String[] args) {
    int a = 10;  //11
    a++;
    System.out.println(a);

    int b = 10;  //10
    System.out.println(b++);

    int c = 10;
    int result = c++;
    System.out.printf("a=%d, result=%d\n", a, result);

    int d=10;
    d=d++;
    System.out.println(d);
  }
}
