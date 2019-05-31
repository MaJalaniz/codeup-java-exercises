public class inheritance {

    public class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println("Hello Person" + this.name);
        }
    }
}
// Extends Super(extending from i.e name) -> replaces this.name = name;
//PCVEV