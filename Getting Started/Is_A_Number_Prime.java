import java.util.*;
public class Is_A_Number_Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            int num = scn.nextInt();

            int count = 0;
            for(int div = 2; div * div < num; div++){
                if(num % div == 0){
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }    
}