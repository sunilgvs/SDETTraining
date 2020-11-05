import java.util.*;

public class Activity3_2{
	
	public static void main (String[] args) {
		
		HashSet<String> hs = new HashSet<String>(); 
		
		hs.add("S");
		hs.add("U");
		hs.add("N");
		hs.add("I");
		hs.add("L");
		hs.add("G");
		
	/*	for(String s:hs) {
			System.out.println(s);
		}*/
		
		System.out.println("Orginal Has Set : " + hs );
		
		System.out.println("Size of the Hash Set is  :"+ hs.size());
		
		System.out.println("Found G and removing the G from hash set : " + hs.remove("G"));
		
		if (hs.remove("K")) {
			
			System.out.println("Found K and removing the K from hash set");
		
		}else {
			System.out.println(" K Not Found and Nothing to remove from hash set");
		}
					
		System.out.println("Check if has set having F :" + hs.contains("F"));
		
			
		for(String s:hs) {
			System.out.println("updated has set is " +s);
		}
		
		System.out.println("Final Has Set : " + hs );
	}
	
}