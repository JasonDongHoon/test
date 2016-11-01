package step07;

import java.util.Scanner;

public class EduApp_0 {
	public static void main(String[] args) {
		System.out.println("비트캠프 관리시스템에 오신걸 환영합니다!!");

		Scanner keyScan = new Scanner(System.in);

		S s1 = new S();
		System.out.print("아이디는?");
		s1.id = keyScan.nextLine();
		System.out.print("암호는?");
		s1.pwd = keyScan.nextLine();
		System.out.print("이름은?");
		s1.name = keyScan.nextLine();
		System.out.print("전화는?");
		s1.tel = keyScan.nextLine();
		System.out.print("이메일은?");
		s1.email = keyScan.nextLine();
		System.out.print("재직중?");
		s1.working = (keyScan.nextLine().equals("y")) ? true : false;
		System.out.print("태어난해는?");
		s1.birth = Integer.parseInt(keyScan.nextLine());
		System.out.print("최종학교는?");
		s1.school = keyScan.nextLine();
		
		System.out.printf("아이디 : %s\n", s1.id);
		System.out.printf("암호 : %s\n", s1.pwd);
		System.out.printf("이름 : %s\n", s1.name);
		System.out.printf("전화 : %s\n", s1.tel);
		System.out.printf("이메일 : %s\n", s1.email);
		System.out.printf("재직여부 : %b\n", s1.working);
		System.out.printf("태어난해 : %d\n", s1.birth);
		System.out.printf("최종학교 : %s\n", s1.school);
		
	}
}