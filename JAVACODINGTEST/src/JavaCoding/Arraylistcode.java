package JavaCoding;

import java.util.ArrayList;
import java.util.Iterator;
/*7. Write a java program to implement your own ArrayList which has two methods add 
 b) remove and store 5 student information in your ArrayList.*/
public class Arraylistcode {
	
	
public static void  main(String [] arg) {	
	ArrayList<Integer> nums= new ArrayList<>();
	nums.add(13);
	nums.add(38);
	nums.add(57);
	nums.add(13);
	nums.add(8);
	nums.add(67);
	nums.remove(new Integer(84));
	
	Iterator<Integer>it=nums.iterator();
	while(it.hasNext())

	System.out.println(it.next());
	
	
}

}
