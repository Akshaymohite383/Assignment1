package Com.yash.oops;

public class Methodoverloading5 {
		public static int max(int a[], int n) {
			int temp;
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (a[i]>a[j]) {
						temp = a[i];
						a[i]= a[j];
						a[j]= temp;
					}
					
				}
				//System.out.println(a[i] + " ");
			}
			return a[n-1];
		}
		public static String max(String names[]) {
			 
			String longestnameString= names[0];
			for (int i = 1; i < names.length; i++) {
				
				if (names[i].length()>longestnameString.length()) {
					longestnameString= names[i];
					//len[i]=longestnameString;
				};
			}
			return longestnameString;		
		}

		public static void main(String[] args) {
			int a[] = { 1, 2, 50, 4, 3, 10 };
			System.out.println("Maximum number:"+max(a, 6));

			String names[]= {"mohite","sachin","akshaymohite","swapnil"};
			System.out.println("Longest String : "+max(names));
		}
	}


