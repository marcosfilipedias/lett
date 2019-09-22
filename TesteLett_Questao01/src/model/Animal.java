package model;

public abstract class Animal {

	private int age;
	private float size;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public abstract void song();
	
	public Animal(int age, float size) {
		this.setAge(age);
		this.setSize(size);
	}
}
