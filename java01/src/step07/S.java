package step07;

public class S {

	String id;
	String pwd;
	String name;
	String email;
	String tel;
	boolean working;
	int birth;
	String school;
	
	public S() {}
	
	public S(String id, String pwd, String name, String tel, boolean working,
			int birth, String school) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.tel = tel;
		this.working = working;
		this.birth = birth;
		this.school = school;
	}
}