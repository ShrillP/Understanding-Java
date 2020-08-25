public class Invoice {

	private String partNum;
	private String description;
	private int quantity;
	private double price;

	//Constructor Method 
	public Invoice (String partNum, String description, int quantity, double price) {
		setPartNum(partNum);
		setDescription(description);
		setQuantity(quantity);
		setPrice(price);

	}

	//Set and get methods (setters and getters)
	public void setPartNum (String partNum) {
		this.partNum = partNum;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setDescription (String description) {
		this.description = description;
	}

	public String getDecription() {
		return description;
	}

	public void setQuantity (int quantity) {
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice (double price) {
		if (price < 0.0)
			this.price = 0.0;
		else 
			this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	//toString method
	@Override
	public String toString () {
		return "Invoice [ partNum = " + partNum + ", description = " + description + ", quantity = " + quantity + ", price = " + price + " ] ";
	}
	
	//Utility Method 
	public double getInvoiceAmount () {
		return quantity * price;
	}
}
