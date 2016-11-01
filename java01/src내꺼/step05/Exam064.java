package step05;

public class Exam064 {
  public static void main(String[] args) {
    int level = Integer.parseInt(args[0]);

    switch (level) {
    case 0:
      System.out.println("손님");
    case 1:
      System.out.println("회원");
    case 9:
      System.out.println("관리자");
    default:
      System.out.println("권한이 없습니다.");
    }

  }
}
