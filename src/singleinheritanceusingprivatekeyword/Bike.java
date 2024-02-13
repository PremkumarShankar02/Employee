package singleinheritanceusingprivatekeyword;

public class Bike extends Vehical {
	private String brand;
	private int price;
	public boolean isPetrol(String fuel) {
		if(fuel.equalsIgnoreCase("petrol")) {
			return true;
		}
		else {
			return false;
		}
	}
	public Bike(String brand,int price,int noOfTyres,boolean isGear) {
		super(noOfTyres,isGear);
		this.brand=brand;
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	 public String toString() {
		 return brand+" "+price+" "+super.toString();
	 }
}
