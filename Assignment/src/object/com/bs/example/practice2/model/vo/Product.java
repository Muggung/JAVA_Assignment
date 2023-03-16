package object.com.bs.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		this.pName = "휴대폰";
		this.price = 450000;
		this.brand = "사성";
	}

	// get & set 설정
	public String getPname() {
		return pName;
	}

	public void setPname(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// 메소드 설정
	public void information() {
		System.out.println(getPname() + " " + getPrice() + " " + getBrand());
	}
}
