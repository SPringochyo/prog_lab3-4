package genesis;

public class Time extends Thread{

    private int day;
    private int hour;
    private int minute;
    private int second;

    private boolean started = true;


    public Time(){
        this.day = 0;
        this.hour = 12;
        this.minute = 0;
        this.second = 0;
    }


    public Time(int day, int hour, int minute, int second){
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void run(){
        while (this.started){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.second++;

            if (this.second == 60){
                this.minute++;
                this.second = 0;
            } else if (this.minute == 60){
                this.hour++;
                this.minute = 0;
            } else if (this.hour == 24){
                this.day++;
                this.hour = 0;
            }

            System.out.println(this.day + ":" + this.hour + ":" + this.minute + ":" + this.second);
        }
    }


    public void startTime(){
        this.started = true;
    }


    public void stopTime(){
        this.started = false;
    }


    public void setTime(int day, int hour, int minute, int second){
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public String getTime(){
        return this.day + ":" + this.hour + ":" + this.minute + ":" + this.second;
    }
}
