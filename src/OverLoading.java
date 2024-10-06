public class OverLoading {
    
    public int sum(int a,int b) {
		return (a+b);
		
	}
	public float sum(float a,float b) {	
		return (a+b);
		
		
	}
	
	public double sum(double a,double b,double c) {
		return (a+b+c);
	}

	public static void main(String[] args) {
		OverLoading s = new OverLoading();
		System.out.println(s.sum(5, 4));
		System.out.println(s.sum(90, 5, 4));
		
		   
		
		
		
		
	}
}
