package shapes;

abstract class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public void getLength(double length) {

    }
    @Override
    public void getWidth(double width) {
        super.getWidth();
    }
    /*

    protected double width;
    protected double length;
*/

    public Rectangle(double length, double width){
        super(length, width);
        //this.length = length;
        //this.width = width;
}
/*
    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
*/

}
