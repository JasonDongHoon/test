package step06;

public class Exam076 {
  public static void main(String[] args) {
    String s = "circleOFNumbers";
    System.out.println(s);
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());

    char[] chars = s.toUpperCase().toCharArray();
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
  }
}
