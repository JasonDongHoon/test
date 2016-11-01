package realtest;

/*문제
1) 숫자를 입력 받아서 그 중 가장 큰 수와 가장 작은 수를 찾아라!
   예) java Test02 278 34 12 1980 22 6
출력 예:
가장 큰 수: 1980
가장 작은 수: 6

힌트: /, % 연산자를 활용하라!
*/
public class Test04 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int maxNum = num,
        minNum = num;

    for (int i = 1; i < args.length; i++) {
      num = Integer.parseInt(args[i]);
      if (num > maxNum)
        maxNum = num;
      if (num < minNum)
        minNum = num;
    }

    System.out.printf("가장 큰 수: %d\n", maxNum);
    System.out.printf("가장 작은 수: %d\n", minNum);
  }
}
