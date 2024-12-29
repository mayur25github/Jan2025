package LogPack;

public class FigonacciClass {

	public static void main(String[] args) {
		
		//011234567
		int a=0;
		int b=1;
		System.out.print(a);
		int c;
	
		for(int i=0;i<=5;i++) {
			c=a+b;
			System.out.print(c);
			 a=b;
			 b=c;
		}
			
		}

	}


