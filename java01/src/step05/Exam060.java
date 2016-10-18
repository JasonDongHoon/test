package step05;

public class Exam060 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18)
      System.out.println("미성년");
    else {
      if (age >= 18 && age < 50)
        System.out.println("성년");
      else {
        if (age >= 50 && age < 65)
          System.out.println("중년");
        else
          System.out.println("노인");
      }
    }
  }
}
