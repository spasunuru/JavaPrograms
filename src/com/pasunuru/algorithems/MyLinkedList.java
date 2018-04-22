package com.pasunuru.algorithems;

class Link {

	public int iData;
	public Link next;

	public Link(int id) {
		iData = id;
	}

	public void displayLink() {
		System.out.print("{" + iData + "} ");
	}
}

public class MyLinkedList {

	private Link first; 
	
	public MyLinkedList() {
		first = null; 
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id) { 
		Link newLink = new Link(id);
		newLink.next = first; 
		first = newLink; 
	}

	public Link deleteFirst() 
	{ 
		Link temp = first; 
		first = first.next; 
		return temp; 
	}
	
	public void reverse(Link first) {
		Link current, prev, next;
		current = first;
		prev = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first = prev;
	}
	
	public Link swap(Link first) {
		Link p, q, newStart, temp;
		p = first;
		newStart = p.next;

		while (true) {
			q = p.next;
			temp = q.next;
			q.next = p;
			if (temp == null || temp.next == null) {
				p.next = null;
				break;
			}
			p.next = temp.next;
			p = temp;
		}
		return newStart;
	}
		

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; 
		while (current != null) {
			current.displayLink(); 
			current = current.next; 
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		MyLinkedList theList = new MyLinkedList(); // make new list

		theList.insertFirst(22); // insert four items
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);

		theList.displayList(); 

		while (!theList.isEmpty()) 
		{
			Link aLink = theList.deleteFirst(); 
			System.out.print("Deleted "); 
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList(); 
	} 
} 