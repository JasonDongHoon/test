package step03;

public class Exam030 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[] {100,90,80};
    System.out.println(scores[0]);

    int[] scores2 = {90,80,70};
    System.out.println(scores2[0]);

    /*int[] scores3  이건 컴파일 오류가 난다.
    scores3 = {80,70,60}; 변수 선언 후 초기화 할때 변수명을 한번 더 적어야함.
    System.out.println(scores3[0]);*/
  }
}
