
public class LinkedList {

	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	public void push(int d){
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}
	public void insertAfter(Node prev_node, int data){
		if(prev_node == null){
			System.out.println("Previous node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
	}
	public void append(int data){
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
			return;
		}
		Node node = head;
		while(node.next != null){
			node = node.next;
		}
		node.next = newNode;
		return;
	}
	public Node ReverseList(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	public void printList(Node head){
		Node node = head;
		while (node != null)
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(4);
		llist.append(6);
		llist.append(5);
		llist.push(2);
		llist.insertAfter(llist.head.next.next.next, 88);
		System.out.println("\nCreated Linked list is: ");
		llist.printList(head);
		head = llist.ReverseList(llist.head);
		llist.printList(head);
	}
}
