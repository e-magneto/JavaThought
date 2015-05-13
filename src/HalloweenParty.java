import java.util.Scanner;

public class HalloweenParty {
	
	public static void numberOfChoco(int cutTurns){
			long sideX= cutTurns/2;
			System.out.println(sideX*((long)cutTurns- sideX));
	}
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int numberofTest= sc.nextInt();
		for(int i=0; i<numberofTest; i++){
			int numberOfCuts= sc.nextInt();
			numberOfChoco(numberOfCuts);
		}
	}

}
