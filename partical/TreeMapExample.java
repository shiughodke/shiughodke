package collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
    Map<Integer,String> a1 = new TreeMap<Integer,String>();
		
		a1.put(1, "raj");
		a1.put(2, "shubham");
		a1.put(7, "ajay");
		a1.put(3, "pen");
		a1.put(4, "buket");
		a1.put(1, "raj"); // duplicate pair
		a1.put(3, "moblie"); // duplicate value
        a1.put(null, "sona"); // null value
        a1.putIfAbsent(9, "marker"); 
        a1.putIfAbsent(2,"shubham");
        
        // traversing map using entrySet();
        for(Map.Entry<Integer,String> m: a1.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        a1.remove(2);
        a1.remove(3, "moblie");
        a1.replace(7, "penbook");
        
        System.out.println();
        for(Map.Entry<Integer,String> m: a1.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
         

	}

}
