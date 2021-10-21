package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInStringUsingSet {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] charArr = str.toCharArray();
		System.out.println(charArr.length);
		
		Set<Character> removeDuplicate = new LinkedHashSet<Character>();
		for (int i = 0; i < charArr.length; i++) {
			if(!removeDuplicate.add(charArr[i])) {
				System.out.println("Duplicates are :" +charArr[i]);
			}
		}
		System.out.println("Print without duplicates :" +removeDuplicate);
	}

}
