package Task_1;
import java.util.Scanner;
public class Q3 {
    public static void question_3 (){
        Scanner s = new Scanner(System.in);
        int i= s.nextInt();
        int j = i;
        int ans = 0;
        while (j>0) {
            int n = j%10;
            ans = n + (ans * 10);
            j = j/10;
            
        }

        System.out.println(ans);

    }
}
