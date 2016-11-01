// 주제 : 객체지향 - 오버로딩 규칙
package step08;

// 2016년 10월 25일 화요일

public class Exam060_5 {

  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;


    Book() {}

    Book(String title) {
      System.out.println("Book(String) 호출");
    }

    Book(String title, String author) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.author = author;
    }

    Book(String title, String press) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.press = press;
    }

    Book(String title, String press, int price) {
      System.out.println("Book(String,String,int) 호출");
      this.title = title;
      this.author = press;
      this.price = price;
    }
  }

  public static void main(String[] args) {

    Book b1 = new Book("자바 프로그래밍", "홍길동");
    Book b2 = new Book("자바 프로그래밍", "비트출판사");


 }
}
