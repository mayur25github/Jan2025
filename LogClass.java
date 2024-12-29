package LogPack;

public class LogClass {

	public static void main(String[] args) {
		//123321
	int no=1233251;
	int temp=no;
	int rev=0,rem;
	
	while(temp!=0) {
		rem=temp%10;
	    rev=rev*10+rem;
	    temp=temp/10;
	}
	    
	    if(no==rev) {
	    	System.out.println("is palindrom");
	    }
	    else{
	    	System.out.println("Not palindrom");
	    }
	    
	    
		

	}

}
