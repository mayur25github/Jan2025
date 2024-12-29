package LogPack;
import java.lang.*;

public class AddInt {
	static String s = "60fdf5ffrf80frfr4fr5";

	public static void main(String[] args) {
		//Write a program to add the integers available in the string
		String number = "";
		int temp = 0;
		int flag = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {

				number = number + s.charAt(i);
				System.out.println("Sum of the integer"+number);  
				System.out.println("Sum of the char"+s.charAt(i)); 
				

				flag = 1;

				if (i != (s.length() - 1))
					continue;

			}

			if (flag == 1) {

				int value = Integer.parseInt(number);
				number = "";
				temp = value + temp;

				flag = 0;

			}

		}

		System.out.println("the addition of number are :" + temp);
	} 

			
		}

	


