package LogPack;

public class Palindrome {

	public static void main(String[] args) {
		int no=131;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0)
		{
		    rem=temp%10;
		    rev=rev*10+rem;
		    temp=temp/10;
		}
		if(no==rev) {
			System.out.println(no+" is pali");
		}
		else {
			System.out.println(no+" not pali");
		}

	}

}
