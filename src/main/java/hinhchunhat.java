import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        double chuvi,dientich;
        Scanner sc = new Scanner(System.in);
        double chieudai = sc.nextDouble();
        double chieurong = sc.nextDouble();
        sc.close();
        if(chieudai<=0 || chieurong<=0){
            System.out.println("khong phai hinh chu nhat nhap lai ");
            System.exit(0);
        }
        else {
            chuvi = (chieudai+chieurong)*2;
            dientich = chieudai*chieurong;
            System.out.println("chu vi : " + chuvi +"dien tich : "+dientich);
        }
    }
}
