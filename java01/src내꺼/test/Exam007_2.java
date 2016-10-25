package test;
// 2016.10.18 화요일

public class Exam007_2 {

static class Product {
    String name;
    String maker;
    String description; //가능한 길게 적는 것이 좋다.
    int price;
    int quantity;
    boolean used;


  }
    public static void main(String[] args) {
      Product n1 = new Product();

      n1.name = "아이폰";
      n1.maker = "애플";
      n1.description = "스마트폰";
      n1.price = 700000;
      n1.quantity = 120;
      n1.used = false;

    System.out.println(n1.name);
    System.out.println(n1.maker);
    System.out.println(n1.description);
    System.out.println(n1.price);
    System.out.println(n1.quantity);
    System.out.println(n1.used);

  }
}
