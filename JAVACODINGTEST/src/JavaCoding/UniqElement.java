package JavaCoding;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*4. Write a java program to
 *  store 5 unique elements in sorted order. Error should exist if user tries to add duplicates.*/
public class UniqElement {
	
public static void main(String[]arg) {
	
Set<Integer>numlist= new TreeSet<>();

numlist.add(5);
numlist.add(15);
numlist.add(50);
numlist.add(51);
numlist.add(35);



for(int sortnum : numlist)
System.out.println(sortnum);
}

}
