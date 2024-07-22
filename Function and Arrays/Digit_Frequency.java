import java.util.*;
public class Digit_Frequency {
    public static int digit(int n, int m){
        int count = 0;
        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            if (dig == m) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int dig = digit(n, m);
        System.out.println(dig);
    }
    
}