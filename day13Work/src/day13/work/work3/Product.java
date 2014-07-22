package day13.work.work3;

public class Product {
	
	String pname;
	double price;
	int amount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String pname, double price, int amount) {
		// TODO Auto-generated constructor stub
		
		this.pname = pname;
		this.price = price;
		this.amount = amount;
		
	}

	public int getAmount() {
		return amount;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String printInfo()
	{
		return "상품명 : " + pname + " 가격 : " + price + " 수량 : " + amount;
	}
	
}
