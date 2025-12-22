package genesis.persons;

import genesis.Person;
import genesis.events.Shot;

public class Rulle extends Person implements Jumper{

    public Rulle(String name) {
        super(name);
    }


    public void think(double chance) {
        if (this.contextIs(Context.SHINY_NOSE)) {
            if (chance < 0.6) {
                this.think("Я не собираюсь засиживаться");
            } else if (chance < 0.8) {
                this.think("Я уеду жить в Лондон!");
            } else if (chance < 0.9) {
                this.think("А я думал - сова");
            } else {
                this.think("Я щас сяду за руль");
            }
        }
    }


    public void hear(Shot shot) {
        System.out.println(this.getName() + " услышал " + shot.getName());
    }


    @Override
    public void jump() {
        System.out.println(this.getName() + " подскочил");
    }
}
