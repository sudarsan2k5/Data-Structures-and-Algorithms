import java.util.Scanner;
public class Print_Decreasing {
    public static void printDic(int n){
        if(n == 0){
            return;
        }
       System.out.println(n);
       printDic(n - 1); 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = scn.nextInt();
        printDic(n);
    }
}