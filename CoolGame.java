import java.util.Random;
import java.util.Scanner;
public class CoolGame {
	public static void main(String args[]) {
		Random r=new Random();
		int guessed_number = r.nextInt(1000);
		int ntries=0;
		Scanner n=new Scanner(System.in);
		int guess;
		boolean success=false;
		
		while(success==false) {
			System.out.println("guess between 1 and 1000:");
			guess=n.nextInt();
			ntries++;
			
			if(guess==guessed_number) {
				success=true;
				
			}
			else if(guess<guessed_number) {
				System.out.println("your guess is too low");
			}
			else if(guess>guessed_number) {
				System.out.println("your guess is high" );
			}
		}
		System.out.println("Win");
		System.out.println("number was:"+guessed_number);
		System.out.println("It took you "+ntries+" chances");
			
		}
	}
//saurabhm
