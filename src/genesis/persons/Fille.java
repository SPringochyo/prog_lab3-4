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


    public void think(double chance) {
        if (this.contextIs(Context.SHINY_NOSE)) {
            if (chance < 0.6) {
                this.think("Я не в восторге от сравнения носов");
            } else if (chance < 0.8) {
                this.think("Я недоволен!");
            } else if (chance < 0.9) {
                this.think("Да ну вас!!!");
            } else {
                this.think("Зайчик вышел на крыльцо почесать свое лицо");
            }
            this.setShine(false);
            this.setContext(Context.NOT_HAPPY);

        } else if (this.contextIs(Context.NOT_HAPPY)) {
            if (chance < 0.6) {
                this.think("Хочу скорее смотаться");
            } else if (chance < 0.8) {
                this.think("Закрой за мной дверь, я ухожу!");
            } else if (chance < 0.9) {
                this.think("Стоп, мне не приятно!");
            } else {
                this.think("Кто куда, а я по сугробам");
            }
        }
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
