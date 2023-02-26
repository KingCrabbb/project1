package btvnday2;

import java.util.Scanner;

public class example111d {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 1 ; i <= n; i++) {
            for (int j  = 1 ; j<= i;j++) {
                if(j==1||j==i||i==n) {
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println("");
        }

    }
}
