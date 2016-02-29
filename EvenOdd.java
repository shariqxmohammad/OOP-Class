import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Write an application that asks a user to enter an integer. 

		Display a statement that indicates whether the integer is even or odd. 

		Save the file as EvenOdd.java. **/
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		if((in.nextInt()%2) == 0)
		{
			System.out.println("The integer is even.");
		}
		else
		{
			System.out.println("The integer is odd. ");
		}

	} 
}

		
	
	



