package day3.HinhCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhCN hcn = new HinhCN(3,4);
        System.out.println(hcn.chuVi());
        System.out.println(hcn.dienTich());
        System.out.println(hcn.toString());
        Scanner sc = new Scanner(System.in);
        hcn.setChieurong(sc.nextDouble());
        hcn.setChieudai(sc.nextDouble());
        System.out.println(hcn.chuVi()+"<ChuVi------------DienTich>"+ hcn.dienTich());
    }
}
