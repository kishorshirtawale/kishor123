import java.util.Arrays;
	import java.util.Scanner;
	public class menudriven {
	

	

	  // main method
	  public static void main(String[] args) {

	    // Scanner class object
	    Scanner scan = new Scanner(System.in);

	    // declare two matrix
	    int a[][] = { { 5, 6, 7 }, { 8, 9, 10 }, { 3, 1, 2 } };
	    int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	   
	    int c[][] = new int[3][3];
	    System.out.println("A = " + Arrays.deepToString(a));
	    System.out.println("B = " + Arrays.deepToString(b));

	    int choice;

	    do {
	      
	      System.out.println("\nChoose the matrix operation,");
	      System.out.println("----------------------------");
	      System.out.println("1. Addition");
	    
	      System.out.println("3. Multiplication");
	     
	      System.out.println("5. Exit");
	      System.out.println("----------------------------");
	      System.out.print("Enter your choice: ");
	      choice = scan.nextInt();

	      switch (choice) {
	      case 1:
	        c = add(a, b);
	        System.out.println("Sum of matrix: ");
	        System.out.println(Arrays.deepToString(c));
	        break;
	     
	      case 3:
	        c = multiply(a, b);
	        System.out.println("Multiplication of matrix: ");
	        System.out.println(Arrays.deepToString(c));
	        break;
	   
	      case 5:
	        System.out.println("Thank You.");
	        return;
	      default:
	        System.out.println("Invalid input.");
	        System.out.println("Please enter the correct input.");
	      }
	    } while (true);
	  }

	  
	  public static int[][] add(int[][] a, int[][] b) {

	    
	    int row = a.length;
	    int column = a[0].length;

	    
	    int sum[][] = new int[row][column];

	    
	    for (int i = 0; i < row; i++) {
	      for (int j = 0; j < column; j++) {
	        sum[i][j] = a[i][j] + b[i][j];
	      }
	    }

	    // return resultant matrix
	    return sum;
	  }

	  public static int[][] multiply(int[][] a, int[][] b) {

	    // find row size of first matrix
	    int row = a.length;
	    // find column size of second matrix
	    int column = b[0].length;

	    // declare new matrix to store result
	    int product[][] = new int[row][column];

	    for (int i = 0; i < row; i++) {
	      // inner-1 loop utp0 column of B
	      for (int j = 0; j < column; j++) {
	        // assign 0 to the current element
	        product[i][j] = 0;

	        // inner-2 loop up to A[0].length
	        for (int k = 0; k < a[0].length; k++) {
	          product[i][j] += a[i][k] * b[k][j];
	        }
	      }
	    }
	    return product;
	  }



	}

