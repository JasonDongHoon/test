package step10;

public class Lecture {
	// 인스턴스 변수
	String course; // 명
	String period; // 기간
	String time; // 시간
	String place; // 장소
	int cost; // 비용
	String method; // 결제방법

	public Lecture() {}

	public Lecture(String course, String period, int cost, String method) {
		this.course = course;
		this.period = period;
		this.cost = cost;
		this.method = method;

	}

}
