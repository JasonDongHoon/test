package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam039 {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		// int age = 15;

		if (age < 8)
			System.out.println("�����Դϴ�.");
		else 
			if (age >= 8 && age < 14)
				System.out.println("����Դϴ�.");
			else 
				if (age >= 14 && age < 19)
					System.out.println("û�ҳ��Դϴ�.");
				else 
					if (age >= 19 && age < 40)
						System.out.println("û���Դϴ�.");
					else 
						if (age >= 40 && age < 60)
							System.out.println("�߳��Դϴ�.");
						else
							System.out.println("�����Դϴ�.");
					
				
			

		

	}
}
