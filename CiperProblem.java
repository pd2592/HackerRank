import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CiperProblem {

    static String caesarCipher(String str, int k) {
        // Complete this function
        StringBuilder s1 = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			
			Pattern p = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(Character.toString(str.charAt(i)));
			boolean b = m.find();
			if(b){
				k = k%26;
				System.out.println(k+"rotation");
                int c = str.charAt(i)+k;
                System.out.println(c);
                if(Character.isUpperCase(str.charAt(i)) && c > 90){
                	System.out.println("upper");
                    c = 65+k-1-(90-str.charAt(i));
                    System.out.println(c);
                    System.out.println((char)c);
                }
                else if (Character.isLowerCase(str.charAt(i)) && c > 122){
                	System.out.println("Lower");
                    c = 97+k-1-(122-str.charAt(i));
                    System.out.println((char)c);
                } else {
                	System.out.println("else");
                    c = str.charAt(i)+k;
                    System.out.println((char)c);
                }
                s1 = s1.append((char)c);
			}
			else{
				s1 = s1.append(str.charAt(i));
			}
		}
        return s1.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
