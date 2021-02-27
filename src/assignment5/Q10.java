package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        counting(n ,1 ,arr);
    }

    private static void counting(int n, int i ,String[] arr) {
        if(i>=n+1){
            Arrays.sort(arr);
            System.out.print("{");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("}");
            return;
        }
        arr[i-1] = String.valueOf(i);
        counting(n ,i+1,arr);

    }
}
