package test;
// 2016.10.18 화요일

public class Exam007 {

static class NoteBook {
    String name;
    String software;
    float length;
    float height;
    float thick;
    int weight;
    String productor;
    String price;
    boolean usb;
  }
    public static void main(String[] args) {

    NoteBook n1 = new NoteBook();
      n1.name = "서피스 프로4";
      n1.software = "Microsoft Windows 10 pro";
      n1.length = 292.10f;
      n1.height = 201.42f;
      n1.thick = 8.45f;
      n1.weight = 786;
      n1.productor = "Microsoft";
      n1.price = "1,648,030원";
      n1.usb = false;

    System.out.println(n1.name);
    System.out.println(n1.software);
    System.out.println(n1.length);
    System.out.println(n1.height);
    System.out.println(n1.thick);
    System.out.println(n1.weight);
    System.out.println(n1.productor);
    System.out.println(n1.price);
    System.out.println(n1.usb);

  }
}
