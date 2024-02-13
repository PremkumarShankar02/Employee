package overriding;

public class Mileage {
	public static void main(String[] args) {
		SuperCar sc=new SuperCar();
		System.out.println(sc.findMileage(50));
		
		Car c=new Car();
		System.out.println(c.findMileage(50));
	
	}

}
