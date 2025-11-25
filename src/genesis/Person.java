package genesis;

public class Person {

    private String name;
    private String condition;
    private double speed;
    private double[] position;
    private boolean shine;


    public void moveTo(double[] cords){}


    public void sayTo(Person person, String content){}


    public void think(String content){}


    public void hear(Person person){}


    public void changeCondition(String newCondition){}


    public boolean isShine(){
        return this.shine;
    }
}
