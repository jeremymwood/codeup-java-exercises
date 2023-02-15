public class Person {
    private String name;
    private String age;
    private String placeOfBirth;

    public String sayHello() {
        return String.format("Hello from %s. %s years old, from %s", name, age, placeOfBirth);
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getAge() {
        return age;
    }
     public void setAge(String age) {
        this.age = age;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Person(String name, String age, String placeOfBirth) {
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    public Person(String name) {
        this.name = name;
        this.age = "(age)";
        this.placeOfBirth = "(placeOfBirth)";
    }

    public static void main(String[] args) {
        Person jeremy = new Person("Jeremy", "36", "Brownsville");
        System.out.println(jeremy.sayHello());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
