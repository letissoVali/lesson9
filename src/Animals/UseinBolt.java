package Animals;

public class UseinBolt extends Human {

    public UseinBolt(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Это " + name);
    }

    @Override
    public void run() {
        String fastestRunner = "Усейн Болт";
        if(name.equalsIgnoreCase(fastestRunner)) {
            System.out.println(name + " один из самых быстрых бегунов на нашей планете!");
        } else {
            System.out.println("Средний человек развивает скорость бега 12 км/ч");
        }
    }


}
