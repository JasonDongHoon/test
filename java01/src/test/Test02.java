package test;

/*����
1) ���ڸ� �Է¹޾Ƽ� Ȧ�� ������ ¦�� ������ ����.
   ��) java Test02 1 5 6 6 8 7 4
��� ��:
¦��: 4
Ȧ��: 3
*/
public class Test02 {
	public static void main(String[] args) {
  	
int num = 0, eventnum = 0, oddnumber = 0;

for (int i = 0; i < args.length; i++) {
	System.out.println(args[i]);
	
	num = Integer.parseInt(args[i]);
	
	if (num % 2 == 0)
		eventnum++;
	else
		oddnumber++;
}
	
	System.out.printf("¦�� : %d��\n", eventnum);
	System.out.printf("Ȧ�� : %d��\n", oddnumber);
}
}

