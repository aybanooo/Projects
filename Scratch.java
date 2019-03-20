import java.util.Scanner;

public class Scratch
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double time,hours,minutes=0,price=0;
		
		time=s.nextInt();
			minutes=(time%60);
			
			hours=(int)time/60;
			price = time%60==0 ?  hours*40:hours*40+minutes;
		
		System.out.println( hours + " hours and " + minutes + " minutes " );
		System.out.println("price is: " + price);
	}	
}