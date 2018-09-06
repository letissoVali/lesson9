import Animals.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Lion lion = new Lion("Кинг");
        Hawk hawk = new Hawk("Хоук");
        Bear bear = new Bear("Гриз");
        UseinBolt usein = new UseinBolt("Усейн Болт");
        MichaelPhelps mike = new MichaelPhelps("Майкл Фелпс");

        lion.getName();
        lion.run();
        hawk.getName();
        hawk.fly();
        bear.getName();
        bear.run();
        bear.swim();

        usein.getName();
        usein.run();

        mike.getName();
        mike.swim();

    }
}
