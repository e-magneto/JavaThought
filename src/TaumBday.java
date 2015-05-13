import java.util.Scanner;

public class TaumBday {
	
	public static void costCalculator(long unitB, long unitW, long costB, long costW, long exchange){
		long totalCost=0;
		if(costB>(costW+exchange)){
			totalCost= (costW+exchange)*unitB;
		}else{
			totalCost= costB*unitB;
		}
		
		if(costW>(costB+exchange)){
			totalCost= totalCost+ (costB+exchange)*unitW;
		}else{
			totalCost = totalCost+costW*unitW;
		}
		System.out.println(totalCost);
	}
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int numberOfTests= in.nextInt();
		for(int i=0; i<numberOfTests; i++){
			long unitB=(long) in.nextInt();
			long unitW=(long) in.nextInt();

			
			long costB= (long)in.nextInt();
			long costW= (long)in.nextInt();
			long exchange= (long)in.nextInt();
			
			
			
			costCalculator(unitB, unitW, costB, costW, exchange);
			
		}
	}

}
