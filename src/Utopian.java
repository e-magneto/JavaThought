import java.util.Scanner;

public class Utopian {
	public static int findHeight(int numberOfCycles){
		int height=1;
		if(numberOfCycles==0){
			return height;
		}
		for(int i=1; i<=numberOfCycles; i++){
			
			if(i%2==0){
				height=height+1;
			}
			else{
				height=height*2;
			}
		}
		return height;
	}
	
	
	public static void main(String [] args){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 
		int numberOftests= sc.nextInt();
		
		while(numberOftests!=0){
			int numberOfCycles= sc.nextInt();
			int total=findHeight(numberOfCycles);
			System.out.println("height of Utopian "+total);
			numberOftests--;
			System.out.println("number of test :"+numberOftests);
		}
		
	}
}
