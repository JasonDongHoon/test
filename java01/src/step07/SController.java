package step07;

import java.util.Scanner;

public class SController {
	S[] s1s = new S[100];
	int length = 0;
	Scanner keyScan;

	public SController(Scanner keyScan) {
		this.keyScan = keyScan;
	}

	public void doAdd() {
		while (length < this.s1s.length) {
			S s1 = new S();
			System.out.print("아이디는?");
			s1.id = this.keyScan.nextLine();
			System.out.print("암호는?");
			s1.pwd = this.keyScan.nextLine();
			System.out.print("이름은?");
			s1.name = this.keyScan.nextLine();
			System.out.print("전화는?");
			s1.tel = this.keyScan.nextLine();
			System.out.print("이메일은?");
			s1.email = this.keyScan.nextLine();
			System.out.print("재직중?(y/n)");
			s1.working = (this.keyScan.nextLine().equals("y")) ? true : false;
			System.out.print("태어난해는?");
			s1.birth = Integer.parseInt(this.keyScan.nextLine());
			System.out.print("최종학교는?");
			s1.school = this.keyScan.nextLine();

			this.s1s[this.length++] = s1;

			System.out.print("계속 입력하시겠습니까(y/n)?");
			if (!this.keyScan.nextLine().equals("y"))
				break;
		}
	}

	void doList() {
		for (int i = 0; i < this.length; i++) {
			S s1 = this.s1s[i];
			System.out.printf("%s,%s,%s,%s,%s,%s%d,%s\n", s1.id, s1.pwd, s1.name, s1.tel, s1.email,
					((s1.working) ? "Yes" : "No"), s1.birth, s1.school);
		}
	}

	void doView() {
		System.out.print("조회할 학생의 아이디는?");
		String id = this.keyScan.nextLine().toLowerCase();
		for (int i = 0; i < this.length; i++) {
			if (this.s1s[i].id.toLowerCase().equals(id)) {
				System.out.printf("아이디 : %s\n", this.s1s[i].id);
				System.out.printf("암호 : (****)\n");
				System.out.printf("이름 : %s\n", this.s1s[i].name);
				System.out.printf("전화 : %s\n", this.s1s[i].tel);
				System.out.printf("이메일 : %s\n", this.s1s[i].email);
				System.out.printf("재직중 : %s\n", this.s1s[i].working);
				System.out.printf("태어난해 : %d\n", this.s1s[i].birth);
				System.out.printf("최종학교 : %s\n", this.s1s[i].school);

			}
		}
	}

	public void doUpdate() {
	    System.out.print("변경할 학생의 아이디는? ");
	    String id = this.keyScan.nextLine().toLowerCase();
	    for (int i = 0; i < this.length; i++) {
	      if (this.s1s[i].id.toLowerCase().equals(id)) {
	        S s1 = new S();

	        s1.id = this.s1s[i].id;

	        System.out.print("암호(예:1111)? ");
	        s1.pwd = this.keyScan.nextLine();

	        System.out.print("이름은? ");
	        s1.name = this.keyScan.nextLine();

	        System.out.print("전화는? ");
	        s1.tel = this.keyScan.nextLine();

	        System.out.print("이메일은? ");
	        s1.email = this.keyScan.nextLine();

	        System.out.print("재직중임(y/n)? ");
	        s1.working = (this.keyScan.nextLine().equals("y")) ? true : false;

	        System.out.print("태어난 해는? ");
	        s1.birth = Integer.parseInt(this.keyScan.nextLine());

	        System.out.print("최종학교는? ");
	        s1.school = this.keyScan.nextLine();

	        System.out.print("저장하시겠습니까(y/n)? ");
	        if (keyScan.nextLine().toLowerCase().equals("y")) {
	          this.s1s[i] = s1;
	          System.out.println("저장하였습니다.");
	        } else {
	          System.out.println("변경을 취소하였습니다.");
	        }
	        return;
	      }
	    }
	    System.out.printf("%s 이라는 학생이 없습니다.", id);
	  }

	void doDelete() {
		System.out.print("삭제할 학생의 아이디는?");
		String id = this.keyScan.nextLine().toLowerCase();
		for (int i = 0; i < this.length; i++) {
			if (this.s1s[i].id.toLowerCase().equals(id)) {
				for (int x = i + 1; x < this.length; x++, i++) {
					this.s1s[i] = this.s1s[x];
				}
				this.s1s[--length] = null;

				System.out.printf("%s 학생 정보를 삭제하였습니다.\n", id);
				return;
			}

		}
		System.out.printf("%s 학생이 없습니다.\n", id);
	}
}
