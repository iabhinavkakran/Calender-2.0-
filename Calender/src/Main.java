import java.util.*;
public class Main {
	
    public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Date in 'DD MM YYYY' format");
		int date=scan.nextInt();
		int month=scan.nextInt();
		int year=scan.nextInt();
		if(month==1)
		{
			if(date>=1 || date<=31)
			{
				month=1;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==2)
		{
			if( (year%4==0)  && (year%100 !=0) || (year%400==0))
			 {
			   if(date>=1 || date<=29)
			    {
				   month=4;
			    }
			 }
			else if(date>=1 || date<=28)
		    {
			   month=4;
		    }
			else 
			  System.out.println("Invalid Date");
			  
		}
		else if(month==3)
		{
			if(date>=1 || date<=31)
			{
				month=4;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==4)
		{
			if(date>=1 || date<=30)
			{
				month=0;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==5)
		{
			if(date>=1 || date<=31)
			{
				month=2;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==6)
		{
			if(date>=1 || date<=30)
			{
				month=5;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==7)
		{
			if(date>=1 || date<=31)
			{
				month=0;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==8)
		{
			if(date>=1 || date<=31)
			{
				month=3;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==9)
		{
			if(date>=1 || date<=30)
			{
				month=6;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==10)
		{
			if(date>=1 || date<=31)
			{
				month=1;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==11)
		{
			if(date>=1 || date<=30)
			{
				month=4;
			}
			else 
				System.out.println("Invalid Date");
		}
		else if(month==12)
		{
			if(date>=1 || date<=31)
			{
				month=6;
			}
			else 
				System.out.println("Invalid Date");
		}
		
		
		int dupYear=year;
		dupYear = dupYear/100;
		if(dupYear==16 || dupYear==20)
		 {
			dupYear=6;
		 }
		else if(dupYear==17 || dupYear==21)
		 {
			dupYear=4;
		 }
		else if(dupYear==18 || dupYear==22)
		 {
			dupYear=2;
		 }
		else if(dupYear==19 || dupYear==23)
		 {
			dupYear=0;
		 }
		else
			System.out.println("Invaid Year");
		
		int sum=date+month+dupYear+(year%100)+((year%100)/4);
		sum%=7;
		if(sum==0)
			System.out.println("Saturday");
		else if(sum==1)
			System.out.println("Sunday");
		else if(sum==2)
			System.out.println("Monday");
		else if(sum==3)
			System.out.println("Tuesday");
		else if(sum==4)
			System.out.println("Wednesday");
		else if(sum==5)
			System.out.println("Thursday");
		else if(sum==6)
			System.out.println("Friday");
		}

}
