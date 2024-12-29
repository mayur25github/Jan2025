package LogPack;

public class Remove {

	public static void main(String[] args) {
//		String text="@mayur123";
//		String newtext=text.replace("@mayur", "");
//		System.out.println(newtext);
		String text="@mayur123";
		int ab = Integer.parseInt(text.replaceAll("[\\D]", ""));
		System.out.println(ab);
		
		String text1="@mayur124";
		String a = text1.replace('m', 's');
		System.out.println(a);
	}

}
