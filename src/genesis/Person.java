package genesis;

import java.util.Objects;

public abstract class Person {

    private final String name;
    private Condition condition;


    public Person(String name) {
        this.name = name;
        this.setCondition(Condition.DEFAULT);
    }


    public void sayTo(Person person, String content) {
        String scared;
        if (this.conditionIs(Condition.SCARED)) {
            scared = " дрожжа";
        } else {
            scared = "";
        }

        System.out.println(this.name + scared + " говорит " + person.getName() + ":");
        System.out.println(" - " + content);
        person.hear(this);
    }


    public void say(String content) {
        String scared;
        if (this.conditionIs(Condition.SCARED)) {
            scared = " стуча зубами";
        } else {
            scared = "";
        }

        System.out.println(this.name + scared + " говорит:");
        System.out.println(" - " + content);
    }


    public void think(String content) {
        String scared;
        if (this.conditionIs(Condition.SCARED)) {
            scared = " испуганно";
        } else {
            scared = "";
        }

        System.out.println(this.name + scared + " думает:");
        System.out.println(" - " + content);
    }


    public void hear(Person person) {
        String scared;
        if (this.conditionIs(Condition.SCARED)) {
            scared = " испуганно";
        } else {
            scared = "";
        }

        if (Math.random() < 0.33){
            System.out.println(this.name + scared + " ответил:");
            System.out.println(" - Услышал, родной");
        } else {
            System.out.println(this.name + " услышал " + person.getName());
        }
    }

    public Condition getCondition() {
        return this.condition;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && getCondition() == person.getCondition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCondition());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", condition=" + condition +
                '}';
    }


    public enum Condition {
        DEFAULT("В норме"),
        SCARED("Напуган"),
        NOT_HAPPY("Не в восторге");

        private final String description;

        public String getDescription() {
            return description;
        }


        Condition(String description) {
            this.description = description;
        }
    }


    public void setCondition(Condition newCondition) {
        this.condition = newCondition;
    }


    public void describeCondition() {
        System.out.println(this.name + " " + this.condition.getDescription());
    }


    public boolean conditionIs(Condition condition) {
        return this.condition == condition;
    }


    public String getName() {
        return this.name;
    }
}
