package org.onebank.utility;

public class ApiRoutes {

	//main Route
	public static final String CUSTOMER = "/customer";

	//Customer Controller
	
	//localhost:9191/bank/customer/cust
	public static final String CREATE_CUSTOMER = "/cust";

	//localhost:9191/bank/customer/gcust
	public static final String GET_ALL_CUSTOMERS = "/gcust";

	//localhost:9191/bank/customer/gicust/1
	public static final String GET_ALL_CUSTOMERS_BY_ID = "/gicust/{custId}";

	//localhost:9191/bank/customer/ucust
	public static final String UPDATE_CUSTOMERS = "/ucust";

	
	//localhost:9191/bank/customer/dcust/1
	public static final String DELETE_CUSTOMERS_BY_ID = "/dcust/{custId}";
	
	

	
	//Main path
	public static final String 	PAYMENTS = "/payment";
	
	//Payment Routes
	
	//localhost:9191/bank/payment/pay
	public static final String CREATE_PAYMENT_DETAILS = "/pay";

	
	//localhost:9191/bank/payment/gpay
	public static final String GET_ALL_PAYMENT_DETAILS  = "/gpay";

	//localhost:9191/bank/payment/gpay/2
	public static final String GET_ALL_PAYMENTS_BY_ID = "/gpay/{payId}";

	//localhost:9191/bank/payment/upay
	public static final String UPDATE_PAYMENT_DETAILS  = "/upay";

	//localhost:9191/bank/payment/dpay/3
	public static final String DELETE_PAYMENT_BY_ID = "/dpay/{payId}";
	
	
	//<Main Routes
	public static final String 		LOAN = "/loan";
	
	//LOAN Routes
	
	//localhost:9191/bank/loan/loan
	public static final String CREATE_lOAN_DETAILS = "/loan";

	//localhost:9191/bank/loan/gloan
	public static final String GET_ALL_lOAN_DETAILS  = "/gloan";

	//localhost:9191/bank/loan/gloan/2
	public static final String GET_ALL_lOAN_BY_ID = "/gloan/{loanId}";

	//localhost:9191/bank/loan/uloan
	public static final String UPDATE_lOAN_DETAILS  = "/uloan";

	//localhost:9191/bank/loan/dloan/2
	public static final String DELETE_lOAN_BY_ID = "/dloany/{loanId}";
	
	

}
