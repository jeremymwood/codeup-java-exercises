public class Person {

    public static int personCounter = 0;
    private String fName;
    private String mName;
    private String lName;

    //constructors
    public Person() {
        System.out.println("constructor called");
        fName = "(first)";
        mName = "(middle)";
        lName = "(last)";
    }

    public String sayHello() {
        return String.format("Hello from %s %s %s. Person counter: %s", fName, mName, lName, personCounter);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.fName = "Rick";
        rick.mName = "Daniel";
        rick.lName = "Sanchez";
        System.out.println(rick.sayHello());

        Person sue = new Person();
        sue.fName = "Sue";
        sue.lName = "Smith";
        System.out.println(sue.sayHello());
    }

    //accessors: go at bottom


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
