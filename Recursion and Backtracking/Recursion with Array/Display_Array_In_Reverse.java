import java.util.Scanner;
public class Display_Array_In_Reverse {
    public static void reverseArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        reverseArray(arr, idx + 1);
        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENter Size of Array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        reverseArray(arr, 0);
    }
}
