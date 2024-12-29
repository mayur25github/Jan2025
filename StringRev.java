package LogPack;

public class StringRev {

	public static void main(String[] args) {
		//Mayur
		String name="MaYuRgHuGe";
		String rev="";
		int leng =name.length();
		int leng1 =name.length();
				
		
		for(int i=leng-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);

	}

}
