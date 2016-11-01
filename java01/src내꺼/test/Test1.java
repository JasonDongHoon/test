package test;

public class Test1 {
	public static void main(String[] args) {

			int age = Integer.parseInt(args[0]);
			
			if (age < 8) {
				System.out.println("유아");
			} else if (age >= 8 && age < 14) {
				System.out.println("어린이");
			} else if (age >= 14 && age <19) {
				System.out.println("청소년");
			} else if (age >= 19 && age <40) {
				System.out.println("청년");
			} else if (age >= 40 && age <60) {
				System.out.println("중년");
			} else {
				System.out.println("노인");
			}
			
	}
}