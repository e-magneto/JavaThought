import java.util.Scanner;

public class AngryProfessor {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test;
        test = in.nextInt();
        while( test>0 )
        {
            int totalStud, count=0, min;
            totalStud = in.nextInt();
            min = in.nextInt();
            int[] entryTime = new int[totalStud];
            for(int i=0;i<totalStud;i++)
            {    entryTime[i] = in.nextInt();
                   if ( entryTime[i] <= 0)
                        ++count; 
            }
            if ( count < min )
                 System.out.println("YES");
            else
                 System.out.println("NO");
            test--;
        }
	}

}
