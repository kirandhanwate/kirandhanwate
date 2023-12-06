package Map;

import java.util.Comparator;
import java.util.TreeMap;

public class treemap1 {
public static void main(String[] args) {
	
	TreeMap<Integer,String> t=new TreeMap(new treemap2());
	t.put(101, "kiran");
	t.put(102, "Ashwini");
	t.put(103, "Samiksha");
	t.put(104, "Rohini");
	
	System.out.println(t);
}
}
