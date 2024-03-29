package com.bs.practice.dog_cat.model.vo;

public class Dog extends Animal {
	public final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}
	
	@Override
	public void speak() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return super.toString() + " 몸무게는 " + weight + "입니다.";
	}
}
