package test;
/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서 그 숫자에 포함된 홀수와 짝수를 센다.
   예) java Test02 1566874
출력 예:
짝수: 4
홀수: 3

힌트: /, % 연산자를 활용하라!
*/
public class Test03 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int evenCount = 0, oddCount = 0;

    while (num > 0) {
      if (num % 2 == 0)
        evenCount++;
      else
        oddCount++;
      num /= 10;
    }

    System.out.printf("짝수: %d개\n", evenCount);
    System.out.printf("홀수: %d개\n", oddCount);
  }
}
