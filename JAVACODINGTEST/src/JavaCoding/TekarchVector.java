package JavaCoding;
/*Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position.
delete N charactors from 6th position from vectorExample:if user input =5Then vector stores="tekZZZZZarch"
Delete 5 character from 6th position so final string="tekZZZh"*/

import java.util.Scanner;
import java.util.Vector;

public class TekarchVector {
	
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
    int num= sc.nextInt();
    System.out.println(" Print the int" +num);
	
    Vector<String> input = new Vector<String>(); 

    input.add("t");
    input.add("e");
    input.add("k");
    input.add("a");
    input.add("r");
    input.add("c");
    input.add("h");
    
  for(int i=2;i<2+num;i++) {
	  input.add(i,"Z");
	  System.out.println(input);
  } 
	
	 for(int i=6;i<6+num;i++) {
	input.removeElementAt(6);
	}
	System.out.println(input);
}

}
