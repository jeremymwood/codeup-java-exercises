public class oopLec {
    public static void main(String[] args) {
        Person alex = new Person();
        Person.personCounter++;
        alex.setfName("Alex");
        alex.setmName("M");
        alex.setlName("S");
        System.out.println(alex.getfName());
        System.out.println(alex.sayHello());

        Person sue = new Person();
        Person.personCounter++;
        sue.setfName("Sue");
        System.out.println(sue.sayHello());
    }
}
