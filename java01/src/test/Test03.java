package test;
/*����
1) ����(�� -21�� ~ +21��)�� �Է¹޾Ƽ� �� ���ڿ� ���Ե� Ȧ���� ¦���� ����.
   ��) java Test02 1566874
��� ��:
¦��: 4
Ȧ��: 3

��Ʈ: /, % �����ڸ� Ȱ���϶�!
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

    System.out.printf("¦��: %d��\n", evenCount);
    System.out.printf("Ȧ��: %d��\n", oddCount);
  }
}
