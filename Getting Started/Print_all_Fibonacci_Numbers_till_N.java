import java.util.*;
public class Print_all_Fibonacci_Numbers_till_N {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}