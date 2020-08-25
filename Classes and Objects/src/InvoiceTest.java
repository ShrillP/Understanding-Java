public class InvoiceTest {

	public static void main (String args []) {
		
		Invoice invoice1 = new Invoice ("1122" , "Paper Clips" , 10500 , 0.15);
		
		System.out.printf("The invoice is: %s\n" , invoice1.toString());
		
		System.out.printf("The invoice amount is: $%.2f\n" , invoice1.getInvoiceAmount());
		
		invoice1.setPrice(-1.50);		//Not a vaild price; it will set the price to 0
		
		System.out.printf("The invoice amount is: $%.2f\n" , invoice1.getInvoiceAmount());
		
	}
}