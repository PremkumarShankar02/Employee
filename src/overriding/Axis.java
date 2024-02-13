package overriding;

public class Axis extends Rbi{
	public String findInterest(int amount) {
		return "Interest Amount= "+(amount*10/100);
	}

}
