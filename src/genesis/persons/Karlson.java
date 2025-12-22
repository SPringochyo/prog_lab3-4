package genesis.persons;

import genesis.Person;

public class Karlson extends Person {

    public Karlson(String name) {
        super(name);
        this.setRandomCondition();
    }


    public void stay(String where) {
        System.out.println(this.getName() + " стоит " + where);
    }


    public void stay(double chance) {
        if (chance < 0.6) {
            System.out.println(this.getName() + " стоит " + "за спиной");
        } else if (chance < 0.8) {
            System.out.println(this.getName() + " стоит " + "за дверью");
        } else if (chance < 0.9) {
            System.out.println(this.getName() + " стоит " + "в королевских покоях");
        } else {
            System.out.println(this.getName() + " стоит " + "на коленях");
        }

    }
}
