
public class MatrixOperations {
	
	static int row;
	static int col;
	public static void main(String [] args){
		
		double [][] matrixA = {	{1,1,1},
								{2,5,2},
								{6,7,3}};
		
		double [][] matrixB = {	{5,9,10},
								{2,5,3},
								{8,1,5}};
		
		double ratio = 5;
		//get the size of array
		row = matrixA.length;
		col = matrixA[row-1].length;
			
matrixScale(matrixA, ratio);
addMatrix(matrixA, matrixB);		
	}
	
	//create a method to scale the elements of a matrix by value ratio
public static void matrixScale(double a[][], double ratio){
	
	for(int i = 0; i < 3; i++){
		for (int j = 0; j< 3; j++){
			a[i][j] *= ratio;
			System.out.println(a[i][j]);
		}
	}
}
	
	
	
	//create a method to add two matrices A and B and return the sum matrix
	public static void addMatrix(double a[][], double b[][]){
		
		
		double c[][] = new double[3][3];
		for(int i = 0; i < 3; i++){
			for (int j = 0; j< 3; j++){
				
				c[i][j] = a[i][j] + b[i][j];
				System.out.println(c[i][j]);
			}
	}
	}}
