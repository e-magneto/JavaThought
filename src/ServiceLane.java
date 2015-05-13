import java.util.Scanner;

public class ServiceLane {
	
	
	public static void vehicleMovement(int [] arr, int startIndex, int endIndex){
		int min=arr[startIndex];
		for(int i=startIndex; i<=endIndex; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		System.out.println(min);
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		String line_test= in.nextLine();
		String [] line_test_arr= line_test.split(" ");
		
		int numberOfTests= Integer.parseInt(line_test_arr[0]);
		int lane_length= Integer.parseInt(line_test_arr[1]);
		
		String line= in.nextLine();
		String [] arrLine= line.split(" ");
		int [] arrInt= new int[arrLine.length];
		for(int i=0; i<arrInt.length; i++){
			arrInt[i]= Integer.parseInt(arrLine[i]);
		}
		
		for(int j=0; j<numberOfTests; j++){
			String indexLine= in.nextLine();
			String [] indexArr= indexLine.split(" ");
			int startIndex= Integer.parseInt(indexArr[0]);
			int endIndex= Integer.parseInt(indexArr[1]);
			vehicleMovement(arrInt, startIndex, endIndex);
		}
				
	}

}
