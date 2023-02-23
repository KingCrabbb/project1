import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        if(a<=0||b<=0||c<=0 ) {
            System.out.println("khong phai tam giac, nhap lai");
            System.exit(0);
        }
        else {
                if (a + b > c && a + c > b && b + c > a) {
                    System.out.println("la tam giac");
                    double chuvi = a + b + c;
                    double ncv = chuvi / 2;
                    double dientich = Math.sqrt(ncv * (ncv - a) * (ncv - b) * (ncv - c));
                    System.out.printf("chu vi :" +chuvi + ", dien tich :  " + dientich);
                }
            }
    }
}
