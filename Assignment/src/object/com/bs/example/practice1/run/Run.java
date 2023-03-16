package object.com.bs.example.practice1.run;

import object.com.bs.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member mb = new Member();
		
		mb.changeName("동제맴버");
		mb.printName();
	}
}
