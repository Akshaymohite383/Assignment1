package oops7;


	import java.time.LocalDate;

	public class Athletic {

		public int aid;
		public String aname;
		public String address;
		public LocalDate dob;
		public Athletic(int aid, String aname, String address, LocalDate dob) {
			super();
			this.aid = aid;
			this.aname = aname;
			this.address = address;
			this.dob = dob;
		}
		public void showathletic() {
			System.out.println("Athletic");
		}
		@Override
		public String toString() {
			return "aid=" + aid + ", aname=" + aname + ", address=" + address + ", dob=" + dob ;
		}
}
