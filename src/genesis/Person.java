package genesis;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public abstract class Person {

    private final String name;
    private Condition condition;
    private Context context;


    public Person(String name) {
        this.name = name;
        this.setRandomCondition();
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
        DEFAULT("В норме", 0),
        SCARED("Напуган", 1),
        NOT_HAPPY("Не в восторге", 2);

        private final String description;
        private final int id;


        public String getDescription() {
            return description;
        }


        public int getId() {
            return id;
        }


        Condition(String description, int id) {
            this.description = description;
            this.id = id;
        }
    }


    public enum Context {
        SHINY_NOSE, NOT_HAPPY
    }


    public void setContext(Context newContext) {
        this.context = newContext;
    }


    public Context getContext() {
        return this.context;
    }


    public void setCondition(Condition newCondition) {
        this.condition = newCondition;
    }


    public void setRandomCondition() {
        final Random random = new Random();
        Condition[] conditions = Condition.values();
        this.condition = conditions[random.nextInt(conditions.length)];
    }


    public void describeCondition() {
        System.out.println(this.name + " " + this.condition.getDescription());
    }


    public boolean contextIs(Context context) {
        return this.context == context;
    }


    public boolean conditionIs(Condition condition) {
        return this.condition == condition;
    }


    public String getName() {
        return this.name;
    }
}
