package btvnday2;

import java.util.Scanner;

class Example110 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int x ;
        for(int i=0;i<=40;i++){
            for(int j=0;j<=((200-i*5)/2);j++){
                x = 200 - i*5 - j*2;
                System.out.print("So to 5k la :"+i+"     ");
                System.out.print("So to 2k la :"+j+"     ");
                System.out.print("So to 1k la :"+x+"     ");
                System.out.println("");
            }
        }
    }
}