import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		
		int number = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int userchoice = 0;
		
		System.out.println("Enter the number between 1 to 100");
		do {
			userchoice = sc.nextInt();
			if (userchoice == number) {
				
				System.out.println("Your Guess The right number");
				break;
			}
			else if (userchoice > number) {
				
				System.out.println("Your number is too large");
			}
			else {
				System.out.println("Your number is too small");
			}
		} while (userchoice>0);
		
		System.out.println("The Game is over");
		
	}

}
