import java.util.*;
import SOLID.classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        Eagle sam = new Eagle("Sam");
        Sparrow nora = new Sparrow("Nora");
        Penguin kiku = new Penguin("Kiku");
        Ostrich pepa = new Ostrich("Pepa");
       
        ArrayList <Bird> canFly = new ArrayList<>();

        canFly.add(sam);
        canFly.add(nora);
        canFly.add(kiku);
        canFly.add(pepa);

        for (Bird f : canFly) {
            
            System.out.println(f.name);
            
        }

        
    }
}
