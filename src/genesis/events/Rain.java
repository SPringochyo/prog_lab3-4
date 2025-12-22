package genesis.events;

import genesis.Event;

public class Rain implements Event {

    private final String name = "Дождь";
    private boolean rain = false;


    public void randomRain(double chance) {
        if (chance < 0.5 && !this.isRain()) {this.startEvent();}
        else if (chance < 0.5 && this.isRain()) {this.endEvent();}
    }


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
