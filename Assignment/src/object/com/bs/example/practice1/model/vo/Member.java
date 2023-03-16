package object.com.bs.example.practice1.model.vo;

public class Member {
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
		this.memberld = "admin";
		this.memberPwd = "1234";
		this.memberName = "에드";
		this.age = 30;
		this.gender = '남';
		this.phone = "010000000000";
		this.email = "abcd@naver.com";
	}
	
	// get & set 설정
	public String getMemberld() {
		return memberld;
	}

	public void setMemberld(String memberld) {
		this.memberld = memberld;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// 메소드
	public void changeName(String name) {
		setMemberName(name);
	}
	
	public void printName() {
		System.out.println(getMemberld() + " " + getMemberPwd() + " " + getMemberName() + " " + getAge() + " " + getGender() + " " + 
	getPhone() + " " + getEmail());
	}
}
