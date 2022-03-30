package com.Infy.GettersAndSetters;

class Customer {
	String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}

public class TestGetterAndSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		customer.customerName = "WhoCares";
		System.out.println("Customer Name: "+customer.getCustomerName());
		
	}
}
