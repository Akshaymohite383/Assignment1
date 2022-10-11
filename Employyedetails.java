package Com.yash.oops;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employyedetails {
int emp_id, salary ;
String name,address,department,email;
private LocalDate emp_dob ,emp_doj;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getEmp_dob() {
	return emp_dob;
}
public void setEmp_dob(LocalDate emp_dob) {
	this.emp_dob = emp_dob;
}
public LocalDate getEmp_doj() {
	return emp_doj;
}
public void setEmp_doj(LocalDate emp_doj) {
	this.emp_doj = emp_doj;
}
@Override
public String toString() {
	return "Employyedetails [emp_id=" + emp_id + ", salary=" + salary + ", name=" + name + ", address=" + address
			+ ", department=" + department + ", email=" + email + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
}


public static void main(String[] args) {
	Employyedetails emp=new Employyedetails();
	emp.setEmp_id(101);
	emp.setName("akshay mohite");
	emp.setDepartment("IT");
	emp.setEmp_dob(LocalDate.of(1994, 9, 23));
	emp.setSalary(20000);
	emp.setEmp_doj(LocalDate.of(2022, 8, 10));
	emp.setAddress("Pune");
	emp.setEmail("akshaymohite@gmail.com");
	System.out.println(emp);
	//int sal =emp.getSalary();
}
}
