package genesis.persons;

import genesis.Person;

public class FreakenBok extends Person {

    public FreakenBok(String name) {
        super(name);
    }


    public void say(double chance, Person person1, Person person2) {
        if (this.contextIs(Context.SHINY_NOSE)) {
            if (chance < 0.6) {
                String content = "Да, пожалуй, есть. Фрекен Фрида Бок, с Фрейгатен.\n - Вы, кажется, ее знаете?\n - У нее тоже прелестный носик, который хорош в любую погоду, точь-в-точь как у меня, да?";
                System.out.println(this.getName() + " говорит:");
                System.out.println(" - " + content);
            } else if (chance < 0.8) {
                String content = "Что вершит судьбу человечества в этом мире?\n - Некое незримое существо или закон, подобно Длани Господней парящей над миром?\n - По крайней мере истинно то, что человек не властен даже над своей волей.";
                System.out.println(this.getName() + " говорит:");
                System.out.println(" - " + content);
            } else if (chance < 0.9) {
                String content = "Послушайте, я Бронированный титан, а он Колоссальный, поможешь нам?";
                System.out.println(this.getName() + " говорит:");
                System.out.println(" - " + content);
            } else {
                String content = "Иногда приходится отказаться от одной вещи, чтобы спасти другую.\n - Твоя мать этого не сделала.\n - Это не доброта, а просто слабость…";
                System.out.println(this.getName() + " говорит:");
                System.out.println(" - " + content);
            }

            person1.setContext(Context.SHINY_NOSE);
            person2.setContext(Context.SHINY_NOSE);
        }
    }


    public void nod(double chance) {
        if (chance < 0.6) {
            System.out.println(this.getName() + " кивнула " + "с горькой усмешкой");
        } else if (chance < 0.8) {
            System.out.println(this.getName() + " кивнула " + "со сладкой усмешкой");
        } else if (chance < 0.9) {
            System.out.println(this.getName() + " кивнула " + "со злобным оскалом");
        } else {
            System.out.println(this.getName() + " кивнула " + "с безумной улыбкой");
        }
    }


    public void nod(String mode) {
        System.out.println(this.getName() + " кивнула " + mode);
    }
}
