import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
	public static void main(String [] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine().toLowerCase().replace(" ", "");
		HashSet<Character> hashset= new HashSet<Character>();	
		for(char ch='a'; ch<'z'; ch++){
			hashset.add(ch);
		}
		
		for(int i=0; i<str.length(); i++){
			hashset.remove(str.charAt(i));
		}
		
		if(hashset.isEmpty()){
			System.out.println("pangram");
		}
		else{
			System.out.println("not pangram");
		}
		
	}
}
