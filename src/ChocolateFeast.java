import java.util.Scanner;

public class ChocolateFeast {
	
	public static long chocoCount(int N, int C, int M){
		int finalcount=0; 
		int count =0;
		if(N>C){
			finalcount = N/C;
			int tempcount=finalcount;
			count= finalcount;
			while(tempcount>=M){
				count +=tempcount/M;
				tempcount= tempcount/M+tempcount%M;
			}
		}
		return (long)count;
	}
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		int numberOfTests= in.nextInt();
		for(int i=0; i<numberOfTests; i++){
			int money= in.nextInt();
			int price= in.nextInt();
			int wrapper= in.nextInt();
			long answer=chocoCount(money, price, wrapper);
			System.out.println(answer);
		}
	}

}
