
package pkgfinal.lab.problem_number_2;

import java.util.Scanner;


public class Problem_Number_3 {
    public static void main(String[] args){
     
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number :");
        num = scan.nextInt();
        
        if(num > 0){
        
            System.out.println("Negative");
        }
        else if(num < 0){
        
            System.out.println("Positive");
        }
        else{
        
            System.out.println("Zero");
        }
    }
    
}
