import playtime.Fighter;
import playtime.Ninja;
import playtime.Weapon;

public class polyLec {

//polymorphism is expressed with inheritance, interface and abstract references.

    public static void main(String[] args) {
        Fighter bob = new Fighter("Bob");
        bob.taunt();

        Ninja sue = new Ninja("Sue");

        Weapon club = new Weapon("Club", 5);
        Weapon battleAxe = new Weapon("Axe", 15);
        bob.setCurrentWeapon(club);
        sue.setCurrentWeapon(battleAxe);

        sue.taunt();
        sue.hit(bob);
        sue.jump();

        System.out.printf("%s's health: %s\n",bob.getName(), bob.getHealth());
        System.out.printf("%s's health: %s\n",sue.getName(), sue.getHealth());

        Fighter weirdo = new Ninja("Weirdo");

        Fighter [] combatants = new Fighter[5];

        combatants[0] = weirdo;
        combatants[1] = bob;

        for (Fighter combatant : combatants) {
            if (combatant != null) {
//                combatant.thowShuriken();

                if (combatant instanceof Ninja) {
                    System.out.printf("oooo, %s is a ninja!\n", combatant.getName());
                } else {
                    System.out.printf("Meh, %s is just a fighter\n", combatant.getName());
                }
            }
        }

    }
}
