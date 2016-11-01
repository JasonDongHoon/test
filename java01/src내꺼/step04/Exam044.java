package step04;

public class Exam044 {
  public static void main(String[] args) {
    int age = 19;
    System.out.printf("성인인가요? %s\n", (age >= 18) ? "예" : "아니오");

    System.out.printf("당신이 내야할 버스 요금은 %d입니다.\n",
      (age >= 18) ? 2500 : 1700);
  }
}
