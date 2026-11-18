package observor.classes;
import observor.interfaces.Subscriber;


public class inventoryService implements Subscriber{
    @Override
    public void update(){
        System.out.println("Inventory updated");
    }
}
