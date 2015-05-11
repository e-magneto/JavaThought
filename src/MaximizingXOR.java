import java.util.Scanner;

public class MaximizingXOR {
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int left= sc.nextInt();
		int right= sc.nextInt();
		int maximum=0;
		for(int i=left;i<right; i++){
			for(int j=left; j<right; j++){
				int xorOps=i^j;
				if(xorOps>maximum){
					maximum=xorOps;
				}
			}
		}
		System.out.println("Output :"+maximum);
	}

}
