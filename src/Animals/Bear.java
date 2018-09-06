package Animals;

public class Bear extends Animal implements canRun, canSwim{
    //private String name;

    public Bear(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Это " + name);
    }

    @Override
    public void swim() {
        System.out.println(name + " без проблем может проплыть в среднем 6 км.");
    }

    @Override
    public void run() {
        System.out.println(name + " спит зимой, а летом охотится!");
    }
}
