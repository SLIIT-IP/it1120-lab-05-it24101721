import java.util.Scanner;
public class it24101721Lab5Q3 {
	public static void main (String[]arg){
		Scanner date = new Scanner (System.in);
		
		System.out.print("Enter the checkin date [1-31]: ");
		double cdate = date.nextInt();

		System.out.print("Enter the checkout date [1-31]: ");
		double codate = date.nextInt();

		if (cdate>31 || codate>31 ){
		System.out.print("the number must between 1 to 31");
		return;
		}
		if (cdate<0 || codate<0 ){

		System.out.print("the number must between 1 to 31");
		return;
		}
		if (cdate>codate)
		{
		System.out.print("Start date is should be less than end date.");
		return;
		}
		final double THE_ROOM_CHARGE = 48000;		
		final double DISCOUNT_RATE_FOR_3_TO_4_DAYS = 10;
		final double DISCOUNT_RATE_FOR_ABOVE_5_DAYS = 20;

		System.out.println("");
		System.out.println("Room charge per day:"+THE_ROOM_CHARGE);

		double ndays = codate - cdate;
		System.out.println("Number of days reserve :"+ndays);
		
		double discount = 0;
		if (3<ndays && ndays<5)
		{
			discount= DISCOUNT_RATE_FOR_3_TO_4_DAYS;
		}
		else if (5<ndays)
		{
			discount = DISCOUNT_RATE_FOR_ABOVE_5_DAYS;
		}
		double discountamount = (THE_ROOM_CHARGE*discount)/100;
		double total = THE_ROOM_CHARGE - discountamount;
		
		System.out.println("Total amount to be paid :"+total);

	}
}
		


		