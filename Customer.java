package oops3;


	import java.time.LocalDate;

	public class Customer {
		private int CustId;
	    private int accountno;
	    private String custname;
	    private LocalDate cust_dob;
	    private LocalDate cust_account_opening_date;
	    
	    
	    Branch branchObj=new Branch(15, "Sihagad", "pune");
	    public Customer(int custId, int accountno, String custname, LocalDate cust_dob, LocalDate cust_account_opening_date,
	            String branchObj) {
	        super();
	        CustId = custId;
	        this.accountno = accountno;
	        this.custname = custname;
	        this.cust_dob = cust_dob;
	        this.cust_account_opening_date = cust_account_opening_date;
	        
	    } 
	    public int getCustId() {
	        return CustId;
	    }

	    public void setCustId(int custId) {
	        CustId = custId;
	    }
	    public int getAccountno() {
	        return accountno;
	    }

	    public void setAccountno(int accountno) {
	        this.accountno = accountno;
	    }

	    public String getCustname() {
	        return custname;
	    }
	    public void setCustname(String custname) {
	        this.custname = custname;
	    }
	    public LocalDate getCust_dob() {
	        return cust_dob;
	    }

	    public void setCust_dob(LocalDate cust_dob) {
	        this.cust_dob = cust_dob;
	    }
	    public LocalDate getCust_account_opening_date() {
	        return cust_account_opening_date;
	    }

	    public void setCust_account_opening_date(LocalDate cust_account_opening_date) {
	        this.cust_account_opening_date = cust_account_opening_date;
	    }

	    public Branch getBranchObj() {
	        return branchObj;
	    }

	    public void setBranchObj(Branch branchObj) {
	        this.branchObj = branchObj;
	    }
	    @Override
	    public String toString() {
	        return "Customer [CustId=" + CustId + ", accountno=" + accountno + ", custname=" + custname + ", cust_dob="
	                + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date + ", BranchObj=" + branchObj
	                + "]";
	    }
}
