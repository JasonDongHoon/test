package realtest;

/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서 그 숫자 중에 최대 값과 최소 값을 찾아라!
   예) java Test02 1566874
출력 예:
최대 값: 8
최소 값: 1

*/
public class Test05 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int maxNum = num % 10,
        minNum = maxNum;
    num /= 10;
    int remainder = 0;
    while (num > 0) {
      remainder = num % 10;
      if (remainder > maxNum)
        maxNum = remainder;
      if (remainder < minNum)
        minNum = remainder;
      num /= 10;
    }

    System.out.printf("최대 값: %d\n", maxNum);
    System.out.printf("최소 값: %d\n", minNum);
  }
}
