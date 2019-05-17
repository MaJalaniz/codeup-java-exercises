import java.util.Scanner;
import java.util.Random;
public class MethodsExercise {
    Scanner numbers = new Scanner(System.in);

    public static void main(String[] args) {
        /* part 1 Integers

       System.out.println(addition(20,10));
        System.out.println(subtraction(20, 10));
        System.out.println(multiplication(20,10));
        System.out.println(division(20,10));
        System.out.println(modulus(20,10));
        Scanner numbers = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 10.");

        int numChoice = numbers.nextInt();
        if (numChoice >= 1 && numChoice <= 10){
            System.out.println(numChoice + " is a good choice");
        } else if (numChoice > 10 || numChoice < 1) {
            System.out.println("Please try again");
        } else {
            System.out.println("What is this? Twenty Questions?");
        }
      */
        /*
        Scanner numbers = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 10.");
        int choice = numbers.nextInt();
        if (choice >= 1 && choice <= 10) {
            for (choice = 1;choice <= 5; choice++){
                System.out.println(choice);
            }
            System.out.println("Factorial of this number is: ");
        } else{
            System.out.println("Now I have numbers!");
        }
*/

        //part 4 Dice game
        Random rand = new Random();
        int diceX = rand.nextInt(6);
        int diceY = rand.nextInt(6);
        diceX += 1;
        diceY += 1;

        Scanner numbers = new Scanner(System.in);
        System.out.println("Roll the dice?");
        String choice = numbers.nextLine();

        if (choice.contains("yes")) {

            System.out.println("...Are you sure?");
            System.out.println("Wanna leave it chance?");
            String maybe = numbers.nextLine();

            if (maybe.contains("yes")) {
                System.out.println("Your numbers are " + diceX + " " + "and " + diceY);
                System.out.println("Your total is " + " " + newNum(diceX, diceY));

                System.out.println("Try again?");
                String goAgain =numbers.nextLine();
                if (goAgain.contains("yes")){
                    System.out.println("No, everybody gets one.");
                }
            }
        }
        //---------------------------------------
        //Part 2 Recursion might be useful here
        System.out.println("getInteger(1,10)" + getInteger(1,10));




    }


    public static int newNum(int one, int two){
        int indigo;
        indigo = one += two;
        return indigo;
    }

/* part 1 Integers


    public static int addition(int x, int y){
        int add;
       add = x += y;
        return add;
        //just return x + y instead

    }

    public static int subtraction(int a, int b){
        int subtract;
        subtract = a -= b;
        return subtract;
        // return a - b
    }

    public static int multiplication(int c, int d){
        int multiply;
        multiply = c *= d;
        return multiply;
        // return c * d
    }

    public static int division(int e, int f){
        int divide;
        divide = e /= f;
        return divide;
        //return e / f
    }

    public static int modulus(int g,int h){
        int mod;
        mod = g % h;
        return mod;
        //return g % h
    }
/*
    public static int getInteger(int min, int max){
        int average;
        average = ;
    }
*/
// Part 2 Recursion might be useful here
public static int getInteger(int min, int max){
    //static Scanner on outside of method
    Scanner numbers = new Scanner(System.in);
    int input = Integer.parseInt(numbers.nextLine());

    if (input >= min && input <= max){
        return input;

    } else {
        System.out.println("number out of range");
        return getInteger(min, max);
    }

}
public static void factorial(){
    int numFour = getInteger(1,10);
    String out = "";
    for (int i = 1; i < numFour; i++){
       out += i+"! = ";
    }
    System.out.println(out);
}




}
