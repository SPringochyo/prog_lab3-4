package genesis.events;

import genesis.Event;
import genesis.Person;
import genesis.persons.Fille;
import genesis.persons.Rulle;

public class Shot implements Event {

    private String name;
    private Fille target1;
    private Rulle target2;


    public Shot(String name, Fille target1, Rulle target2) {
        this.name = name;
        this.target1 = target1;
        this.target2 = target2;
    }


    @Override
    public void startEvent() {
        System.out.println("Раздался " + this.name);

        this.target1.hear(this);
        this.target2.hear(this);

        this.target1.setCondition(Person.Condition.SCARED);
        this.target2.setCondition(Person.Condition.SCARED);

        System.out.println(this.target1.getName() + " напуган");
        System.out.println(this.target2.getName() + " напуган");

        this.target1.jump();
        this.target2.jump();
    }


    @Override
    public void endEvent() {
        this.target1.setCondition(Person.Condition.DEFAULT);
        this.target2.setCondition(Person.Condition.DEFAULT);

        System.out.println(this.target1.getName() + " успокоился");
        System.out.println(this.target2.getName() + " успокоился");
    }


    public String getName() {
        return this.name;
    }
}
