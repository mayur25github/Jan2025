3package LogPack;

public class RevereseNumber {

	public static void main(String[] args) {
		//1234
		int no=1234;
		int rev=0,rem;
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		System.out.println(rev); 

	}

}
