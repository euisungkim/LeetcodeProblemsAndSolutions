
// Name: Daniel Eui Sung KIm
// Date: October 4th, 2017
// From: LeetCode
// Problem: #304 Range Sum Query 2D - Immutable

class NumMatrix {
  int[][] sumMatrix;
  public NumMatrix(int[][] matrix)
  {
      // if ( matrix.length == 0 || matrix[0].length == 0 ) return;
      if ( matrix.length > 0 )
          sumMatrix = new int[matrix.length][matrix[0].length];
      // set each value in row i to sum of previous value
      for ( int i = 0; i < matrix.length; i++ )
      {
          for ( int j = 0; j < matrix[0].length; j++ )
          {
              sumMatrix[i][j] += matrix[i][j];
              if ( j > 0 )
                  sumMatrix[i][j] += sumMatrix[i][j-1];
          }
      }
  }
  
  public int sumRegion(int row1, int col1, int row2, int col2)
  {
      int sum = 0;
      // if col1 > 0, subtract sum until col1-1 to get sum from col1 to col2
      // otherwise just add value at row and end of specified column
      for ( int r = row1; r <= row2; r++ )
      {
          if ( col1 > 0 )
              sum += sumMatrix[r][col2] - sumMatrix[r][col1-1];
          else
              sum += sumMatrix[r][col2];
      }
      
      return sum;
  }
}

/**
* Your NumMatrix object will be instantiated and called as such:
* NumMatrix obj = new NumMatrix(matrix);
* int param_1 = obj.sumRegion(row1,col1,row2,col2);
*/