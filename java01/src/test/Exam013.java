package test;
// 2016.10.18 화요일

public class Exam013 {

  public static void main(String[] args) {
    int a = 10;
    int result = a++ + a++ * a++ + a++;
    System.out.println(a);
    System.out.println(result);
  }
}
