package day1;

import java.util.Scanner;

public class tienphong {
    public static void main(String[] args) {
        double tienphong =3300000;
        double giadien = 4000;
        double gianuoc = 30000;
        double giadichvu = 30000; /* 30k/1 nguoi */
        double tiennha=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguoi trong phong : ");
        int songuoitrongphong =sc.nextInt();
        System.out.println("Nhap so dien thang truoc : ");
        int sodienthangtruoc = sc.nextInt();
        System.out.println("Nhap so dien thang nay : ");
        int sodienthangnay = sc.nextInt();
        System.out.println("Nhap so nuoc thang truoc : ");
        int sonuocthangtruoc = sc.nextInt();
        System.out.println("Nhap so nuoc thang nay : ");
        int sonuocthangnay = sc.nextInt();
        sc.close();
        if (sodienthangnay<sodienthangtruoc||sonuocthangnay<sonuocthangtruoc){
            System.out.println("Nhap sai Nhap lai ");
            System.exit(0);
        }
        else {
            tiennha = tienphong + giadien*(sodienthangnay-sodienthangtruoc) +
                    gianuoc*(sonuocthangnay-sodienthangtruoc)+ songuoitrongphong*giadichvu;
            System.out.println("Tien Nha la : "+ tiennha);
        }

    }
}
