package test; // �ڡڡ�

// 2016�� 10�� 21�� �ݿ���
public class Exam061 {
//1) ���ϰ�(x), �Ķ����(x)
static void m1() {}

//2) ���ϰ�(x), �Ķ����(o)
static void m2(int a, String b, float[] f) {}

//3) ���ϰ�(o), �Ķ����(x)
static int m3() {return 100;}

//4) ���ϰ�(o), �Ķ����(o)
static int m4(int a, float b) {return (int)(a * b);}

	public static void main(String[] args) {
		
		
	}

}

/* ����Ÿ��
	ex) void(�������), int, long, String, int[], Strint[]...
	�޼���� : �޼��带 ������ �� ����� �̸�
	ex) �޼����();  int value = �޼����();
	�Ķ���� ���� : �޼��带 ȣ���� �� �Ѱ��� ���� �޴� ����
	ex) �޼����(inta, int b, String[] args */

