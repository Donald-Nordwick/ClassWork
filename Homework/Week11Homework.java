import java.util.Scanner;
public class Week11Homework {
	public static void main(String[]Args){
		int DiceAmt = 0;
		int i = 0;
		int  j = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in the amount of times you would like to guess:");
		int guess=input.nextInt();
		while (j==0){
			System.out.println("Please enter in the amount of dies you would like to be rolled");
			DiceAmt = input.nextInt();
			if(DiceAmt<1){
				System.out.println("Please enter a value above 0");
			}
			else{
				j++;
			}
		}
		Dice Roll = new Dice(DiceAmt);
		int[] score=new int[guess];
		int[] roll=new int[guess];
		int[] humGuess=new int[guess];
		j=0;
		while(i<guess){
			roll[i]= Roll.roll(DiceAmt);
			System.out.println(roll[i]);
			System.out.printf("What total number do you think was rolled with %d die?\n", DiceAmt);
			System.out.println(roll[i]);
			humGuess[i]=input.nextInt();
			if ((humGuess[i]<1)||(humGuess[i]>6*DiceAmt)){
				System.out.printf("Please choose a number betwee 1 and %d.",6*DiceAmt );
				score[i]=score[i-1];
			}
			else if (humGuess[i]==roll[i]){
				System.out.println("Congrats, you chose right!");
				j++;
				score[i]=j;
			}
			else{
				System.out.println("Sorry you chose wrong.");
				if (i>0){
				score[i]=score[i-1];
				}
			}
			i++;
		}
		j=0;
		while(j<guess){
			System.out.printf("Your Guess:	%d	Total Roll:	%d	Your Score So Far:	%d\n",humGuess[j],roll[j], score[j]);
			j++;
		}
	}
}
