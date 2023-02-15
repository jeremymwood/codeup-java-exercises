package playtime;

public class Ninja extends Fighter{

    private int numShurikens;

    public Ninja(String name) {
        super(name);

        numShurikens = 1;
    }


    public void jump() {
        System.out.printf("The ninja, %s, jumps!\n", getName());
    }

    //some new method
//    public void thowShuriken()  {
//
//    }

    @Override
    public void taunt() {
//        super.taunt();
        System.out.println("The ninja glares coldly.");
    }
}

