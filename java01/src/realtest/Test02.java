package realtest;
class Test02 {
  public static void main(String[] args) {
    String name = "홍길동";
    int age = 28;
    double height = 178.5;
    double weight = 85.2;
    String email = "hong@test.com";
    boolean isWorking = true;
    char englishLevel = 'B';
    String intro = "안녕하세요.\n개발자를 꿈꾸는 홍길동 입니다.\n다같이 열심히 해요";

    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
    System.out.printf("키: %.1f\n", height);
    System.out.printf("몸무게: %.1f\n", weight);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("직장인 여부: %b\n", isWorking);
    System.out.printf("영어 수준: %c\n", englishLevel);
    System.out.printf("자기 소개:");
    System.out.printf(intro);

  }
}
