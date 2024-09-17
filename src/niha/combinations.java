package niha;

public class combinations {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.println("Combinations of length 1:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nCombinations of length 2:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }

        System.out.println("\nCombinations of length 3:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                }
            }
        }
        
        System.out.println("\n Combinations of length 4:");
        for( int i = 0;i < numbers.length; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		for(int k = 0; k < numbers.length; k++) {
        			for(int l = 0; l < numbers.length; l++) {
        				 System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k] + " " + numbers[l]);

        			}
        		}
        	}
        }
        }
}


