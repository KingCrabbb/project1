package day3.sinhvien;

public class SinhVien {
    private String hoVaTen;
    private String maSV;
    private double diemLT;
    private double diemTH;
    public SinhVien(){}
    public SinhVien(String hoVaTen, String maSV, double diemLT, double diemTH) {
        this.hoVaTen = hoVaTen;
        this.maSV = maSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setDiemLT(double diemLT) {
        if(diemLT>=0&&diemLT<=10) {
            this.diemLT = diemLT;
        }
        else {
            System.out.println("Nhap sai, Nhap lai");
        }
    }

    public void setDiemTH(double diemTH) {
        if(diemTH>=0&&diemTH<=10) {
            this.diemTH = diemTH;
        }
        else {
            System.out.println("Nhap sai, Nhap lai");
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", maSV='" + maSV + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
    public double tinhDiem(){
        return (this.diemLT+this.diemTH)/2;
    }
}
