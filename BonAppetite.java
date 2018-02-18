import java.util.Scanner;

public class BonAppetite {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n ; i++){
        	if(i != k){
        		sum += arr[i];
        	}
        }
        //System.out.println(sum);
        if (sum/2 == b) {
        	System.out.println("Bon Appetite!");
        } else {
        	System.out.println(sum/2);
        }
    }
}
