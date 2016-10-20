package test;
/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서
  컴퓨터에서 생성한 난수를 몇 개 포함하고 있는 지 세어라
   예) java Test02 1566874
출력 예:
난수: 6
개수: 2

*/
public class Test06 {
  public static void main(String[] args) {
    int inputNum = Integer.parseInt(args[0]);
    int randomNum = (int)(Math.random() * 10);
    int count = 0;
    while (inputNum > 0) {
      if ((inputNum % 10) == randomNum)
        count++;
      inputNum /= 10;
    }

    System.out.printf("난수: %d\n", randomNum);
    System.out.printf("포함 개수: %d\n", count);
  }
}

/*
# Math.random()
- 0 <= x < 1
- x는 부동소수점이다.
- 예)
0.007654
0.23675
0.09945
0.1278432
*/
