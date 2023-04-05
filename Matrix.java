//***************************************************************************/
//
//
//     Assignment 3: Maxtrix.java   Author : Nicolas Viera
//
//
//***************************************************************************** */


import java.util.Scanner;

public class Matrix {
  private int [][]matrix;

  public Matrix(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer for matrix size: ");
    int matrixSize = scanner.nextInt();
    matrix = new int [matrixSize][matrixSize];
  }

  public void checkPrint(){

      for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix.length; col++) {
          matrix[row][col] = 0;

        }
      }
  }

  public void actualMatrix(){
    int k =1;
    for(int row = 0; row < matrix.length; row++){
      for(int col = 0; col < matrix.length; col++){
        matrix[row][col] = k++;
      }
    }
  }
// Method used to print Matrix and higlight diagonal numbers
  public void printMatrix(){
    int x1 = 0;
    int y1 = matrix.length - 1;
    for(int row = 0; row < matrix.length; row++) {
      for(int col = 0; col < matrix.length; col++){
        if(row == x1 && col == y1){
          System.out.print("\u001B[33m");
        }
        System.out.printf("%4d ", matrix [row][col]);
        System.out.print("\u001B[0m");
      }
      x1++;
      y1--;
        System.out.println();
    }
    System.out.println();
    System.out.println();
  }

  private void swap(int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[y2][x2];
    matrix[y2][x2] = temp;
  }

  public void flipMatrix() {
    int n = matrix.length;
    //Swap elements on one side of the diagonal with corresponding elements on the other side
    int row;
    int col;
    for ( row = 0; row < n; row++) {
      for (col = 0; col < n-1-row; col++) {
        swap(row, col, n-1-col, n-1-row);


      }
    }
  }
}

