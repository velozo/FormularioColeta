package br.com.petrobras;

public class Person {

	private String name = "João";

	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
