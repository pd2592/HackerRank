import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    static String funnyString(String s){
        // Complete this function
        int l = s.length();
        int[] arr = new int[l-1];
        for(int i = 1; i < s.length(); i++){
            arr[i-1] = Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        int lastInd = arr.length-1;
        int counter = 0;
        int conditionCheck = lastInd/2;
        for(int j = 0; j <= conditionCheck; j++){
            if(arr[j] == arr[lastInd]){
                lastInd--;
                counter++;
            } else {
                break;
            }
        }

        if(counter == conditionCheck+1){
            return "Funny";
        } else {
            return "Not Funny";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
