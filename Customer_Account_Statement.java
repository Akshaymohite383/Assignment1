package oops3;


	import java.time.LocalDate;

	public class Customer_Account_Statement extends Customer {

		private int CAID;
		private double amount;
		private double deposit_withdrawl;
		private LocalDate deposit_date;

		public Customer_Account_Statement(int custId, int accountno, String custname, LocalDate cust_dob,
				LocalDate cust_account_opening_date, String branchObj, int cAID, double amount, double deposit_withdrawl,
				LocalDate deposit_date) {
			super(custId, accountno, custname, cust_dob, cust_account_opening_date, branchObj);
			CAID = cAID;
			this.amount = amount;
			this.deposit_withdrawl = deposit_withdrawl;
			this.deposit_date = deposit_date;
		}

		public int getCAID() {
			return CAID;
		}

		public void setCAID(int cAID) {
			CAID = cAID;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public double getDeposit_withdrawl() {
			return deposit_withdrawl;
		}

		public void setDeposit_withdrawl(double deposit_withdrawl) {
			this.deposit_withdrawl = deposit_withdrawl;
		}

		public LocalDate getDeposit_date() {
			return deposit_date;
		}

		public void setDeposit_date(LocalDate deposit_date) {
			this.deposit_date = deposit_date;
		}

		@Override
		public String toString() {
			return "Customer_Account_Statement [CAID=" + CAID + ", amount=" + amount + ", deposit_withdrawl="
					+ deposit_withdrawl + ", deposit_date=" + deposit_date + ", Branch_Obj=" + branchObj + "]";
		}
	
}
