import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GreatestComb {

	public static void main(String[] args) {
		List<String> arr;
        arr = new ArrayList<>();
         
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
		
	}

	private static void printLargest(List<String> arr) {
		// TODO Auto-generated method stub
		
			Collections.sort(arr, new Comparator<String>(){
				
				@Override
				public int compare(String arg0, String arg1) {
					
					String arg01 = arg0+arg1;
					String arg10 = arg1+arg0;
					
					return arg01.compareTo(arg10) > 0 ? -1:1;
				}
			});
			 Iterator it = arr.iterator();
			    while(it.hasNext())
			        System.out.print(it.next());
			     
			    }
	}

