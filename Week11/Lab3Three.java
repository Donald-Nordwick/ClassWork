import java.util.Scanner;
public class Lab3Three {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many times did the dice bounce?");
		int bounce = input.nextInt();
		Dice Dice = new Dice(bounce);
		int Test = Dice.Test2();
		System.out.println(Test);
		int Roll = Dice.Value();
		
		System.out.println(Roll);
		
	}
}
