package overloading;

public class Calculator {
	public String add(int a,int b) {
		return "Ans= "+(a+b);
	}
	public String add(int a,float b) {
		return "Ans= "+(a+b);
	}
	public String add(int a,int b,int c) {
		return "Ans= "+(a+b+c);
	}
	public String add(float a,long b) {
		return "Ans= "+(a+b);
	}

}
