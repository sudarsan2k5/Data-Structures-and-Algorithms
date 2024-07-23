import java.util.Scanner;

public class anybase {
    
    public static int getValue(int n, int b1, int b2){
        int dec = findDecimal(n, b1);
        int dn = getBaseValue(n, b2);
        return dn;
    }
    public static int findDecimal(int n, int b){
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
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int ans = getValue(n, b1, b2);
        System.out.print(ans);
    }
}
