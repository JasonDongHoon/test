<<<<<<< HEAD

public class StudentSelector {

	public static void main(String[] args) throws Exception {
		String[] students = { "이석환", "김용진", "지정훈", "정용창", "한동은", "이성복", "김보라", "박수희", "민경기", "김지환", "서동훈", "정선교", "김재녕",
				"유신애", "정지연", "한옥주", "신종우", "천지연", "김희경", "김우종", "하세훈", "오용석", "남경훈", "원요엘", "김건우", "김지연" };

		int count = (int) (Math.random() * 26);
		int no = 0;
		while (count-- > 0) {
			no = (int) (Math.random() * 26);
			System.out.print(".");
			Thread.currentThread().sleep(300);
		}

		System.out.println(students[no]);

	}
=======
public class StudentSelector {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "이석환", "김용진", "지정훈", "정용창", "한동은", "이성복",
      "김보라", "박수희", "민경기", "김지환", "서동훈", "정선교",
      "김재녕", "유신애", "정지연", "한옥주", "황지현", "신종우",
      "천지연", "김희경", "김우종", "하세훈", "오용석", "남경훈",
      "원요엘", "김건우", "김지연"
    };

    int count = (int)(Math.random() * 27);
    int no = 0;
    while (count-- > 0) {
      no = (int)(Math.random() * 27);
      System.out.print(".");
      Thread.currentThread().sleep(300);
    }

    System.out.println(students[no]);

  }
>>>>>>> cd5543667aa0c9ebe1d49b2620dd4dcd64ab8f96
}
