package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }
    /*
    public String getString(){

        **************USE A TRY CATCH FOR COMMON ERRORS********

    }
    */
    public boolean yesNo(){
        System.out.println("Type y/n: ");//String input = getString("Type y/n");
        return (getString("what is the message").equals("yes"));// input.equals("yes") || input.equals("y");
    }
    public int getInt(int min, int max){
        int num = Integer.parseInt(getString("Give me a number between " + min + "and" + max)); //getInt()
        if (num < min || num > max){
            num = Integer.parseInt(getString("Give me a number between " + min + "and" + max)); //return getInt()

        }
        return num;
    }
    public int getInt(){
        return Integer.parseInt(getString("Give me a number"));
    }

    //
public double getDouble(){
        return Double.parseDouble(getString("Give me a decimal"));

}
public double getDouble(double min, double max){
        double num = getDouble();

        if(num < min || num > max){
            System.out.println("Out of bounds!");
            return getDouble(min, max);
        }

        return 0;
}
        // **********PUT IN TRY CATCH HERE FOR DOUBLE****************
}
