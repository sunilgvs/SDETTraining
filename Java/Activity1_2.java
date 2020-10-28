

import java.util.*;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] iarray = {10, 77, 10, 54, -11, 10};
		
		int iSearch =10;
		int iFinal =30;
		
		System.out.println("Converting to String " + Arrays.toString(iarray));
		System.out.println("Result " + result(iarray , iSearch, iFinal));
	}
	
	public static boolean result(int[] numbers, int iSearch, int iFinal) {
		
		int temp_sum =0;
		
		for(int number : numbers) {			
			if (number == iSearch) {
				temp_sum += iSearch;
			}
			if (temp_sum > iFinal) {
				
				break;
				
			}
						
		}
		
		return temp_sum == iFinal;
		
	}

}
