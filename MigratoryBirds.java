import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            arr[ar[i]]++;
        }
        int max = 0, pos = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}