package basic_test.day1;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				str2 += Character.toLowerCase(c);
			} else {
				str2 += Character.toUpperCase(c);
			}
		}
		System.out.println(str2);
	}

}
