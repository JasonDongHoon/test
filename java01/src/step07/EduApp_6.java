package step07;

import java.util.Scanner;

public class EduApp_5 {
	static Scanner keyScan = new Scanner(System.in);
		
	public static void main(String[] args) {
		SController sController = new SController(keyScan);
		System.out.println("비트캠프 관리시스템에 오신걸 환영합니다!!");


		loop: while (true) {
			System.out.print("명령> ");
			String command = keyScan.nextLine().toLowerCase();

			switch (command) {
			case "add": sController.doAdd(); break;
			case "list": sController.doList(); break;
			case "view": sController.doView(); break;
			case "delete": sController.doDelete(); break;
			case "update": sController.doUpdate(); break;
			case "quit": System.out.println("Good bye!"); break loop;
			default: System.out.println("지원하지 않는 명령어 입니다.");
	}
	}

	}

}