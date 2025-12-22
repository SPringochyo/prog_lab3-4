package genesis;

import genesis.events.Rain;
import genesis.events.Shot;
import genesis.persons.Fille;
import genesis.persons.FreakenBok;
import genesis.persons.Karlson;
import genesis.persons.Rulle;

public class World {
    static Place Home = new Place("Дом");
    static Karlson Karl = new Karlson("Карлсон");
    static FreakenBok FB = new FreakenBok("Фрекен Бок");
    static Fille Fil = new Fille("Филле");
    static Rulle Rul = new Rulle("Рулле");
    static Shot shot = new Shot("выстрел", Fil, Rul);
    static Rain rain = new Rain();

    static Person[] listOfPersons = {Karl, FB, Fil, Rul};
    static Event[] listOfEvents = {shot, rain};


    public static void startRandomStory() {
        double R = Math.random();

        indent();

        FB.nod(R);

        R = Math.random();
        rain.randomRain(R);

        FB.setContext(Person.Context.SHINY_NOSE);
        FB.say(R, Fil, Rul);

        R = Math.random();
        rain.randomRain(R);

        indent();

        if (R > 0.5) {Fil.describeCondition();}
        else {Rul.describeCondition();}

        R = Math.random();
        rain.randomRain(R);

        Fil.think(R);

        indent();

        R = Math.random();
        rain.randomRain(R);

        Fil.think(R);

        R = Math.random();
        rain.randomRain(R);

        Rul.think(R);

        R = Math.random();
        rain.randomRain(R);

        Karl.stay(R);

        indent();

        R = Math.random();
        rain.randomRain(R);

        shot.startEvent();

        indent();
    }


    private static void indent() {
        System.out.println("-----------------------------------------------");
    }
}
