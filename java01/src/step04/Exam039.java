package step04;
//주제: 연산자 - 후위 증가/감소 연산자3

public class Exam039 {
  public static void main(String[] args) {
    int a = 20;
    int r = a++ + a++ + a++ + a++;
    System.out.printf("a=%d, r=%d\n", a, r);
    /* 분석
    r = a++ + a++ + a++ + a++
    1) r = 20 + a++ + a++ + a++
    2) a = a + 1 => a=21
    3) r = 20 + 21 + a++ + a++
    4) a = a + 1 => a=22
    5) r = 20 + 21 + 22 + a++
    6) a = a + 1 => a=23
    7) r = 20 + 21 + 22 + 23
    8) a = a + 1 => a=24
    9) r = 86
    */
  }
}

/*






*/
