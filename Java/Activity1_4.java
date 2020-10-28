import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Array = {10,7,3,5,2,1};
		
		ascendingOrder(Array);
		
		System.out.println("Sorted array in ascending Order ");
		
		System.out.println(Arrays.toString(Array));
		
	}
	
	static void ascendingOrder(int array[]) {
		
		int size = array.length, i;
		
		System.out.println(size);
		
		 for (i = 1; i < size; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            System.out.println(key);
	            System.out.println(j);
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
		 }
		
		
		
	}

}
