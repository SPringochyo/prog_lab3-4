package genesis;

import genesis.Time;

public class World {
    public Time time = new Time(0, 12, 0, 0);
    private String condition;

    public World(){
        this.time.start();
    }

}
