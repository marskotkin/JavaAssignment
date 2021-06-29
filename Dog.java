package com.tts;

public class Dog {
	
	private String name; 
	private int age; 
	private String breed; 
	
	public Dog() {
		
	}
	
	public Dog(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public Dog(String name, int age, String breed) {
		this.name = name; 
		this.age = age; 
		this.location = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setLBreed(String breed) {
		this.breed = breed;
	}
	
	public boolean isBrown() {
		return true; 
	}
	
	public String chocolate() {
		return "This labrador retriever is a chocolate lab!";
	}
	
	public String deliverPresents(String list) {
		//there is now a variable called list, that exists in this code
		return list;
		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Ranger", 6, "Labrador Retriever");
		System.out.println(dog.barkPresents("woof"));
		//String list = "woof";
	}
}
