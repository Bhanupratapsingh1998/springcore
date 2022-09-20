package com.springcore.ci;

public class person {
	private int personId;
	private String name;
	private Certificate certi;

	public person(int personId, String name, Certificate certi) {
		super();
		this.personId = personId;
		this.name = name;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "person [personId=" + personId + ", name=" + name + ", certi=" + certi + "]";
	}

}
