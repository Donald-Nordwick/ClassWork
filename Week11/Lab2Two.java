import java.util.Scanner;
public class Lab2Two {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Dice Dice = new Dice();
		System.out.println("How many times did the dice bounce?");
		int bounce = input.nextInt();
		Dice.Throw(bounce);
		int test = Dice.Test2();
		System.out.println(test);
		int Roll = Dice.Value();
		
		System.out.println(Roll);
		
	}
}
