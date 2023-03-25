package com.bs.practice.dog_cat.controller;

import com.bs.practice.dog_cat.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		animals[0] = new Cat("야옹이", "고양이", "동제집", "노랑");
		animals[1] = new Dog("멍멍이", "강아지", 6);
		animals[2] = new Cat("고등어", "고양이", "동제집", "회색");
		animals[3] = new Dog("흰둥이", "강아지", 4);
		animals[4] = new Cat("삼색이", "고양이", "동제집", "삼색");
		
		for(Animal a : animals) {
			if(a instanceof Dog) {
				((Dog)a).speak();
			} else if(a instanceof Cat) {
				((Cat)a).speak();
			}
		}
	}
}
