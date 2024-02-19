import java.util.Scanner;
public class Print_Increasing_Decreasing {
    public static void printIncDic(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printIncDic(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = scn.nextInt();
        printIncDic(n);
    }
}
