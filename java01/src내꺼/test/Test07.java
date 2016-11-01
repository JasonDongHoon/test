package test;
/*문제
1) 밑변의 길이를 숫자를 입력 받아 직각 삼각형을 출력하라.
   예) java Test07 6
출력 예:
*
**
***
****
*****
******

*/


public class Test07 {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    for (int i = 1; i <= inputNum; i++) {
      for (int j = 0; j < i; j++)
        System.out.printf("*");
      System.out.println();
    }
  }
}
