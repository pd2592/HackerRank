import java.util.Scanner;

public class MaxElement {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack st = new Stack();
        int max;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
        	int queryType = sc.nextInt();
        	int ele;
        	if(queryType == 1){
        		ele = sc.nextInt();
        		st.push(ele);
        	} else if(queryType == 2){
        		st.pop();
        	} else {
        		max = st.findMax();
        		System.out.println(max);
        	}
        }
    }
	
}
class Stack{
	static final int MAX = 100000;
    int top;
    int a[] = new int[MAX];
    
	Stack(){
		top = -1;
	}
	void push(int item){
		if(top >= MAX){
			System.out.println("Stack Overflow");
		} else {
			a[++top] = item;
		}
		
	}
	void pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
		} else {
			top--;
		}
	}
	int findMax(){
		int max = Integer.MIN_VALUE;
		for(int i = top; i > -1; i--){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
		
	}
}
