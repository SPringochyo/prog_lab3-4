package genesis.persons;

import genesis.Person;
import genesis.events.Shot;

public class Rulle extends Person implements Jumper{

    public Rulle(String name) {
        super(name);
    }


    public void hear(Shot shot) {
        System.out.println(this.getName() + " услышал " + shot.getName());
    }


    @Override
    public void jump() {
        System.out.println(this.getName() + " подскочил");
    }
}
