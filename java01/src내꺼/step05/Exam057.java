package step05;

public class Exam057 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18) 
      System.out.println("미성년");
    else
      System.out.println("성년");

  }
}
