package test;

/*문제
1) 숫자를 입력받아서 홀수 개수와 짝수 개수를 센다.
   예) java Test02 1 5 6 6 8 7 4
출력 예:
짝수: 4
홀수: 3
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
	
	System.out.printf("짝수 : %d개\n", eventnum);
	System.out.printf("홀수 : %d개\n", oddnumber);
}
}

