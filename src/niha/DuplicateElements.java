package niha;

import java.util.HashMap;
import java.util.Map;
public class DuplicateElements {

		public static void main(String[] args) {
			  int[] array = {1, 2, 5, 6, 3, 5, 2, 6, 3, 5, 4, 2, 2, 1};
			  Map<Integer, Integer> frequencyMap = new HashMap<>();

			  for (int num : array) {
			   frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
			  }

			  for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
				   if (entry.getValue() > 1) {
					    System.out.println("Duplicate element: " + entry.getKey() + ", Frequency of " + entry.getKey() +" in the array: " + entry.getValue());
					   }
					  }


	}

}
