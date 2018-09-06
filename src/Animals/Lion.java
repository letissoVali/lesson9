package Animals;

public class Lion extends Animal implements canRun {
    //private String name;


    public Lion(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Это " + name);
    }

    @Override
    public void run() {
        System.out.println(name + " является самой большой кошкой на нашей планете! Не сравнивайте с морскими котиками,"
                + name + " он сухопутный!");
    }
}
