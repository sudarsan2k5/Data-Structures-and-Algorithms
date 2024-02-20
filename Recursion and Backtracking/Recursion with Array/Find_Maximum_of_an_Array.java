import java.util.Scanner;
public class Find_Maximum_of_an_Array {
    public static int maxArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int maxInSmallArray = maxArray(arr, idx + 1);
        if(maxInSmallArray > arr[idx]){
            return maxInSmallArray;
        }else{
            return arr[idx];
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        // System.out.print("Max: " + maxArray(arr, n));
        int max = maxArray(arr, 0);
        System.out.print("Max: " + max);
    }
}
