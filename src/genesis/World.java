package genesis;

import genesis.events.Rain;
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
    static Rain rain = new Rain();

    static Person[] listOfPersons = {Karl, FB, Fil, Rul};
    static Event[] listOfEvents = {shot, rain};

    public static void startStory() {

        indent();
        FB.nod("с горькой усмешкой");
        FB.say("Да, пожалуй, есть. Фрекен Фрида Бок, с Фрейгатен. Вы, кажется, ее знаете? У нее тоже прелестный носик, который хорош в любую погоду, точь-в-точь как у меня, да?");
        indent();
        Fil.setCondition(Person.Condition.NOT_HAPPY);
        Fil.describeCondition();
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


    public static void startRandomStory() {
        double R = Math.random();

        indent();

        if (R < 0.6) {
            FB.nod("с горькой усмешкой");
        } else if (R < 0.8) {
            FB.nod("со сладкой усмешкой");
        } else if (R < 0.9) {
            FB.nod("со злобным оскалом");
        } else {
            FB.nod("с безумной улыбкой");
        }

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        if (R < 0.6) {
            FB.say("Да, пожалуй, есть. Фрекен Фрида Бок, с Фрейгатен.\n - Вы, кажется, ее знаете?\n - У нее тоже прелестный носик, который хорош в любую погоду, точь-в-точь как у меня, да?");
        } else if (R < 0.8) {
            FB.say("Что вершит судьбу человечества в этом мире?\n - Некое незримое существо или закон, подобно Длани Господней парящей над миром?\n - По крайней мере истинно то, что человек не властен даже над своей волей.");
        } else if (R < 0.9) {
            FB.sayTo(Fil, "Филле, послушай, я Бронированный титан, а он Колоссальный, поможешь нам?");
            Fil.setCondition(Person.Condition.SCARED);
            Rul.setCondition(Person.Condition.SCARED);
        } else {
            FB.sayTo(Rul, "Иногда приходится отказаться от одной вещи, чтобы спасти другую.\n - Твоя мать этого не сделала.\n - Это не доброта, а просто слабость…");
            Rul.sayTo(FB,"Про мать было лишнее >:-C");
        }

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        indent();

        if (R > 0.5) {Fil.describeCondition();}
        else {Rul.describeCondition();}

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        if (R < 0.6) {
            Fil.think("Я не в восторге от сравнения носов");
        } else if (R < 0.8) {
            Fil.sayTo(FB, "Я недоволен!");
        } else if (R < 0.9) {
            Fil.say("Да ну вас!!!");
            Rul.setCondition(Person.Condition.NOT_HAPPY);
        } else {
            Fil.think("Зайчик вышел на крыльцо почесать свое лицо");
        }
        Fil.setShine(false);

        indent();

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        if (R < 0.6) {
            Fil.think("Хочу скорее смотаться");
        } else if (R < 0.8) {
            Fil.sayTo(FB, "Закрой за мной дверь, я ухожу!");
        } else if (R < 0.9) {
            Fil.say("Я хочу питцы");
            FB.setCondition(Person.Condition.NOT_HAPPY);
        } else {
            Fil.think("Кто куда, а я по сугробам");
        }

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        if (R < 0.6) {
            Rul.think("Я не собираюсь засиживаться");
        } else if (R < 0.8) {
            Rul.sayTo(FB, "Я уеду жить в Лондон!");
        } else if (R < 0.9) {
            Rul.say("А я думал - сова");
        } else {
            Rul.think("Я щас сяду за руль");
        }

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        if (R < 0.6) {
            Karl.stay("за спиной");
        } else if (R < 0.8) {
            Karl.stay("за дверью");
        } else if (R < 0.9) {
            Karl.stay("в королевских покоях");
        } else {
            Karl.stay("на коленях");
        }

        indent();

        R = Math.random();

        if (R > 0.5 && !rain.isRain()) {rain.startEvent();}
        else if (R > 0.5 && rain.isRain()) {rain.endEvent();}

        shot.startEvent();

        indent();
    }


    private static void indent() {
        System.out.println("-----------------------------------------------");
    }
}
