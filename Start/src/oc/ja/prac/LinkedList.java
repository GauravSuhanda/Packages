package oc.ja.prac;

public class LinkedList {

	public static void main(String[] args) {

		// System.out.println("Linked List before");
		Node nodeA = new Node(6);
		Node nodeB = new Node(3);
		Node nodeC = new Node(4);
		Node nodeD = new Node(2);
		Node nodeE = new Node(1);

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		// System.out.println("Linked List");
		System.out.println("This linked list's length is: (should print 5)");
		System.out.print(countNodes(nodeA));
		System.out.print(countNodes(nodeB));
		System.out.print(countNodes(nodeC));
	}

	static int countNodes(Node head) {
		// assuming that head != null
		int count = 1;
		Node current = head;
		while (current.next != null) {
			current = current.next;
			count += 1;
		}
		return count;
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}
