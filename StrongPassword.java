import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int res;
        int count = 0;
        
            Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(password);
            boolean b = m.find();

            if (!b)
               count++;
            
            p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
            m = p.matcher(password);
            b = m.find();

            if (!b)
               count++;
            
            p = Pattern.compile("[a-z]");
            m = p.matcher(password);
            b = m.find();

            if (!b)
               count++;
            
            p = Pattern.compile("[A-Z]");
            m = p.matcher(password);
            b = m.find();

            if (!b)
               count++; 
            if(count+n >= 6){
                res = count;
            } else {
                res = 6-n;
            }
        return res;
        }
        
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
