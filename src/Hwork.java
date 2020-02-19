import java.util.Scanner;


public class Hwork {
	public static int getrandom(int max, int min){
	    int x = (int) ((Math.random()*((100)+1))+0);
	    return x;
	}
	
	public static void enterMatrixData(Scanner scan, int[][] matrix, int i, int j){
	     System.out.println(" ");
	          
	          for (int a = 0; a < i; a++)
	          {
	              for (int b = 0; b < j; b++)
	              {
	                  matrix[a][b] = getrandom(0,100);
	              }
	          }
	  }
	public static void printMatrix(int[][] matrix, int i, int j){
	    System.out.println("Your Matrix is : ");
	        
	        for (int a = 0; a < i; a++)
	        {
	            for (int b = 0; b < j; b++)
	            {
	                System.out.print(matrix[a][b]+"\t");
	            }
	             
	            System.out.println();
	        }
	}
	public static void printMatrixx(int[][] matrix, int i, int j){
	    System.out.println("Your New Matrix is : ");
	        
	            	if( i==j ) {
	    				for(int a = 0; a<i;a++) {
	    					for (int b = 0; b < j; b++)
	    		            {
	    		                if ((matrix[a][b])%2 != 0) {
	    		                	matrix[a][b] = 1;
	    		                	
	    		                }
	    		                else {
	    		                	matrix[a][b] = 0;
	    		                    		
	    		                }
	    		                System.out.print(matrix[a][b]+"\t");
	    		            }
	    					 System.out.println();
	    				}
	    				
	    			 }
	            	else {
	            		for(int a = 0; a<i;a++) {
	    					for (int b = 0; b < j; b++)
	    		            {
	    		                if ((matrix[a][b])%2 == 0) {
	    		                	matrix[a][b] = 1;
	    		                	
	    		                }
	    		                else {
	    		                	matrix[a][b] = 0;
	    		                    		
	    		                }
	    		                System.out.print(matrix[a][b]+"\t");
	    		            }
	    					 System.out.println();
	    				}
	            		
	            	}
	                
	         
	}
		
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
			System.out.println("enter row number: "  );
			int i = scan.nextInt();
			System.out.println(" enter column number: ");			
			int j = scan.nextInt();
			int[][] matrix = new int[i][j];
			
			enterMatrixData(scan, matrix, i, j);
			printMatrix(matrix, i, j);
			printMatrixx(matrix, i, j);
		
		
		
	}

}
