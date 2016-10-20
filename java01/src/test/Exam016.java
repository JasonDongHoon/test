package test;
// 2016.10.19 수요일

public class Exam016 {

  public static void main(String[] args) {

    boolean a = false;
    boolean b = true;
    boolean c = a && (b = false); //앞의 값에 따라 뒤의 명령을 계속 수행할지 결정한다.
                                  //만약 앞의 값이 false이면 이미 결론이 false이기 때문에
                                  //다음 명령을 수행하지 않는다.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

    System.out.println("------------------------");

    a = false;
    b = true;
    c = a & (b = false); // 앞의 값과 상관없이 무조건 끝까지 모든 명령을 실행한다.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);
    System.out.println("------------------------");

    a = true;
    b = true;
    c = a || (b = false); // 앞의 값과 상관없이 무조건 끝까지 모든 명령을 실행한다.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);
    System.out.println("------------------------");

    a = true;
    b = true;
    c = a | (b = false); // 앞의 값과 상관없이 무조건 끝까지 모든 명령을 실행한다.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

  }
}
