package overriding;

public class Interest {
	public static void main(String[] args) {
		Rbi r=new Rbi();
		System.out.println(r.findInterest(60000));
		
		Axis a=new Axis();
		System.out.println(a.findInterest(60000));
		
		Rbi r1=new Axis();
		System.out.println(r1.findInterest(60000));
	}

}
