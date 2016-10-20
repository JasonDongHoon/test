package realtest;

/*문제
1) 숫자를 입력받아서 홀수 개수와 짝수 개수를 센다.
   예) java Test02 1 5 6 6 8 7 4
출력 예:
짝수: 4
홀수: 3
*/
public class Test02 {
  public static void main(String[] args) {
    int num = 0;
    int eventCount = 0, oddCount = 0;

    for (int i = 0; i < args.length; i++) {
      num = Integer.parseInt(args[i]);
      if (num % 2 == 0)
        eventCount++;
      else
        oddCount++;
    }

    System.out.printf("짝수: %d\n", eventCount);
    System.out.printf("홀수: %d\n", oddCount);
  }
}
