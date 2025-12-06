package genesis.persons;

import genesis.Person;

public class Karlson extends Person {

    public Karlson(String name) {
        super(name);
    }


    public void stay(String where) {
        System.out.println(this.getName() + " стоит " + where);
    }
}
