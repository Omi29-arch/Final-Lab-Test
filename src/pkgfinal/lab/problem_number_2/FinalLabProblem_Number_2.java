
package pkgfinal.lab.problem_number_2;

 
public class FinalLabProblem_Number_2 {

        public static void main(String[] args) {
            
            int n=5, z=1, i,j,k;
            for(i=1; i<=n; i++){
               for(j=n-1; j>=i; j--){
               
                   System.out.println(" ");
               }
               for(k=1; k<=z; k++){
                  System.out.println(k);
               }
               z = z+2;
               System.out.println();
            }
    }
    
}
