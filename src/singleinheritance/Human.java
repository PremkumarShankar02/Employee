package singleinheritance;

public class Human {
	String name;
	int age;
	String gender;
	
	public int sleepingHour(int workingHrs,int idelHrs,int eatingHrs) {
		return 24-(workingHrs+idelHrs+eatingHrs);
	
	}

}
