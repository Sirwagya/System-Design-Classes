public class App {
    public static void main(String[] args) {
        System.out.println("=== SOLID Principles ===");
        solid.Client.demoSolid();

        System.out.println("\n=== Builder Pattern ===");
        builder.Client.demoBuilder();

        System.out.println("\n=== Adapter Pattern ===");
        adapter.Client.demoAdapter();

        System.out.println("\n=== Strategy Pattern ===");
        strategy.Client.demoStrategy();
    }
}
