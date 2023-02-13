public class oopLec {
    public static void main(String[] args) {
        Person alex = new Person("Alex", "G", "S");
//        Person.personCounter++;
//        alex.setfName("Alex");
//        alex.setmName("M");
//        alex.setlName("S");
        System.out.println(alex.getFirstName());
        System.out.println(alex.sayHello());

        Person sue = new Person("Sue");
//        Person.personCounter++;
//        sue.setFirstName("Sue");
        System.out.println(sue.sayHello());
    }
}
