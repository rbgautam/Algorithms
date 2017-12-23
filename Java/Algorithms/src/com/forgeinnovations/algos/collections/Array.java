package com.forgeinnovations.algos.collections;

import com.forgeinnovations.data.model.Student;

public class Array {
	
	Student[] students = new Student[5];
	
	public Array() {
		
		students[0] =  new Student("Maya",24);
		students[1] = new Student("Jamila", 26);
		students[2] =  new Student("Paki",30);
		students[3] = new Student("Delo", 29);
		students[4] =  new Student("Fluffy",27);
		
	}

	public Student[] getStudents() {
		return students;
	}
	
	
	public void displayStudents() {
		
		for (Student student : students) {
			String formattedName = student.toString();
			System.out.println(formattedName);
		}		
	}
	
	
	
}
