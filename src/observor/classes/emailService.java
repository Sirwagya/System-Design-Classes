package observor.classes;
import observor.interfaces.Subscriber;

public class emailService implements Subscriber{
    @Override
    public void update(){
        System.out.println("Email Sent");
    }
}
