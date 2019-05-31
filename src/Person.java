public class Person {


    //String first and last name are provided in the Class Person to use in the Main below
    private String firstName;
    private String lastName;
    private String fullName;

    public static void main(String[] args){
        Person mia = new Person("Chihara","Mina");//2. Person theo is assigned  new Person's name in String
        System.out.println(); //fix this

        /*
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getFullName().equals(person2.getFullName()));
        System.out.println(person1 == person2);
        */
        /*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        */

    }
    public void setFullName(String fName){

        this.fullName=fName;
    }
    public String getFullName(){
        return this.fullName;
    }
    public Person(String fn, String ln){//1. constructor Person takes in a String name
        this.firstName = fn;
        this.lastName = ln;
    }
public void sayHello(){
        String greet = String.format("Hello fellow student my name is %s");//fix this
}











}
