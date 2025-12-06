package genesis;

public interface Event {

    String name = "NAME";

    void startEvent();
    void endEvent();
    String getName();
}
