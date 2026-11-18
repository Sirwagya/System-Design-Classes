package observor.interfaces;



public interface Publisher {
    void subscribe(Subscriber sub);
    void unsubscribe (Subscriber sub);
    void notifySub();
}
