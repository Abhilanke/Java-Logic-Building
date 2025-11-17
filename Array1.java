package logicbuilding;

public class Array1 {
	
	    public static void main(String[] args) {

			
	        int[] array1 = {2, 4, 6, 8, 10};
	        int[] array2 = {1, 3, 6, 8, 12};

	        int index1 = 0, index2 = 0; // Manually tracking indices

	        // Using while loop to simulate array traversal
	        for (int i = 0; ; i++) {
	            // Break if indices exceed array bounds
	            if (index1 >= 5 || index2 >= 5) break; 

	            if (array1[index1] == array2[index2]) {
	                System.out.println("Common Element: " + array1[index1]);
	                index1++;
	                index2++;
	            } else if (array1[index1] < array2[index2]) {
	                index1++;
	            } else {
	                index2++;
	            }
	        }
	    }
	}



