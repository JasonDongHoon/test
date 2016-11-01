package bitcamp.java89.ems;

import java.util.Scanner;

public class LectureController {
	private Lecture[] lectures = new Lecture[100];
	private int length = 0;
	private Scanner keyScan;

	public LectureController(Scanner keyScan) {
		this.keyScan = keyScan;
	}

	public void service() {
		loop: while (true) {
			System.out.print("강좌관리> ");
			String command = keyScan.nextLine().toLowerCase();

			switch (command) {
			case "add": this.doAdd(); break;
			case "list": this.doList(); break;
			case "view": this.doView(); break;
			case "delete": this.doDelete(); break;
			case "update": this.doUpdate(); break;
			case "main": break loop;
			default: System.out.println("지원하지 않는 명령어 입니다.");

			}
		}
	}

	private void doAdd() {

		while (length < this.lectures.length) {
			Lecture lecture = new Lecture();

			System.out.print("강좌명(Java & DB 양성과정)");
			lecture.course = this.keyScan.nextLine();

			System.out.print("시작일(2016.10.10)");
			lecture.period = this.keyScan.nextLine();

			System.out.print("시간(09~18)");
			lecture.time = this.keyScan.nextLine();

			System.out.print("장소(서초구 서초동)");
			lecture.place = this.keyScan.nextLine();

			System.out.print("비용(2,000,000)");
			lecture.cost = Integer.parseInt(this.keyScan.nextLine());

			System.out.print("결제방법(Cash or Card)");
			lecture.method = this.keyScan.nextLine();

			this.lectures[length++] = lecture;

			System.out.print("계속 입력할래요?(y/n)?");
			if (!this.keyScan.nextLine().equals("y"))
				break;
		}
	}

	private void doList() {

		for (int i = 0; i < this.length; i++) {
			Lecture lecture = this.lectures[i];
			System.out.printf("%s,%s,%s,%s,%d,%s\n", lecture.course, lecture.period,
			lecture.time, lecture.place, lecture.cost, lecture.method);

		}
	}

	private void doView() {
		System.out.print("조회할 사용자는??");
		String course = this.keyScan.nextLine().toLowerCase();
		for (int i = 0; i < this.length; i++) {
			if (this.lectures[i].course.toLowerCase().equals(course)) {
				System.out.printf("강좌명: %s\n", this.lectures[i].course);
				System.out.printf("암호: (****)\n");
				System.out.printf("시작일: %s\n", this.lectures[i].period);
				System.out.printf("시간: %s\n", this.lectures[i].time);
				System.out.printf("장소: %s\n", this.lectures[i].place);
				System.out.printf("비용: %d\n", this.lectures[i].cost);
				System.out.printf("결제방법: %s\n", this.lectures[i].method);
				break;
			}

		}
	}

	private void doDelete() {
		System.out.print("삭제할 사용자는??");
		String course = this.keyScan.nextLine().toLowerCase();

		for (int i = 0; i < this.length; i++) {
			if (this.lectures[i].course.toLowerCase().equals(course)) {
				for (int x = i + 1; x < length; x++, i++) {
					this.lectures[i] = this.lectures[x];
				}
				this.lectures[--length] = null;
				System.out.printf("%s 학생 정보를 삭제하였습니다.\n", this.lectures[i].course);
				return;
			}
			System.out.printf("%s 학생이 없습니다.\n", course);
		}
	}

	private void doUpdate() {
		while (length < this.lectures.length) {
			Lecture lecture = new Lecture();

			System.out.print("변경할 사용자는??");
			String course = this.keyScan.nextLine().toLowerCase();

			System.out.print("시작일(2016.10.10)");
			lecture.period = this.keyScan.nextLine();

			System.out.print("시간(09~18)");
			lecture.time = this.keyScan.nextLine();

			System.out.print("장소(서초구 서초동)");
			lecture.place = this.keyScan.nextLine();

			System.out.print("비용(2,000,000)");
			lecture.cost = Integer.parseInt(this.keyScan.nextLine());

			System.out.print("결제방법(Cash or Card)");
			lecture.method = this.keyScan.nextLine();

			this.lectures[length++] = lecture;

			System.out.print("저장하시겠습니까(y/n)?");
			if (!this.keyScan.nextLine().equals("y")) {
				System.out.print("저장하였습니다.\n");
				break;
			} else {
				System.out.print("변경을 취소하였습니다.\n");
				break;

			}

		}

	}
}
