package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap {
public static void main(String[] args) {
List<String> Mh= new ArrayList();
Mh.add("Pune");
Mh.add("Ahamadnagar");


List<String> Gj=new ArrayList();
Gj.add("Surat");
Gj.add("Ahamdabad");


List<String> s1=new ArrayList();
s1.add("c1");
s1.add("c2");


List<String> s2= new ArrayList();
s2.add("c3");
s2.add("c4");




Map<String,List<String>> India=(Map<String, List<String>>) new HashMap();
India.put("Maharashtra", Mh);
India.put("Gujrat", Gj);
System.out.println(India);
System.out.println("-------------");

Map<String,List<String>> Japan=(Map<String, List<String>>) new HashMap();
Japan.put("new City", s1);
Japan.put("old city", s2);
System.out.println(Japan);
System.out.println("----------------");

Map<String,List<List<String>>> World=(Map<String, List<List<String>>>) new HashMap();
Set<String> keys = World.keySet();

System.out.println(keys);
System.out.println("------------------");

Iterator<String> itr = keys.iterator();
while(itr.hasNext())
{
	
	String Country= itr.next();
	System.out.println(Country);
	System.out.println("-------------------");
	
	List<List<String>> Value=World.get(Country);
	
	Iterator<List<String>> itr2 = Value.iterator();
	while(itr2.hasNext())
	{
		List<String> State = itr2.next();
		
		System.out.println(State);
		System.out.println("-----------------");
		Iterator<String> itr3 = State.iterator();
		while(itr3.hasNext())
		{
			String City = itr3.next();
			System.out.println(City);
		}
	}
	
	
	
}

}
}
