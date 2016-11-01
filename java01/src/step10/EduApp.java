package step10;

import java.util.Scanner;

public class EduApp {

	static Scanner keyScan = new Scanner(System.in);

	public static void main(String[] args) {
		LectureController lectureController = new LectureController(keyScan);
		
		System.out.println("비트캠프 관리시스템에 오신 것을 환영합니다!!");

		// 여러명의 학생 정보를 입력하기 위한 레퍼런스 배열을 만든다.

		loop: while (true) {
			System.out.print("명령> ");
			String command = keyScan.nextLine().toLowerCase();

			switch (command) {
			case "add": lectureController.doAdd(); break;
			case "list": lectureController.doList(); break;
			case "view": lectureController.doView(); break;
			case "delete": lectureController.doDelete(); break;
			case "update": lectureController.doUpdate(); break;
			case "quit": System.out.println("Good bye!!"); break loop;
			default: System.out.println("지원하지 않는 명령어 입니다.");

			}
		}

	}

	

		
	}


