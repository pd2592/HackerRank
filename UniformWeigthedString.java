import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniformWeigthedString {

    static Set<Integer> dummy(String s){
        int len = s.length();
        System.out.println(len);
        //int[] arr = new int[len];
        Set<Integer> arr = new HashSet<Integer>();
        int j = 0;
        for(int i = 0; i < len-1; i++) {
            if(i > 0 && s.charAt(i) == s.charAt(i-1)){
                int sum = (int) s.charAt(i-1) - 96;
                while(s.charAt(i) == s.charAt(i-1)){
                    sum = sum + (int) s.charAt(i) - 96;
                    arr.add(sum);
                    i++;
                }
                i--;
            }
            else{
                int a = (int) s.charAt(i) - 96;
                arr.add(a);
            }
                
        }
        // for(int k : arr){
        //     System.out.println(k);
        // }
        return arr;
    }
    public static void main(String[] args) {  
        
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        
        Set<Integer> arr = dummy(s);
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
           
            if(arr.contains(x) ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
     
    }
}
