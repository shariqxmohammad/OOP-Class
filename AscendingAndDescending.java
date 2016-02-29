import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int num1, num2, num3; 
		int low, medium, high; 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");	
			num1 = in.nextInt();
		System.out.println("Enter another integer: ");
			num2 = in.nextInt();
		System.out.println("Enter one last integer :) : ");	
			num3 = in.nextInt();
		in.close();
		
		//Determines highest number
			
		if(num1 >= num2 && num1 >= num3){
			high = num1; 
		}
		else if(num2 >= num1 && num2 >= num3){
			high = num2; 
		}
		else
		{
			high = num3; 
		}
	
		//Determines mid number
		
		if(num1 >= num2 && num1 <= num3){
			medium = num1;
		}
		else if(num2 >= num1 && num2<= num3){
			medium = num2;
		}
		else if(num2 <= num1 && num2 >= num3)
		{
			medium = num2; 
		}
		else
		{
			medium = num3; 
		}
		
		//Determines lowest number
		
		if(num1 <= num2 && num1 <= num3){
			low = num1;
		}
		else if(num2 <= num1 && num2 <= num3){
			low = num2; 
		}
		else
		{
			low = num3; 
		}
		System.out.print("Highest to lowest number: " + high + ", " + medium + ", " + low);
		}
		
}



