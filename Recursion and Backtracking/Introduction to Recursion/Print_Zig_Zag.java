import java.util.Scanner;
public class Print_Zig_Zag {
    public static void zigZag(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        zigZag(n - 1);
        System.out.println(n);
        zigZag(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = scn.nextInt();
        zigZag(n);
    }
}
