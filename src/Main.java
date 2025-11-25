import genesis.World;

public class Main {
    public static void main(String[] args){
        World story = new World();

        System.out.println("начало");

        boolean flag1 = true;
        boolean flag2 = true;

        while (true) {
            if (story.time.getTime().equals("0:12:0:15") && flag1){
                System.out.println("время пришло");
                flag1 = false;
            }

            if (story.time.getTime().equals("0:12:0:30")){
                System.out.println("время ушло");
                flag2 = false;
                break;
            }
        }

        story.time.setTime(1,4,8,8);

    }
}