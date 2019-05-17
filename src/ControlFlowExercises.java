import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
        /*
        //While
        int x = 5;
        while (x <= 15){
            System.out.println(x);
            x++;
        }
        */
        /*
       // Do/while
        int y = 0;
        do {
            System.out.println(y);
            y += 2;
        } while (y <= 100);
        */
        /*
        //Do While
        int z = 100;
        do{
            System.out.println(z);
            z -= 5;
        } while (z > -10);
        */
        /*
        //Do While
        long a = 2;
        do {
            System.out.println(a);
            a *= a;
        } while (a < 1000000);
        */
        /*
        //Refactor the previous two loops to For
        for (int b = 100; b >= -10; b -= 5){
            System.out.println(b);
        }
        for (long c = 2; c < 1000000; c *= c){
            System.out.println(c);
        }
        */
        for (int d = 0; d <= 100; d++){

            if (d % 3 == 0){
                System.out.println(d + " " + "Fizz");
            } else if (d % 5 == 0) {
                System.out.println(d + " " + "Buzz");
            } else if (d % 1 == 0) {
                System.out.println(d);
            } else if (d % 15 == 0) {
                System.out.println("Divide by both numbers");
            }
        }
        /*
            System.out.println(" "):
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println();
        System.out.println("continue?");
        String answer = scan.next();
        System.out.println("Table here!");
        System.out.println("number, squared, cubed");
        System.out.println("------------");
        if(answer.equalsIgnoreCase("yes")){
            for (int b = 1; b <= userInput; b++){
                int squared = b*b;
                int cubed = b*b*b;
                System.out.println()
            }
        }
        */



    }
}
    /*
    For numbers which are multiples of both three and five print “FizzBuzz”.
    */