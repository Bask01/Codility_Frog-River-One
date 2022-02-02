/*
 * Solution for Codility Frog River One exercise
 */
package frogriverone;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kubrabas
 */
public class FrogRiverOne {

     public static void main(String[] args) {
      
       int[] array = {1,3,1,4,5,3,2,4};
       int x = 5;    
       System.out.println("EarliestTime is : " + solution(x, array));         
   }
     
    public static int solution(int X, int[] A) {
    Set<Integer> values = new HashSet<Integer>();
    
    for (int i = 0; i < A.length; i++) {
        if (values.add(A[i])) X--; 
         System.out.println(values);
        if (X == 0) return i;
    }
    return -1;
}
}

    

