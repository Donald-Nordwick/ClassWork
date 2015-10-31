import java.util.Scanner;

public class LabFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int size = 10;
		int[] evenGuess = new int[size]; 			//keeps track of even guesses
		int[] oddGuess = new int[size];				//keeps track of the amount of odd rolls
		int[] won = new int[size];					//keeps track of the amount of times the player won
		int[] lost = new int[size];				//keeps track of the amount of times the player lost
		int[] compNum = new int[size];				//keeps track of the number of tries
		int[] round = new int[size];
		int dieRoll=0;
		int gameNum = 0;
		int high = 0;
		int low = 0;
		String response=null;
		
		
		
		System.out.println("Please choose the highest number the dice can roll:");
		high=input.nextInt();
		RandomNumber ranNum = new RandomNumber(high);
		
		while (i < 10) {

			
			
			dieRoll= ranNum.Random_Number();
			compNum[i] = dieRoll;
			gameNum = dieRoll%2;
			
			/* Because the game is only having the player guess odd or even I can have the program 
			 * generate 1 or 2 for my odd or even*/
			
			
			System.out.println("Guess if the dice is odd or even. Use 1 for odd and 0 for even.");
			int ans = input.nextInt();
			if ((ans < 0) || (ans > 1)) {
				System.out.println("Please use either 0 or 1");

			}
			else {
				if (ans == 0) {
					evenGuess[i] = 1;
				} else {
					oddGuess[i] = 1;
				}
				if (ans == gameNum) {
					response = "You guessed right";
					won[i] = 1;
					
				} else {
					response = "Sorry you guessed wrong";
					lost[i] = 1;
				}
			}
			

			System.out.println(response);
			i++;
			round[i-1]= i;
			
		}
		i=0;
		while (i<10){
			System.out.printf("Round: %d, Even Guess: %d, Odd Guess: %d, Computer's Number: %d, Won: "
					+ "%d\n",round[i],evenGuess[i],oddGuess[i],compNum[i],won[i] );
			i++;
		}

	}
}