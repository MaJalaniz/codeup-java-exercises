package shapes;

abstract class Quadrilateral extends Shape  {

    protected double length = 0;
    protected double width = 0;

    //Constructor to accept two numbers length and width
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    //methods for getting length and width
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    //abstract methods to get length and width
    public abstract void getLength(double length);
    public abstract void getWidth(double width);


    //implemented from Measurable  VV

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }







}
