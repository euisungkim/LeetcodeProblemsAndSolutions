
// Name: Eric Kwon
// Date: October 4th, 2017
// From: LeetCode
// Problem: #304 Range Sum Query 2D - Immutable

class NumMatrix {
    int[][] sumMatrix;
    public NumMatrix(int[][] matrix) {
        
        // Get the size of the originating array column and row
        int y_size = matrix.length;
        // If empty matrix is given, return
        if (y_size == 0)
            return;
        int x_size = matrix[0].length;

        // Create new matrix of the same size
        sumMatrix = new int[y_size][x_size];
        sumMatrix[0][0] = 0;
        
        // Iterate through and add original values
        for (int y=0 ; y < y_size ; y++) {
            for (int x=0 ; x < x_size ; x++) {
                sumMatrix[y][x] += matrix[y][x];
                if (x > 0) {
                    // Except that new matrix will contain the contiguous sum per row
                    sumMatrix[y][x] += sumMatrix[y][x-1];
                }
            } 
        }
    }
    
    public int sumRegion(int y1, int x1, int y2, int x2) {
        
        // Return container for result
        int result = 0;
        
        // Iterate through and get the rightmost values per row
        for (int i=y1 ; i <= y2 ; i++) {
            result += sumMatrix[i][x2];
                if (x1 != 0)
                    // If row value does not start from 0, subtract
                    result -= sumMatrix[i][x1-1];
        }
        return result;  
    }
}