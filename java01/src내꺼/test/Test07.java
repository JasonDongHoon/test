package test;
/*����
1) �غ��� ���̸� ���ڸ� �Է� �޾� ���� �ﰢ���� ����϶�.
   ��) java Test07 6
��� ��:
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
