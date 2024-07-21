import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            System.out.print(dig);
        }
    }
}
