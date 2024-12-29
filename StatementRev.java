package LogPack;

public class StatementRev {

	public static void main(String[] args) {
		String str = "Mayur is clever boy";
		String[] words = str.split("");
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			String word = words[i];
			StringBuilder reverseword = new StringBuilder(word).reverse();
			result.append(reverseword).append("");
			
			
		}
		
		System.out.println(result.toString().trim());

	}

}
