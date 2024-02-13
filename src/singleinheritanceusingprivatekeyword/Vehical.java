package singleinheritanceusingprivatekeyword;

public class Vehical {
	private int noOfTyres;
	private boolean isGear;
	
	public String findMileage(int speed) {
		if(speed>0  && speed<=20) {
			
          return "Mileage is "+speed;
		}
		else if(speed>20 && speed<=40) {
			return "Mileage is "+speed;
			
		}
		else {
			return "Mileage is "+speed;
		}
	}
	
	public Vehical(int noOfTyres,boolean isGear) {
		this.noOfTyres=noOfTyres;
		this.isGear=isGear;
	}
	
	public void setNoOfTyres(int noOfTyres) {
		this.noOfTyres=noOfTyres;
	}
	public int getNoOfTyres() {
		return noOfTyres;
	}
	public void setIsGear(boolean isGear) {
		this.isGear=isGear;
	}
	public boolean getIsGear() {
		return isGear;
	}
	public String toString() {
		return noOfTyres+" "+isGear;
	}

}
