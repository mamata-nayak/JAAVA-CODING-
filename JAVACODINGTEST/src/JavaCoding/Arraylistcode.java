package JavaCoding;

import java.util.ArrayList;
import java.util.Iterator;
/*7. Write a java program to implement your own ArrayList which has two methods add 
 b) remove and store 5 student information in your ArrayList.*/
public class Arraylistcode {
	
	
public static void  main(String [] arg) {	
	ArrayList<String> names = new ArrayList<>();
	names.add("mamata");
	names.add("Ishi");
	names.add("Jyoti");
	
	Iterator<String> it=names.iterator();
	while(it.hasNext())

	System.out.println(it.next());
	
	
}

}
