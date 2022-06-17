public class Triangle {
    double base;
    double height;

    public Triangle(double bs, double hg) {
        base = bs;
        height = hg;
    }

    public void setBase(double bs) {
        base = bs;
    }

    public void setHeight(double hg) {
        height = hg;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}
class TriangleInfo {
    public static void main(String[] args) {
        Triangle obj1 = new Triangle(10,4);
        System.out.println("넓이: "+obj1.getArea());

        obj1.setBase(20);
        obj1.setHeight(40);
        System.out.println("넓이: "+obj1.getArea());
    }
}