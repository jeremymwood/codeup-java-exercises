public class oopLec {
    public static void main(String[] args) {
        lecPerson alex = new lecPerson("Alex", "G", "S");
//        Person.personCounter++;
//        alex.setfName("Alex");
//        alex.setmName("M");
//        alex.setlName("S");
        System.out.println(alex.getFirstName());
        System.out.println(alex.sayHello());

        lecPerson sue = new lecPerson("Sue");
//        Person.personCounter++;
//        sue.setFirstName("Sue");
        System.out.println(sue.sayHello());
    }
}
