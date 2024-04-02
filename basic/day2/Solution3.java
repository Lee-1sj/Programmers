package basic_test.day2;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");

		for(String data : strArray) {
			System.out.println(data);

		}
	}
}
