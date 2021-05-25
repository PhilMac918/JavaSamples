//package com.codility;

// you can also use imports, for example:
 import java.util.*;

public class App {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        
        System.out.println(getSpiralOrder(new int[][]{{1, 2, 3},{4,5,6},{7,8,9}}));
        
        System.out.println(getSpiralOrder(new int[][]{{1, 2, 3,4},{5,6,7,8},{9,10,11,12}}));

    }


    private static List<Integer> getSpiralOrder(int[][] matrix){
    //WRITE YOUR CODE HERE
    
    List<Integer> result = new ArrayList<Integer>();


    // first row 

    // last column 

    // last row (reverse order)
    
    // first column (reverse order)

    // shrink the size of the matrix 

    //https://azure.microsoft.com/en-us/services/orbital/

    

    
    for (int i = 0; i < matrix.length; i++){
        int inner[] = matrix[i];
        
        for (int j = 0; j < inner.length; j ++){
            //result.add(outer[j]);
        }


        
    }

    for (int i = 1; i < matrix.length; i++){
        result.add(matrix[i][2]);
    }

    for (int i = 1; i >= 0; i--) {
        result.add(matrix[2][i]);
    }

    for (int i = 0; i < 2; i++){
        result.add(matrix[1][i]);
    }

    
    return result;
  }

}
