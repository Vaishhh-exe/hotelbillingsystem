package javapractices;

	import java.io.*;
	import java.text.ParseException;
	//import java.time.format.DateTimeFormatter;
	import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
//import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
	
	
	
	public class HotelBillingSystemProject {

	    public static void main(String[] args) throws ParseException {
	        Scanner sce = new Scanner(System.in);
	        File file = new File("bills.txt");

	        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
	        	System.out.println("Welcome!");
	        	
	        	System.out.println("Enter the number of customers checked in: " );
	        	int noOfCustomers=sce.nextInt();
	        	if(noOfCustomers <1)
	        	{
	        		System.out.println("Enter a valid number");
	        	}
	        	
	        	else
	        	{
	        		
					for(int i=0;i<noOfCustomers;i++)
	        		{
	        			System.out.println("Welcome to the Billing Counter !");
	        			
	        			sce.nextLine();
	        			System.out.print("Enter name of customer : ");
	     	            String name = sce.nextLine();
	     	            sce.nextLine();
	     	            writer.println("Customer Name: " + name);
	     	            
	     	            
	     	            System.out.println(" ");
	        			
	        			System.out.println("Choose the room type: ");
	        			System.out.println("1: Deluxe room");
	        			System.out.println("2: Super Deluxe room");
	        			System.out.println("3: Premium Suite");
	        			
	        			int numberofRoom=sce.nextInt();
	        			
	        			switch(numberofRoom)
	        			{
	        			case 1: System.out.println("Room type: Deluxe Room");
	        			
	        			break;
	        			
	        			case 2: System.out.println("Room type: Super Deluxe Room");
	        			
	        			break;
	        			
	        			case 3: System.out.println("Room type: Premium Suite");
	        			
	        			break;
	        			
	        			}
	     	           /* System.out.print("Enter name of customer : ");
	     	            String name = sce.nextLine();
	     	            sce.nextLine();
	     	            writer.println("Customer Name: " + name);*/
	     	            
	     	            
	     	            System.out.println(" ");
	     	            
	     	           sce.nextLine();
	     	            System.out.print("Enter room number: ");
	     	            String room = sce.nextLine();
	     	            writer.println("Room Number: " + room);
	     	           sce.nextLine();
	     	            
	     	            System.out.println(" ");
	     	            
	     	            
	     	          /*  System.out.print("Enter number of days stayed: ");
	     	            int days = sce.nextInt();
	     	            writer.println("Days Stayed: " + days);

	     	           sce.nextLine();
	     	            System.out.println(" ");*/
	     	            
	     	            
	     	           
	     	            //Amenities used
	     	            
	     	           // Additional charges
	     	           int extraBedCharge = 200;
	     	           int wifiCharge = 50;
	     	           int mealCharge = 200;
	     	           int poolCharge = 150;
	     	           
	     	           //input validation
	     	           
	     	           boolean mealsAdded;
	     	           boolean poolAdded;
	     	           boolean wifiEnabled;
	     	           boolean extrabedReq;
	     	         
	     	          
	     	          ChronoLocalDate checkInDate;
					  ChronoLocalDate checkOutDate;
					 
					  System.out.print("Check-in Date (yyyy-mm-dd): ");
					  checkInDate = LocalDate.parse(sce.next());
					 System.out.print("Check-out Date (yyyy-mm-dd): ");
					 checkOutDate = LocalDate.parse(sce.next());
					  
					 
					 if(checkOutDate.isBefore(checkInDate)) {
					    System.out.println("Error: Invalid check-out date. Please enter a date after the check-in date.");
					    return;
					}
					 
					 //System.out.print(" number of days stayed: ");
					 long days=ChronoUnit.DAYS.between(checkInDate, checkOutDate);
					 System.out.println ("Number of Days Stayed: " + days);
	     	          
	     	           
	     	           switch(numberofRoom)
	        			{
	        			case 1: System.out.println("Room rate: Rs.900 per night ");
	        			double total = days * 900;
	        			writer.println("Total Bill: " + total);

	     	            System.out.printf("Total bill for " +name+ " is Rs.%.2f\n", total);
	        			break;
	        			
	        			case 2: System.out.println("Room rate: Rs.1500 per night");
	        			double total1 = days * 1500;
	        			writer.println("Total Bill: " + total1);

	     	            System.out.printf("Total bill for " +name+ " is Rs.%.2f\n", total1);
	        			break;
	        			
	        			case 3: System.out.println("Room rate: Rs.3000 per night");
	        			double total2 = days * 3000;
	        			writer.println("Total Bill: " + total2);

	     	            System.out.printf("Total bill for " +name+ " is Rs.%.2f\n", total2);
	        			break;
	        			
	        			}
	     	           
	     	           //System.out.printf("Total bill for " +name+ " is Rs.%.2f\n", total);
	     	           
	     	           /*
	     	           System.out.println("");
	     	            System.out.print("Enter rate of room for one day: ");
	     	            double rate = sce.nextDouble();
	     	            writer.println("Room Rate: " + rate);*/

	     	            
	     	            System.out.println(" ");
	     	            
	     	            
	     	           /* double total = days * rate;
	     	            writer.println("Total Bill: " + total);

	     	            System.out.printf("Total bill for " +name+ " is Rs.%.2f\n", total);*/
	     	            System.out.println(" ");
	     	            System.out.println("*********************************************************");
	     	          
	     	          }
	        	
	        	}
	        }

	        	
	        	
	        		catch (IOException e) {
	     	            System.out.println("Error writing to file: " + e.getMessage());
	     	        }
	        	
	        			
	        		
	    
	        }
}

	
