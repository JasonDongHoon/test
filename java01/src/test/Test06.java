package test;
/*����
1) ����(�� -21�� ~ +21��)�� �Է¹޾Ƽ�
  ��ǻ�Ϳ��� ������ ������ �� �� �����ϰ� �ִ� �� �����
   ��) java Test02 1566874
��� ��:
����: 6
����: 2

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

    System.out.printf("����: %d\n", randomNum);
    System.out.printf("���� ����: %d\n", count);
  }
}

/*
# Math.random()
- 0 <= x < 1
- x�� �ε��Ҽ����̴�.
- ��)
0.007654
0.23675
0.09945
0.1278432
*/
