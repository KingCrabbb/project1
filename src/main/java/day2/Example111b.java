package day2;

import java.util.Scanner;

public class Example111b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = " ";
        for (int i=1;i<=n;i++){
            for(int x=1;x<=n-i;x++){
                System.out.print("\t ");
            }
            for(int j=1;j<= 2*i-1;j++) {
                if(j==1||j==i*2-1||i==n) {
                    System.out.print("\t*");
                }
                else{
                    System.out.print("\t ");
                }

            }
            System.out.println("");
        }
    }
}
