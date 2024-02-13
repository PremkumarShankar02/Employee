package singleinheritance;

public class UseStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Prem";
		s.age=28;
		s.gender="Male";
		s.college="MGR";
		
		System.out.println(s.name+" "+s.age+" "+s.gender+" "+s.college+" "+s.sleepingHour(9,3,3)+" "+s.StudyHrs(3, 3, 8));
	}

}
