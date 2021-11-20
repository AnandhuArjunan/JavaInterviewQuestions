package arrays.intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
Intersection means common elements. We need to find common elements between two given arrays.
For example :
int[]  arr1 = {1, 2, 3, 4, 5, 6};
int[] arr2 = {2, 3, 4, 7, 8};
Output : 2, 3, 4
 * @author Anandhu Arjunan
 *
 */
public class IntersectionBetweenArrays {
public static void main(String[] args) {
	
	int[] arr1 = {1, 5, 4, 0, 5, 6};
	int[] arr2 = {2, 2, 4, 7, 8};
	
	Set<Integer> intersection = new HashSet<>();
	Set<Integer> uncommonelements = new HashSet<>();

	
	for(int i=0;i<arr2.length;i++) {
		if(uncommonelements.contains(arr2[i])) {
			continue;
		}
		uncommonelements.add(arr2[i]);
		for(int j=0;j<arr1.length;j++) {
			if(arr1[j] == arr2[i]) {
				intersection.add(arr1[j]);
				break;
			}
		}
	}
	System.out.println(intersection);

	
}
}
