package com.forgeinnovations.data.model;

public class Student implements Comparable<Student>{
	
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
//		if(this.name.equals(o.name))
//			return 0;
		if(this.age==o.age )
			return 0;
		if(this.age>=o.age )
			return 1;
		if(this.age<o.age )
			return -1;
		
		return 0;
	}

	

}
