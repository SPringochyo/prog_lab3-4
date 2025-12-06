package genesis;

import genesis.events.Shot;
import genesis.persons.Fille;
import genesis.persons.FreakenBok;
import genesis.persons.Karlson;
import genesis.persons.Rulle;

public class World {

    static Karlson Karl = new Karlson("Карлсон");
    static FreakenBok FB = new FreakenBok("Фрекен Бок");
    static Fille Fil = new Fille("Филле");
    static Rulle Rul = new Rulle("Рулле");
    static Shot shot = new Shot("выстрел", Fil, Rul);

    public static void startStory() {

        indent();
        FB.nod("с горькой усмешкой");
        FB.say("Да, пожалуй, есть. Фрекен Фрида Бок, с Фрейгатен. Вы, кажется, ее знаете? У нее тоже прелестный носик, который хорош в любую погоду, точь-в-точь как у меня, да?");
        indent();
        Fil.setCondition(Person.Condition.NOT_HAPPY);
        Fil.getCondition();
        Fil.think("Я не в восторге от сравнения носов");
        Fil.setShine(false);
        indent();
        Fil.think("Хочу скорее смотаться");
        Rul.think("Я не собираюсь засиживаться");
        Karl.stay("за спиной");
        indent();
        shot.startEvent();
        indent();

    }

    private static void indent() {
        System.out.println("-----------------------------------------------");
    }
}
