import java.util.Arrays;

public class Lab1 {
	public static void main(String[] args){
		int[] num = new int[6];
		num[0]= 123;
		num[1]= 456;
		num[2]= 479;
		num[3]= 135;
		num[4]= 246;
		num[5]= 135;
		int sum = 0;
		int avg = 0;
		Arrays.sort(num);
		int i = 0;
		System.out.println("The array in order is:");
		while (i<6){
			System.out.printf("%d\n",num[i]);
			sum = sum + num[i];
			i +=1;
		}
		avg = sum/6;
		System.out.printf("The average is %d.",avg);
		
	}
}
