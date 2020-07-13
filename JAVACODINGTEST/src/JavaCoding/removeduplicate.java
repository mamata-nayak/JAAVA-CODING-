package JavaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 31, 3, 4, 5, 61, 6, 6,33 ,6,7, 8));
        
        System.out.println(numList);
 
        List<Integer> WithoutDuplicates = numList.stream().distinct().collect(Collectors.toList());
         
        System.out.println(WithoutDuplicates);
    }
}
		

