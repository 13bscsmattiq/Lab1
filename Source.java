public class MatrixMultiplication {
	public static int[][] MatrixMulti(int[][] A, int[][] B){
		for(int i = 0; i< A.length;i++){
			for(int j = 0; j< A[0].length;j++){
				System.out.print(A[i][j]+"\t");
			}
		}
		for(int i = 0; i< B.length;i++){
			for(int j = 0; j< B[0].length;j++){
				System.out.print(B[i][j]+"\t");
			}
		}
		
		int[][] C = new int[A.length][B[0].length];
		if(A.length != B[0].length){
			System.out.print("Matrix Multiplication is not possible, Rows of A not equal to Columns of B");
		}
		else{
			for(int i = 0; i < C.length ;i++ ){
				for(int j = 0; j < C.length;j++){
					for(int k = 0; k < C.length;k++){
						C[i][j] =C[i][j] + A[i][k]*B[k][j];
						System.out.print("\n"+C[i][j]+"\t");
						
					}
					
				}
				}
			
		}
		
		return C;
		}
}










public class Lab1 {

	public static void main(String[] args) {
		int [][] Mat1 = new int[][]{{1}};
        int [][] Mat2 = new int[][]{{1},{3},{1}};
        
       
        System.out.print(MatrixMultiplication.MatrixMulti(Mat1,Mat2));
        
  }
}
