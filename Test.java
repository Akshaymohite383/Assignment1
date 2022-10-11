package oops3;
	import java.time.LocalDate;
public class Test {



		public static void main(String[] args) {

			Customer_Account_Statement customerAccountStatement = new Customer_Account_Statement(101, 01234, "Nitin",
					LocalDate.of(1991, 07, 05), LocalDate.of(2022, 6, 12), "branch_Obj", 21, 6000.0, 400.0,
					LocalDate.of(2022, 8, 5));
			System.out.println(customerAccountStatement);

			Customer_Account_Statement newcuStatement = new Customer_Account_Statement(222, 12345, "Suraj",
					LocalDate.of(1991,01,07), LocalDate.of(2022, 5,11 ), "branch_Obj", 10, 8000.0, 500.0,
					LocalDate.of(2022, 8, 13));
			System.out.println(newcuStatement);

		}
	
}
