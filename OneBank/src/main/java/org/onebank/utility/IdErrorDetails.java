package org.onebank.utility;

public class IdErrorDetails {
	
	
	private static final String Customer_Id_NOT_FOUND = "Customer ID Not Found , Please Contact Developer";
	
	private static final String Loan_Id_NOT_FOUND = "Loan ID Not Found , Please Contact Developer";

	private static final String Payment_Id_NOT_FOUND = "Payment ID Not Found , Please Contact Developer";

	public static String getCustomerIdNotFound() {
		return Customer_Id_NOT_FOUND;
	}

	public static String getLoanIdNotFound() {
		return Loan_Id_NOT_FOUND;
	}

	public static String getPaymentIdNotFound() {
		return Payment_Id_NOT_FOUND;
	}



	

}
