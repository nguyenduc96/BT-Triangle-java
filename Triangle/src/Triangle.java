public class Triangle extends Shape {
    private double slide1 = 1.0;
    private double slide2 = 1.0;
    private double slide3 = 1.0;

    public Triangle() {
    }

    public Triangle(double slide1, double slide2, double slide3, String color) {
        super(color);
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }

    public double getArea() {
        double p = (this.slide1 + this.slide2 + this.slide3) / 2;
        double s = Math.sqrt(p * (p - this.slide1) * (p - this.slide2) * (p - this.slide3));
        return s;
    }

    public double getPerimeter() {
        return this.slide1 + this.slide2 + this.slide3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color : " + super.getColor() +
                ", slide 1 = " + this.slide1 +
                ", slide2 = " + this.slide2 +
                ", slide3 = " + this.slide3 +
                '}';
    }
}
