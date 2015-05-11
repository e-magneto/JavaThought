import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LonelyIntegers {
	
	static int lonelyinteger(int[] a) {
	      int lonelyInt=0; 
			List<Integer> pairInts= new ArrayList<Integer>();
			for(int i=0; i<a.length-1; i++){
				for(int j=i+1; j<a.length; j++){
					if(a[i]==a[j]){
						pairInts.add(a[i]);
					}
				}
			}
			for(int j=0; j<a.length; j++){
				if(!pairInts.contains(a[j])){
					lonelyInt=a[j];
				}
			}
			return lonelyInt;
	    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = lonelyinteger(_a);
	        System.out.println(res);
	        
	    }

}
