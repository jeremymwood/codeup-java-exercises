package playtime;

public class Arena {

    public static void main(String[] args) {
        //set fighters
        Fighter bob = new Fighter("Bob");
        Fighter ragnar = new Fighter("Ragnar");
        ragnar.setStrength(20);

        // hand out the weapons
        Weapon club = new Weapon("Club", 5);
        Weapon battleAxe = new Weapon("Axe", 15);
        bob.setCurrentWeapon(club);
        ragnar.setCurrentWeapon(battleAxe);

        // bob starts the fight
        System.out.println("Fight!");
        System.out.printf("Ragnar's health: %d%n", ragnar.getHealth());
        //i want to print the current weapons too
        //        System.out.printf("Ragnar's weapon: %d%n", ragnar.getCurrentWeapon());
        System.out.printf("Bob's health: %d%n%n", bob.getHealth());

        System.out.println("*Bob hits Ragnar*");
        bob.hit(ragnar);
        System.out.printf("Ragnar's health: %d%n%n", ragnar.getHealth());

        System.out.println("*Ragnar hits Bob*");
        ragnar.hit(bob);
        System.out.printf("Bob's health: %d%n%n", bob.getHealth());

        System.out.println("*Ragnar hits Bob*");
        ragnar.hit(bob);
        System.out.printf("Bob's health: %d%n", bob.getHealth());
//        System.out.printf("Ragnar's health: %d%n", ragnar.getHealth());
    }
}