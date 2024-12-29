package LogPack;

public class Reverse {

	public static void main(String[] args) {
		String input = "MAYUR IS PLG INSANN HAI";
        String[] words = input.split(" "); // Split the string into words
        StringBuilder result = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Reverse each word and append to result
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            result.append(reverseWord).append(" ");
        }

        // Trim the final result to remove any extra space
        System.out.println(result.toString().trim());

	}

}
