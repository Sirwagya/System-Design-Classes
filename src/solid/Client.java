package solid;

import java.util.List;
import solid.interfaces.CanRun;
import solid.interfaces.CanSwim;
import solid.interfaces.Flyable;
import solid.interfaces.Singable;
import solid.models.Bird;
import solid.models.Eagle;
import solid.models.Ostrich;
import solid.models.Penguin;
import solid.models.Sparrow;

public class Client {
    public static void main(String[] args) {
        demoSolid();
    }

    public static void demoSolid() {
        Eagle sam = new Eagle("Sam");
        Sparrow nora = new Sparrow("Nora");
        Penguin kiku = new Penguin("Kiku");
        Ostrich pepa = new Ostrich("Pepa");

        List<Bird> birds = List.of(sam, nora, kiku, pepa);
        for (Bird bird : birds) {
            System.out.println("Bird: " + bird.getName());
        }

        List<Flyable> flyers = List.of(sam, nora);
        for (Flyable flyer : flyers) {
            flyer.fly();
        }

        List<Singable> singers = List.of(sam, nora);
        for (Singable singer : singers) {
            singer.sing();
        }

        List<CanRun> runners = List.of(kiku, pepa);
        for (CanRun runner : runners) {
            runner.run();
        }

        List<CanSwim> swimmers = List.of(kiku);
        for (CanSwim swimmer : swimmers) {
            swimmer.swim();
        }
    }
}
