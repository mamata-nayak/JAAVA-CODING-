package JavaCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import java.util.Collections;;



public class StudentMarks {
	
	public static void main(String[] args) {
	List<Studentinfo> ranks= new ArrayList<>();

  ranks.add(new Studentinfo("Nisha",101,890));
  ranks.add(new Studentinfo("Nilam " ,102, 1200 ));
  ranks.add(new Studentinfo("Rakhi " ,103,800));
  ranks.add(new Studentinfo("Nidhi" , 104, 980));
  ranks.add(new Studentinfo("Shika " ,105,1079 ));
 
	 Comparator<Studentinfo>com=new Comparator<Studentinfo>() {
public int compare(Studentinfo c1, Studentinfo c2) {
	
	if(c1.getMarks()>c2.getMarks())
		return 1;
	    return -1;}};

Collections.sort( ranks,com ) ;
for(Studentinfo s:ranks) {
	System.out.println(s);
	
 }
 
}	 
	 
} 




	 
	 	 