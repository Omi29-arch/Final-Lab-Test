
package pkgfinal.lab.problem_number_2;

import java.util.Arrays;


public class Problem_Number_5 {
    public static void main(String[] args){
    
        int[] array_num = {20, 30, 40};
        System.out.println("Original Array: " +Arrays.toString(array_num));
        int x = array_num[0];
        array_num[0] = array_num[array_num.length-1];
        array_num[array_num.length-1] = x;
        System.out.println("New array after exchange the first and last elements: "+Arrays.toString(array_num));
    }
    
}
