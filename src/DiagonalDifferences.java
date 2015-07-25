public class DiagonalDifferences {
	
	public static void main(String [] args){
		Scanner sc=null;
		try{
		sc= new Scanner(System.in);
		int sizeOfMatrix= sc.nextInt();
		int [][] matrix= new int[sizeOfMatrix][sizeOfMatrix];
		for(int i=0; i<sizeOfMatrix; i++){
			for(int j=0; j<sizeOfMatrix; j++){
				matrix[i][j]= sc.nextInt();
				System.out.println(matrix[i][j]);
			}
		}
		int firstDiagonalSum= 0;
		int secondDiagonalSum=0;
		for(int n=0; n<sizeOfMatrix; n++){
			firstDiagonalSum = firstDiagonalSum+matrix[n][n];
			System.out.println("First Sum "+firstDiagonalSum);
		}
		int length= sizeOfMatrix;
		for(int n=0; n<sizeOfMatrix; n++){
				secondDiagonalSum = secondDiagonalSum+matrix[n][length-1];
				System.out.println("second Sum "+secondDiagonalSum);
				length--;
		}
		
		System.out.println(Math.abs(secondDiagonalSum-firstDiagonalSum));
	}finally{
		sc.close();
	}
	
				
	}

}
