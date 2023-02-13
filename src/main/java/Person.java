public class Person {
    public String fName;
    public String lName;

    public String sayHello() {
        return String.format("Hello from %s %s", fName, lName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.fName = "Rick";
        rick.lName = "Sanchez";
        System.out.println(rick.sayHello());

        Person sue = new Person();
        sue.fName = "Sue";
        sue.lName = "Sanchez";
        System.out.println(sue.sayHello());
    }
}
