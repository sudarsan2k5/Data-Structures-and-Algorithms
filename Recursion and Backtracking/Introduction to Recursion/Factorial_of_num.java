import java.util.Scanner;
public class Factorial_of_num {
    public static int printFact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = printFact(n - 1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(printFact(n));
    }
}
