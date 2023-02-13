public class lecPerson {

    public static int personCounter = 0;
    private String firstName;
    private String middleName;
    private String lastName;

    public lecPerson(String firstName, String middleName, String lastName) {
        lecPerson.personCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    //constructors

    public lecPerson(String firstName) {
        this("-first-", "-middle-", "-last-");
        //        Person.personCounter++;
//        this.firstName = "(first)";
//        middleName = "(middle)";
//        lastName = "(last)";
    }


    public String sayHello() {
        return String.format("Hello from %s %s %s. \nPerson counter: %s\n", firstName, middleName, lastName, personCounter);
    }

    public static void main(String[] args) {
//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.middleName = "Daniel";
//        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
//
//        Person sue = new Person();
//        sue.firstName = "Sue";
//        sue.lastName = "Smith";
//        System.out.println(sue.sayHello());
    }

    //accessors: go at bottom


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
