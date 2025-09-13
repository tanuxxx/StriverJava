package Array;

import java.util.Scanner;

public class A5_Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        while (choice == 1) {
            System.out.println("Array size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = arr[0];
            for(int j = 1 ; j<n; j++){
                if(arr[i] != arr[j]){
                    arr[i+1] = arr[j];
                    i++;
                }

            }
            System.out.println(i+1);

            System.out.println("enter 1 to contunue");
            choice = sc.nextInt();
        }

    }
}
