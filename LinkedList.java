package Linkedlist;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value=value;
		}
	}
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head=newNode;
		tail=newNode;
		length=1;
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void printHead() {
		System.out.println("Head: " + head.value);
	}
	
	public void printtail() {
		System.out.println("Tail: " + tail.value);
	}
	
	public void printLength() {
		System.out.println("Length: " + length);
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=tail.next;
		}
		length++;
	}
	
	public Node removeLast() {
		if(length==0) {
			return null;
		}
		Node temp=head;
		Node pre=head;
		while(temp.next!=null){
			pre=temp;
			temp=temp.next;
		}
		tail=pre;
		tail.next=null;
		length--;
		if(length==0) { //this condition is for edge test case when length is 1 And after deleted it becomes 0
			head=null;
			tail=null;
		}
		return temp;
	}
	
	public void prepend(int value) {
		Node newNode=new Node(value);
		
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		length++;
	}
}
