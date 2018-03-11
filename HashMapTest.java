import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(12, "Priyanka");
	map.put(2, "Pd");
	map.put(6, "Priya");
	map.put(9, "klmn");
	
	Set set = map.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext()){
		Map.Entry mentry = (Map.Entry)itr.next();
		System.out.println(mentry);
		System.out.println(mentry.getValue()+"   "+mentry.getKey());
	}
	System.out.println(map.get(2));
}
}
