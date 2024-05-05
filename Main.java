public class Main {

    public static void main(String[] args) {

        System.out.println("Our Programe Starts Here.");

        MyInter obj1 = new MyInterImp();

        obj1.sayHello();

        // Method-2 Annonymous Class for implementation

        MyInter i = new MyInter() { // creating the object of child class
            @Override

            public void sayHello() {
                System.out.println("This is First annonymous class");
            }
        };

        i.sayHello();

        MyInter i1 = new MyInter() {

            public void sayHello() {
                System.out.println("This is Second Body..");
            }
        };
        i1.sayHello();

        // implement our functional interface using lambada Expression

        // Lambada is used for only Functional Interface for only one method.

        MyInter i2 = () -> System.out.println("Lambda Expression First Time..");

        i2.sayHello();

        MyInter i4 = () -> System.out.println("Lambda Expression Second Time..");

        i4.sayHello();

        MyInter i3 = () -> {
            System.err.println("Hii");
            System.out.println("Second Line");
        };

        i3.sayHello();

    }
}