package com.kunuma.visitor;

import java.util.ArrayList;
import java.util.List;

public class Home {

	private List<Animal> animals = new ArrayList<>();
	
	public void add(Animal animal) {
		animals.add(animal);
	}
	
	public void action(Person person) {
		for(Animal animal:animals) {
			animal.accept(person);
		}
	}
	
}
