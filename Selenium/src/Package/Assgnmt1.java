package Package;

public class Assgnmt1 {
	
	public int addn  (int a , int b)
	
	{
		int c = a+b;
		return c;
		
		
	}
	 public int sub (int x , int y )
	 {
		 int s = x-y;
		return s;
		
	 }
	 public int mul (int f , int e)
	 {
		 int m= f*e;
		 return m;
	 }
	 public int div (int i, int g)
	 {
		 int d =  i/g;
		 return d;
	 }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assgnmt1 AG = new Assgnmt1();
		int R = AG.addn(10, 2);
		System.out.println("Addn is "+R);
		int R2 = AG.addn(R, 2);
		System.out.println("Next Addn is "+R2);
		int R3 = AG.sub(R2, 2);
		System.out.println("Subtraction is" + R3);
		int R4 = AG.mul(R3, 2);
		System.out.println("Multiplication is " + R4);
		int R5 = AG.div(R4, 2);
		System.out.println("Division is " + R5);
		
				
	
		
				
	}

}
