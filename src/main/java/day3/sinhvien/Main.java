package day3.sinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Nguyen Van a","MSV1",7,7.5);
        System.out.println(sv.tinhDiem());
        SinhVien sv1 = new SinhVien();
        Scanner sc=new Scanner(System.in);
        sv1.setHoVaTen(sc.nextLine());
        sv1.setMaSV(sc.nextLine());
        sv1.setDiemLT(sc.nextDouble());
        sv1.setDiemTH(sc.nextDouble());
        System.out.println(sv.toString());
        System.out.println(sv1.toString());
    }
}
