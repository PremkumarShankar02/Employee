package singleinheritanceusingprivatekeyword;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike("BMW",1000000,2,true);
		
		System.out.println(b+" "+b.findMileage(20)+" "+b.isPetrol("Disel"));
	}

}
