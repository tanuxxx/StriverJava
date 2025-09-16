package Array;

import java.util.Scanner;

public class A7_Move_Zero_to_End {

    public static void Movezeros(int [] arr){
        int n = arr.length;
        int temp = 0;
            for(int i = 0; i<n ; i++){
            if(arr[i] != 0){
                arr[temp] = arr[i];
                temp++;
            }

            while(temp <n){
                arr[temp] = 0;
                temp++;
            }
        }
    }
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

            Movezeros(arr);
            for(int num : arr){
                System.out.println(num+" ");
            }


            System.out.println("enter 1 to contunue");
            choice = sc.nextInt();
        }
    }
}
