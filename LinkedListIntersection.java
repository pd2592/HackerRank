
public class LinkedListIntersection {
	
	static Node head1, head2;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    static int countlength(Node head){
    	int count = 0;
		while(head.next!=null){
			head = head.next;
			count++;
		}
    	return count;
    	
    }
 
    static int getNode(Node head1, Node head2){
    	int c1 = countlength(head1);
    	int c2 = countlength(head2);
    	int intersection = 0;
    	if (c1 > c2){
    		int d = c1 - c2;
    		intersection = getIntersection(d, head1, head2);
    	} else{
    		int d = c2 - c1;
    		intersection = getIntersection(d, head2, head1);
    	}
    	return intersection;
    }
    
    static int getIntersection(int diff, Node longhead, Node shorthead){
    	for (int i=0; i<diff; i++){
    		longhead = longhead.next;
    	}
    	while (longhead != null && shorthead != null) {
			if (longhead.data == shorthead.data) {
				return longhead.data;
			}
			longhead = longhead.next;
			shorthead = shorthead.next;
		}

		return -1;
    }
 
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(10);
 
        // creating first linked list
        node1.next = new Node(10);
        node1.next.next = new Node(60);
        node1.next.next.next = new Node(15);
        node1.next.next.next.next = new Node(15);
        node1.next.next.next.next.next = new Node(30);
 
        // creating second linked list
        node2.next = new Node(10);
        node2.next.next = new Node(15);
        node2.next.next.next = new Node(34);
 
        System.out.println("The node of intersection is " + getNode(node1, node2));
 
    }
    }
