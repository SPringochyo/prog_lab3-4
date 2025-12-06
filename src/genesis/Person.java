package genesis;

public abstract class Person {

    private String name;
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

        if (Math.random() - 0.33 < 0.0001){
            System.out.println(this.name + scared + " ответил:");
            System.out.println(" - Услышал, родной");
        } else {
            System.out.println(this.name + " услышал " + person.getName());
        }
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


    public void getCondition() {
        System.out.println(this.name + " " + this.condition.getDescription());
    }


    public boolean conditionIs(Condition condition) {
        return this.condition == condition;
    }


    public String getName() {
        return this.name;
    }
}
