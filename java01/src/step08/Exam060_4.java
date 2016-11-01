// 주제 : 여러 개의 생성자 정의하기
package step08;

// 2016년 10월 25일 화요일

public class Exam060_4 {

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

    Book(String title, String press, int price) {
      System.out.println("Book(String,String,int) 호출");
      this.title = title;
      this.author = press;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("자바 프로그래밍");
    Book b3 = new Book("자바 프로그래밍", "홍길동");
    Book b4 = new Book("자바 프로그래밍", "비트출판사", 30000);
    



 }
}
