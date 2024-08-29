import java.util.Scanner;
public class it24101721Lab5Q1 {
	public static void main (String[]args){
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number :");
		int fnumber = Scanner.nextInt();

		System.out.print("Enter the second number :");
		int snumber = Scanner.nextInt();

		System.out.print("Enter the third number :");
		int tnumber = Scanner.nextInt();

		System.out.println();
		System.out.println("User entered numbers are :"+fnumber+" "+snumber+" "+tnumber);

		int lnumber;
		lnumber = fnumber;

		if(lnumber<snumber){
		lnumber = snumber;
		}
		if (lnumber<tnumber){
		lnumber= tnumber;
		}
		int smnumber;
		smnumber = fnumber ; 
		if(smnumber > snumber){
		smnumber = snumber ; 
		}
		if (smnumber >tnumber){
		smnumber = tnumber ; 
		}

		System.out.println("The largest number is :" +lnumber);
		System.out.println("The Smallest number is :"+smnumber);
	}
}