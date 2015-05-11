import java.util.Scanner;

public class MysteryLetters {
	
	public static int palindromMaker(String input){
		
		int result=0;
		
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			result += Math.abs((int)input.charAt(i) - (int)input.charAt(j)); 
		}
		return result;
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		  Scanner sc = new Scanner(System.in);
		  int numberOftests= sc.nextInt();
		  for(int i=0; i<numberOftests; i++){
		  	String str= sc.next();
		  	int result= palindromMaker(str);
			  System.out.println(result);
		  }
	}

}
