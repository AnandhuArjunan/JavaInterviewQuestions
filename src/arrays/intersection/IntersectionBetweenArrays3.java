package arrays.intersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionBetweenArrays3 {
	    
	    public static void main(String[] args)
	    {
	    	
	    	Integer[] arr1 = {1, 5, 4, 0, 5, 6};
	    	Integer[] arr2 = {2, 2, 4, 7, 8};
	    	
	    	Set<Integer> integers = new HashSet<>(Arrays.asList(arr1));
	    	Set<Integer> integers2 = new HashSet<>(Arrays.asList(arr2));
	    	integers.retainAll(integers2);
	    	Integer[] intersectedArray = integers.toArray(new Integer[arr2.length]);
	    	System.out.println(intersectedArray);
	    }
	    
	   
}
