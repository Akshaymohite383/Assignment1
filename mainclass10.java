package Com.yash.oops;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class mainclass10 {
	public static void main(String[] args) {
		Employyedetails emp=new Employyedetails();
		emp.setEmp_id(101);
		emp.setName("akshay mohite");
		emp.setDepartment("IT");
		emp.setEmp_dob(LocalDate.of(1995, 05, 31));
		emp.setSalary(20000);
		emp.setEmp_doj(LocalDate.of(2022, 07, 10));
		emp.setAddress("Pune");
		emp.setEmail("akshaymohite@gmail.com");
		System.out.println(emp);
		//int sal =emp.getSalary();
	}
}
