import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
//    public void sayHello(){
//        System.out.printf("Hello from %s.", name);
//    }

    public String sayHello() {
        return String.format("Hello from %s.", name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person jeremy = new Person("Jeremy");
        System.out.println(jeremy.sayHello());
    }


}
