import java.util.*;
public class Any_base_to_Decimal {
    public static int findDecimal(int n, int b, int d){
        int rv = 0;

        int pow = 1;
        while(n > 0){
            int dig = n % 10;
            n = n / 10;

            rv += dig * pow;
            pow = pow * b;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = scn.nextInt();

        int ans = findDecimal(n, b, d);
        System.out.print(ans);
    }
}
