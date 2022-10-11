package Com.yash.oops;

public class Employe9 implements Cloneable {
		public int empId;
		public String empName;
		public int empSalary;
		public String deptname;

		public Employe9(int empId, String empName, int empSalary, String deptname) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.deptname = deptname;
		}

		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		public static void main(String[] args) {
			try {
				Employe9 e1 = new Employe9(101, "nitin", 60000, "COMP");

				Employe9 e2 = (Employe9) e1.clone();

				System.out.println("Employee Name: "+e1.empName);
				System.out.println("Employee Name After clone: "+e2.empName);

				String empName = "abc";
				boolean output1 = empName instanceof String;
				System.out.println("empName: " +empName+ " is instance of Employee: " + output1);
				boolean output2 = e1 instanceof Employe9;
				System.out.println("e1 is instance of Employee: " + output2);

			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

