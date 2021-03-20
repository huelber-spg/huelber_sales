package huelber_sales;

public class Customer
{
	private int customerID;
	private String firstName;
	private double credit;

	public Customer(int customerID, String firstName, double credit)
	{
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.credit = credit;
	}

	public double getCredit()
	{
		return credit;
	}

	public void setCredit(double credit)
	{
		this.credit = credit;
	}
	
	public int getCustomerID()
	{
		return customerID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

}
