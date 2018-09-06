package Animals;

public class Hawk extends Animal implements canFly{
    //private String name;

    public Hawk(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Это " + name);
    }

    @Override
    public void fly() {
        System.out.println(name + " во время охоты может летать со скоростью 240 км/ч.");
    }
}
