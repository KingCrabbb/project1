package exampleabtract;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setWidth(double side){
        super.width = side;
    }
    public void setLength(double side) {
        super.length = side;
    }

    @Override
    public String toString() {
        return "Square["+super.toString()+
                ']';
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
