
import java.util.Scanner;

public class Decimal_To_Any_Base {
    public static int getBaseValue(int num, int base){
        int rv = 0;
        int pow = 1;
        while(num > 0){
            int dig = num % base;
            num = num / base;

            rv += dig * pow;
            pow = pow * 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        int baseValue = getBaseValue(num, base);
        System.out.print(baseValue);
    }
}
