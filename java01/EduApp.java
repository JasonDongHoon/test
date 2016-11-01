package bitcamp.java89.ems;

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
			case "menu": doMenu(); break;
		 	case "go 1": lectureController.service(); break;
			case "quit": System.out.println("Good bye!!"); break loop;
			default: System.out.println("지원하지 않는 명령어 입니다.");

			}
		}

	}
	static void doMenu() {
		System.out.println("[메뉴]");
		System.out.println("1. 학생관리");
		System.out.print("메뉴 이동은 'go 메뉴번호'를 입력하세요.");
	}




}
