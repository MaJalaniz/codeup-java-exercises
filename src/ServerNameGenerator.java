import java.util.Random;
public class ServerNameGenerator {
    String[] adj = {};
    String[] noun = {};

     static Random randomizer = new Random();

    public static String randomWord (String[] strings){
        return strings[randomizer.nextInt()];
    }
    public static String newServerName(String adj, String noun) {
        return "Your new server name is: \n" + adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
