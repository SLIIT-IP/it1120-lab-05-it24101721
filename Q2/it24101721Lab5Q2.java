import java.util.Scanner;
public class it24101721Lab5Q2 {
	public static void main(String[]args){
		Scanner members = new Scanner (System.in);

		System.out.print("Enter the number of members introduced :");
		int nmembers = members.nextInt();

		if (nmembers<0){
		System.out.print("the input must be a number 0 or greater");
		}
		
		
		switch (nmembers) {
			case 0 :
				System.out.print("No prize");
				break;
			case 1 :
				System.out.print("Prize is a : Pen");
				break;
			case 2 :
				System.out.print("Prize is a : Umbrella");
				break ;
			case 3 :
				System.out.print("Prize is a : Bag ");
				break;
			case 4 :
				System.out.print ("Prize is a : Travelling Chair");
				break;
			default :
				System.out.print("Prize is a : Headphone");
				break;
		}
	}	
}

			

		


		
