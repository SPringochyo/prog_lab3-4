package genesis.persons;

import genesis.Person;
import genesis.events.Shot;

public class Fille extends Person implements Jumper {

    private boolean shine = true;

    public Fille(String name) {
        super(name);
    }


    public void hear(Shot shot) {
        System.out.println(this.getName() + " услышал " + shot.getName());
    }


    @Override
    public void jump() {
        System.out.println(this.getName() + " высоко подскочил");
    }


    public void setShine(boolean bool) {
        this.shine = bool;
    }


    public boolean isShine() {
        return this.shine;
    }
}
