package test;
// 2016.10.18 화요일

public class Exam004 {
  public static void main(String[] args) {

// 저자, 출판사, 출판일, 가격, 판매마켓, 도서 순위
// byte, short, int, char, boolean, double, float, String

    String title = "자바 프로그래밍";
    int pageSize = 783;
    String publisher = "비트출판사";
    String language = "Korean";
    String isbn = "11-123-11";
    String[] authors = {"홍길동", "임꺽정"};
    float width = 7.4f;
    float height = 9.1f;
    float thick = 1.6f;
    double price = 1234.56;
    boolean dvd = false;

    System.out.println(title);
    System.out.println(pageSize);
    System.out.println(publisher);
    System.out.println(language);
    System.out.println(isbn);
    System.out.println(authors[0] + ", " + authors[1]);
    System.out.println(width);
    System.out.println(height);
    System.out.println(thick);
    System.out.println(price);
    System.out.println(dvd);

  }
}
