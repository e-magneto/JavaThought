import java.util.ArrayList;
import java.util.Scanner;

public class FindDigits {
	@SuppressWarnings("resource")
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int numberOfTests= in.nextInt();
		for(int i=0; i<numberOfTests; i++){
			int count=0;
			int numberFinal= in.nextInt();
			int number= numberFinal;
			ArrayList<Integer> arrInt= new ArrayList<Integer>();
			while(number>0){
				int digit= number%10;
				arrInt.add(digit);
				number= number/10;
			}
			
			for(Integer num : arrInt){
				System.out.println("in num :"+num);
				if(num !=0 && numberFinal%num.intValue()==0){
					count++;
				}
			}
			
			System.out.println(count);
		}
			
	}

}
