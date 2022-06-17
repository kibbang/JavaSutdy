public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (this.base * this.height) / 2;
    }

    public void getTriInfo(){
        System.out.println("밑변: "+this.base+", 높이: "+this.height);
    }
}

class TriangleInfo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 5);
        t1.getTriInfo();
        System.out.println("넓이: "+t1.getArea());
        System.out.println("=====================");
        t1.setBase(4);
        t1.setHeight(10);
        t1.getTriInfo();
        System.out.println("넓이: "+t1.getArea());
    }
}