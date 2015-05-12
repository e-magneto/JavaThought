import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {
	
	public static void cutStickImpl(int [] _a){
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<_a.length; i++){
			list.add(_a[i]);
		}
		countMaker(list);
		
	}
	
	
	public static void countMaker(List<Integer> list){
		List<Integer> tmpList= new ArrayList<Integer>();
		Collections.sort(list);
		int count=0;
		for(Integer in: list){
			if(in>0){
				in = in- list.get(0);
				count++;
				if(in>0){
					tmpList.add(in);	
				}
			}
		}
		
		System.out.println(count);
		if(tmpList.size()>=1){
		countMaker(tmpList);
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		
		 	Scanner in = new Scanner(System.in);
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        cutStickImpl(_a);
    }

}
