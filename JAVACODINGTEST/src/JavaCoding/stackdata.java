package JavaCoding;

import java.util.Iterator;
import java.util.Stack;

/*Write a java program to implement your own stack data structure to store any number of items.
  And implement the following operations 1.push 2. pop 3. peek 4.display stack content
 * */

public class stackdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stacklist=new Stack<>();
		
		stacklist.push(5);
		stacklist.push(15);
		stacklist.push(25);
		stacklist.push(35);
		stacklist.push(45);
		Iterator<Integer>ite= stacklist.iterator();
		while(ite.hasNext()) 
			
			System.out.println(ite.next());
			Integer num1=stacklist.pop();
			System.out.println(num1);
			num1=stacklist.peek();
			System.out.println( "Stack peek = " +num1);
			System.out.println("Current Stack => "+stacklist);
		

	}

}
