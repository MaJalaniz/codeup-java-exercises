import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner respond = new Scanner(System.in);
        System.out.println("Do you have questions for me?");
//use an if here when the answer is yes
        //answer.

        String hisQuestion = respond.nextLine();
        if (hisQuestion.contains("!") == true) {
            System.out.println("Whoa chill out!");
        } else if (hisQuestion.contains("?") == true){
            System.out.println("Sure");
        } else if (hisQuestion.isEmpty()){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("...Whatever");
        }
        // you can also use endsWith and .equals

        //do while
    }
}
