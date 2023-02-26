package btvnday2;

import java.util.Scanner;

public class example216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int dem = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.println("a["+i+"] : " + arr[i]);
        }
        sc.close();
        for(int i=0;i<n;i++){
            if(arr[i]%2 ==0){
                dem++;
            }
        }
        System.out.println("So phan tu chan la : "+ dem );
    }
}
