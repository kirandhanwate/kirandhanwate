package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HashAssignment {
	 public static void main(String[] args) {
		 List<String> Mh= new ArrayList();
		 Mh.add("Pune");
		 Mh.add("Ahamadnagar");
		

		 List<String> Gj=new ArrayList();
		 Gj.add("Surat");
		 Gj.add("Ahamdabad");
		 

		 Map<String, List<String>> India=(Map<String, List<String>>) new HashMap();
		 India.put("Maharashtra", Mh);
		 India.put("Gujrat", Gj);
		 System.out.println(India);

		 Set<String> keys = India.keySet();

		 System.out.println(keys);

		 Iterator<String> itr = keys.iterator();
		 while(itr.hasNext())
		 {
		 	String State = itr.next();
		 	System.out.println(State);
		 	List<String> Value=India.get(State);
		 	
		 	Iterator<String> itr2 = Value.iterator();
		 	while(itr2.hasNext())
		 	{
		 		String city = itr2.next();
		 		System.out.println(city);
		 	}
		 }
}
}
