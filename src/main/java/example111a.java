package btvnday2;

import java.util.Scanner;

public class example111a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = " ";
        for (int i=1;i<=n;i++){
            for(int x=1;x<=n-i;x++){
                System.out.print("\t ");
            }
            for(int j=1;j<= 2*i-1;j++) {
                    System.out.print("\t*");

                }
            System.out.println("");
        }
    }
}
