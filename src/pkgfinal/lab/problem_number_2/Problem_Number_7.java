
package pkgfinal.lab.problem_number_2;

import java.util.Arrays;

public class Problem_Number_7 {
    public static void main(String[] args){
    
        int num[] = {9,1,5,55,8,-1,3,55};
        int lowest;
        int n = num.length;
        Arrays.sort(num);
        System.out.println("Second largest number " +num[n-2]);
           }
    
}
