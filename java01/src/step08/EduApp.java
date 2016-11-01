package step08;

import java.util.Scanner;

public class EduApp {
	static Scanner keyScan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

		loop: while (true) {
			System.out.print("명령> ");
			String command = SC.keyScan.nextLine().toLowerCase();

			switch (command) {
			case "add": SC.doAdd(); break;
			case "list": SC.printSL(s1s, length); break;
			case "view": SC.doView(); break;
			case "quit": System.out.println("Good bye!"); break loop;
			default: System.out.println("지원하지 않는 명령어 입니다.");
			}
		
		
		static void doAdd() {
			while (length < s1s.length) {
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
				System.out.print("테어난 해는?");
				s1.birth = Integer.parseInt(keyScan.nextLine());
				System.out.print("최종학교는?");
				s1.school = keyScan.nextLine();

				s1s[length++] = s1;

				System.out.print("계속 입력하시겠습니까(y/n)?");
				if (!keyScan.nextLine().equals("y"))
					break;

			}

		}
		

	static void printSL(S[] s1s, int length) {
		for (int i = 0; i < length; i++) {
			S s1 = s1s[i];
			System.out.printf("%s,%s,%s,%s,%s,%s,%d,%s\n", s1.id, s1.pwd, s1.name, s1.tel, s1.email,
					((s1.working) ? "Yes" : "No"), s1.birth, s1.school);
		}
	}
}
