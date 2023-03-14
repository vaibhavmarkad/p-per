package paper11;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class paperA {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: devloper ");
	        
	        String str = sc.nextLine();
	        Map<Character, Integer> occurrences = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            if (occurrences.containsKey(c)) {
	                occurrences.put(c, occurrences.get(c) + 1);
	            } else {
	                occurrences.put(c, 1);
	            }
	        }
	        System.out.println("Occurrences:");
	        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
	            System.out.println(entry.getKey() + "==> " + entry.getValue());
	        }
	        sc.close();
	    }

}
