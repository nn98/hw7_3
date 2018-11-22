package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node {
		char data;
		Node link;
		private Node(char data) {
			this.data=data;
		}
	}
	private Node top=null;
	
	public boolean isEmpty() {
		return top==null;
	}
	public void push(char d) {
		Node n=new Node(d);
		n.link=top;
		top=n;
	}
	public char pop() {
		if(this.isEmpty()) throw new EmptyStackException();
		char r=top.data;
		top=top.link;
		return r;
	}
	public char peek() {
		if(this.isEmpty()) throw new EmptyStackException();
		return top.data;
	}
	
}