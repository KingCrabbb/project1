package day3.HinhCN;

public class HinhCN {
    private double chieudai;
    private  double chieurong;

    public HinhCN(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieudai(double chieudai) {
        if(chieudai >0) {
            this.chieudai = chieudai;
        }
        else
            System.out.println("Nhap lai .");
    }

    public void setChieurong(double chieurong) {
        if(chieurong>0) {
            this.chieurong = chieurong;
        }
        else {
            System.out.println("Nhap lai .");
        }
    }

    @Override
    public String toString() {
        return "HinhCN{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }
    public double chuVi(){
        return(2*(this.chieudai+this.chieurong));
    }
    public  double dienTich(){
        return this.chieudai*this.chieurong;
    }
}
