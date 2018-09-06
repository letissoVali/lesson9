package Animals;

public class MichaelPhelps extends Human {

    public MichaelPhelps(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("Это " + name);
    }

    @Override
    public void swim() {
        String fastestSwimmer = "Майкл Фелпс";
        if(name.equalsIgnoreCase(fastestSwimmer)) {
            System.out.println(name + " один из лучших пловцов на нашей планете! Рыбы считают его за своего!");
        } else {
            System.out.println("Некоторые " + name + " плавать тольком не умеют, идут на дно как топор.");
        }
    }
}
