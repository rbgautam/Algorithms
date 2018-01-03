package com.forgeinnovations.algos.collections;

import com.forgeinnovations.data.model.Student;

public class LinkedList<T> {

	Node head = null;
	
	public LinkedList(){
	 head = new Node<T>(null);
	}

	public boolean append(T data) {
		try {
			Node n = head;
			Node newNode = new Node<T>(data);

			while (n.next != null) {
				n = n.next;
			}

			n.next = newNode;
			
		} catch (Exception e) {
			return false;
		}
		

		return true;
	}
	
	public boolean deleteNode(T compdata){
		Node n = head;
		Node prev = n;
		try {
			while(n.next != null){
				if(n.data!= null && n.data.equals(compdata))
				{
					prev.next = n.next;
					break;
				}
				prev = n;
				n = n.next;
			}
			
		} catch (Exception e) {
			return false;
		}
		
		return true;
		
	}
	
	
	
	public void printList(){
		Node n = head.next;
		
		while (n.next != null) {
			
			System.out.println(n.data.toString());
			n = n.next;
		}
		
		System.out.println(n.data.toString());
	}

	protected class Node<T> {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;

		}
	}
	
	
	//driver
	public static void main(String args[]){
		LinkedList<Student> studentList = new LinkedList<>();
		
		Student st = new Student("Bilal", 23);
		studentList.append(st);
		Student st1 = new Student("Maqsood", 24);
		studentList.append(st1);
		Student st2 = new Student("Bakram", 25);
		studentList.append(st2);
		
		studentList.printList();
		
		studentList.deleteNode(new Student("Bilal", 0));
		
		studentList.printList();
	}


}

