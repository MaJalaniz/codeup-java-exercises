package shapes;

public class Square extends Rectangle {
    //
    @Override
    public void getLength(double length) {
        super.getLength(length);
    }

    @Override
    public void getWidth(double width) {
        super.getWidth();
    }

    public Square(double side){
        super(side, side);
    }



/*
   public Square(double side){
       super(side, side);
   }

   @Override
    public double getArea(){
       return Math.pow(super.length, 2);
    }

    public double getPerimeter() {
       return 4 * super.width;

    }
    */
//audits
    //profiler for testing java code

}
