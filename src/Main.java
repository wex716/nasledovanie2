import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Flyable> flyables = new ArrayList<>();
        flyables.add(new Duck());
        flyables.add(new Plane());
        flyables.add(new Plane());
        flyables.add(new Duck());

        for (int i = 0; i < flyables.size(); i++) {
            flyables.get(i).fly();
        }*/

        MathMachine mathMachine = new MathMachine(3,5, new Summator());

        System.out.println(mathMachine.calculate());

        mathMachine.setCalculable(new Power());

        System.out.println(mathMachine.calculate());
    }
}