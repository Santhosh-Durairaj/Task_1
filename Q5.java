package Task_1;

import java.util.Scanner;

public  class Q5 {
    public static void question_5(){

    Scanner s = new Scanner(System.in);
    int i = s.nextInt();
    int ans = 0;
    if (i<500){
        System.out.println(i);
    }
    else if (i>500 && i<=1000){
        ans = i - (i/100*10);
        System.out.println(ans);
    }
    else {
        ans = i - (i/100*20);
        System.out.println(ans);
    }
}
}