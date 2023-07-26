
	import java.awt.Image;

import javax.swing.ImageIcon;

public class BankTest {
	public static void main(String[] args) {
	
		BankApplicationForm bankAppForm1 = new BankApplicationForm();
		BankApplicationForm bankAppForm2 = new BankApplicationForm();
		BankApplicationForm bankAppForm3 = new BankApplicationForm();

		bankAppForm1.setApplicantName("Jack Dsouza");
		bankAppForm1.setAadharCard("123412341234");
		bankAppForm1.setPancard("POPJD1234D");
		bankAppForm1.setEmailAddress("jack@gmail.com");
		bankAppForm1.setMobileNo("9820443464");
		bankAppForm1.setAddress("C709, West Avenue, Mumbai 16");
		bankAppForm1.setAccounttype("Savings");

		
		bankAppForm2.setApplicantName("Sushil Kulkarni");
		bankAppForm2.setAadharCard("432143211234");
		bankAppForm2.setPancard("SUSD4454D");
		bankAppForm2.setEmailAddress("sushil@gmail.com");
		bankAppForm2.setMobileNo("8890443464");
		bankAppForm2.setAddress("D509, East Avenue, Pune 16");
		bankAppForm2.setAccounttype("Current");
		
		bankAppForm3.setApplicantName("Ratan Rajkudali");
		bankAppForm3.setAadharCard("999988887777");
		bankAppForm3.setPancard("ROPTR434E");
		bankAppForm3.setEmailAddress("ratan@gmail.com");
		bankAppForm3.setMobileNo("7799443464");
		bankAppForm3.setAddress("E59, South Avenue, Bengaluru 26");
		bankAppForm3.setAccounttype("fixed");
		
	
		bankAppForm1.printApplicationForm();
		bankAppForm2.printApplicationForm();

		bankAppForm3.printApplicationForm();

		
		System.out.println("=============================");
		
		Bank bank = new Bank();
		BankAccount bankAcc1 = bank.applyForABankAccount(bankAppForm1); //passing object here 
		BankAccount bankAcc2 = bank.applyForABankAccount(bankAppForm2); //passing object here 
		BankAccount bankAcc3 = bank.applyForABankAccount(bankAppForm3); //passing object here 

		bankAcc1.bankAccountDetails();	
		bankAcc2.bankAccountDetails();	
		bankAcc3.bankAccountDetails();	
		
		BankApplicationForm form1=new BankApplicationForm();
		form1.setApplicantName("Dipa Gupta");
		form1.setAadharCard("123637241234");
		form1.setPancard("OPDDG1234D");
		form1.setEmailAddress("dipa@gmail.com");
		form1.setMobileNo("9820856764");
		form1.setAddress("C723, West Avenue, Mumbai 16");
		form1.setAccounttype("Savings");
		
		BankApplicationForm form2=new BankApplicationForm();
		form2.setApplicantName("Deep Gupta");
		form2.setAadharCard("123637245434");
		form2.setPancard("OPFDG1254M");
		form2.setEmailAddress("dipa@gmail.com");
		form2.setMobileNo("9820856764");
		form2.setAddress(form1.getAddress());
		form2.setAccounttype(form1.getAccounttype());
		
		form1.printApplicationForm();
		form2.printApplicationForm();
		
		BankAccount bankAcc4 = bank.createJointAccount(form1,form2);
		bankAcc4.bankAccountDetails();
	}
	
}

class Form{
	
}

class BankApplicationForm extends Form{
	private String applicantName;
	private String address;
	private String aadharCard;
	private String pancard;
	private String mobileNo;
	private String emailAddress;
	private String accounttype;
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	void printApplicationForm() {
		System.out.println("-------Bank Application Form-------");
		System.out.println("Bank Applicant Name : "+applicantName);
		System.out.println("Bank Account Type   : "+accounttype);
		System.out.println("Applicant Address   : "+address);
		System.out.println("Applicant's Adhaar  : "+aadharCard);
		System.out.println("Applicant's PAN     : "+pancard);
		System.out.println("Applicant's Email   : "+emailAddress);
		System.out.println("Applicant's Mobile  : "+mobileNo);		
	}
}

class BankAccount{
	private long accountNumber;
	private String accountHolder;
	private long accountBalance;
	private String accountType;
	private String ifscCode;
	private String operationType; //single,joint
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	
	void bankAccountDetails() {
		System.out.println("-------Bank Account Details -------");
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Account Holder      : "+accountHolder);
		System.out.println("Bank Account IFSC   : "+ifscCode);
		System.out.println("Account Balance     : "+accountBalance);
		System.out.println("Account opertion type: "+operationType);
	}
}

class Bank{
	BankAccount applyForABankAccount(BankApplicationForm bankAppFormRef ) {
		System.out.println("Recieved the application from  : "+bankAppFormRef.getApplicantName());
		System.out.println("Creating bank Account ");
		BankAccount bankAccObj = new BankAccount(); // a blank object
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj.setAccountNumber(accNum);//real time, connect to the DB, and find out the last account number generated, and one 
		bankAccObj.setAccountHolder(bankAppFormRef.getApplicantName());
		bankAccObj.setAccountType(bankAppFormRef.getAccounttype());
		bankAccObj.setIfscCode("BOB000000015");
		bankAccObj.setAccountBalance(3000);
		bankAccObj.setOperationType("Single");
		
		return bankAccObj;
	}
	
	BankAccount createJointAccount(BankApplicationForm bankAppFormRef1, BankApplicationForm bankAppFormRef2 ){
		BankAccount bankAccObj = new BankAccount();
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj.setAccountNumber(accNum);//real time, connect to the DB, and find out the last account number generated, and one 
		bankAccObj.setAccountHolder(bankAppFormRef1.getApplicantName()+" "+bankAppFormRef2.getApplicantName());
		bankAccObj.setAccountType(bankAppFormRef1.getAccounttype());
		bankAccObj.setIfscCode("BOB000000015");
		bankAccObj.setAccountBalance(3000);
		bankAccObj.setOperationType("Joint");
		
		return bankAccObj;
	}
}