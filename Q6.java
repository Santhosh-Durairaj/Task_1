package Task_1;
import java.util.Scanner;
public class Q6 {
    public static void question_06(){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt ();
        int b = n;
        int i, j;

        for (i=1; i<=b; i++){
            n=b;
            for(j=1; j<=b; j++){
                if (i<=j){
                    System.out.print(n);
                }
                else{
                    System.out.print(n);
                    n=n-1;
                }
            }
            System.out.println();
        }
        
    }
}

