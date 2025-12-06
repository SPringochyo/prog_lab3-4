package genesis.events;

import genesis.Event;

public class Rain implements Event {

    private String name = "Дождь";
    private boolean rain = false;

    @Override
    public void startEvent() {
        this.rain = true;
        System.out.println("Начался " + this.name);
    }


    @Override
    public void endEvent() {
        this.rain = false;
        System.out.println(this.name + " закончился");
    }


    public boolean isRain() {
        return this.rain;
    }


    public String getName() {
        return this.name;
    }
}
