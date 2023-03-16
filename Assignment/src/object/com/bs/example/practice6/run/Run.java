package object.com.bs.example.practice6.run;

import object.com.bs.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book("데미안", "교보문고", "헤르만헤세");
		Book b2 = new Book("아낌없이 주는 나무", "교보문고", "셸 실버스타인", 5000, 5);
		
		b1.inform();
		b2.inform();
	}
}
