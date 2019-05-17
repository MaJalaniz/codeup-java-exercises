public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 21;
        String myString = "Words go here"; //this throws an error when the string "" are ''/ String cannot equal a number.
        long myNumber = 123;// error / error/ prints out 123 / prints out 123/ cannot be combined long = 123F/error
        /*int x = 5; //Prints out 6 and 6
        System.out.println(++x);
        System.out.println(x);
        */
        int x = 5; // prints out 5 and 6/ also error when used and defined twice in the same block
        System.out.println(x++);
        System.out.println(x);
        /* String class = "Other words"; //Error - used an restricted word */
        /* String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o; // error String cannot be cast into integer
        */
        /*
        int x = 4;
        x = x += 5;

        byte num = 2000;
        System.out.println(num);
        */
        System.out.println(myFavoriteNumber + " " + myString + " " + myNumber);

//javac ConsoleIO.java && java ConsoleIO
    }
}