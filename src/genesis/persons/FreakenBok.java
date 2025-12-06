package genesis.persons;

import genesis.Person;

public class FreakenBok extends Person {

    public FreakenBok(String name) {
        super(name);
    }

    public void nod(String mode) {
        System.out.println(this.getName() + " кивнула " + mode);
    }
}
