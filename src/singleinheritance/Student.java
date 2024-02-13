package singleinheritance;

public class Student extends Human {
	String college;
	
	public int StudyHrs(int idelHrs,int eatingHrs,int sleepingHrs) {
		return 24-(idelHrs+eatingHrs+sleepingHrs);
		
	}

}
