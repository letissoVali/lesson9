package Animals;

public abstract class Human implements canSwim, canRun {
    protected String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
    public abstract void getName();
}
