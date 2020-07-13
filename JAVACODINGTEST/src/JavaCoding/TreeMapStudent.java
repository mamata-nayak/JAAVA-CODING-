package JavaCoding;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<String,Integer>studentinfo= new TreeMap<>();
 
 studentinfo.put("Jyoti",10011);
 studentinfo.put("Rashi",10012);
 studentinfo.put("Neetu",10013);
 studentinfo.put("Ishi",10014);
 studentinfo.put("Ara",10015);
Iterator<Map.Entry<String, Integer>>studlist= studentinfo.entrySet().iterator();
while(studlist.hasNext()) {
	
Map.Entry entry=studlist.next();

System.out.println(entry.getKey()+ " = "+ entry.getValue());
}
 
	}

}
