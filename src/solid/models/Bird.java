package solid.models;

public abstract class Bird {
    private final String name;

    protected Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
