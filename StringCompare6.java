package Com.yash.oops;
import java.util.Scanner;
public class StringCompare6 {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the first string: ");
			String str1 = scanner.next();
			
			System.out.println("Enter the second String: ");
			String str2 = scanner.next();
			
			for(int i = 0; i< str1.length();i++) {
				for (int j = i+1; j < str2.length(); j++) {
					if (str1.charAt(i)==str2.charAt(j)) {
						System.out.println("Alphabet in String is equal");
					}else {
						System.out.println("Alphabet in String Not equal");
					}
				}
			}
			scanner.close();
		}
	}


