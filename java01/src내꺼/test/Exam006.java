package test;
// 2016.10.18 화요일

public class Exam006 {

static class Book_Informations {
    String title;
    int pageSize;
    String publisher;
    String language;
    String isbn;
    String[] authors;
    float width;
    float height;
    float thick;
    double price;
    boolean dvd;
  }
    public static void main(String[] args) {

    Book_Informations b1 = new Book_Informations();
      b1.title = "자바 프로그래밍";
      b1.pageSize = 783;
      b1.publisher = "비트출판사";
      b1.language = "Korean";
      b1.isbn = "11-123-11";
      b1.authors = new String[] {"홍길동", "임꺽정"};
      b1.width = 7.4f;
      b1.height = 9.1f;
      b1.thick = 1.6f;
      b1.price = 1234.56;
      b1.dvd = false;

    System.out.println(b1.title);
    System.out.println(b1.pageSize);
    System.out.println(b1.publisher);
    System.out.println(b1.language);
    System.out.println(b1.isbn);
    System.out.println(b1.authors[0] + ", "+ b1.authors[1]);
    System.out.println(b1.width);
    System.out.println(b1.height);
    System.out.println(b1.thick);
    System.out.println(b1.price);
    System.out.println(b1.dvd);

  }
}
