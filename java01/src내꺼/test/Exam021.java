package test;
// 2016.10.19 수요일

public class Exam021 {
  public static void main(String[] args) {
    int a = 0b0110_1100;
    int b = 0b0011_0001;
    int c = a & b;



    c = a | b; // 0111_1101
    System.out.println(Integer.toString(a,2));
    System.out.println(Integer.toString(b));
    System.out.println(Integer.toString(c,2));
  }
}
