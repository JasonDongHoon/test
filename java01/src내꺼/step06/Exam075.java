package step06;

public class Exam075 {
  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);
    char[] chars = args[1].toCharArray();

    System.out.println(value);
    System.out.println("--------------");
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
  }
}
