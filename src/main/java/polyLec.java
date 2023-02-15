import playtime.Fighter;
import playtime.Ninja;
import playtime.Weapon;


public class polyLec {



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

        System.out.println(bob.getHealth());
        System.out.println(sue.getHealth());
    }
}
