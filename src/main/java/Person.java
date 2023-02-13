public class Person {
    public String fName;
    public String mName;
    public String lName;

    public String sayHello() {
        return String.format("Hello from %s %s %s", fName, mName, lName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.fName = "Rick";
        rick.mName = "Daniel";
        rick.lName = "Sanchez";
        System.out.println(rick.sayHello());

        Person sue = new Person();
        sue.fName = "Sue";
        sue.mName = "Anne";
        sue.lName = "Smith";
        System.out.println(sue.sayHello());
    }
}
