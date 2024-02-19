import java.util.Scanner;
public class Print_Increasing {
    public static void printInc(int n){
        if(n == 0){
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = scn.nextInt();
        printInc(n);
    }
}
