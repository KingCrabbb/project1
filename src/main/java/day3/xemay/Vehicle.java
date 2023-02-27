package day3.xemay;

public class Vehicle {
    private double gtXe;
    private double dungTichXe;
    private double thue = 0;

    public Vehicle(double gtXe, double dungTichXe) {
        this.gtXe = gtXe;
        this.dungTichXe = dungTichXe;
    }

    public double getGtXe() {
        return gtXe;
    }

    public double getDungTichXe() {
        return dungTichXe;
    }

    public void setGtXe(double gtXe) {
        this.gtXe = gtXe;
    }

    public void setDungTichXe(double dungTichXe) {
        this.dungTichXe = dungTichXe;
    }

    public double tinhThue() {

        if (this.dungTichXe < 100) {
            return this.gtXe / 100;
        } else if (this.dungTichXe >= 100 && this.dungTichXe <= 200) {
            return this.gtXe * 3 / 100;
        } else {
            return this.gtXe * 5 / 100;
        }
    }
}

