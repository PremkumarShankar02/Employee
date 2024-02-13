package overriding;

public class SuperCar {
	public String findMileage(int speed) {
		if(speed>0 && speed<30) {
			return "Mileage is 50 ";
		}
		else if(speed>30 && speed<60) {
			return "Mileage is 40";
		}
		else {
			return "Mileage is 30";
		}
		
	}

}
