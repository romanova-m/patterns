public class App {
    public static void main(String[] args) {
        LunchBuilder builder = new LunchBuilder();
        System.out.println("Your order: " + builder.build());

        builder = new LunchBuilder();
        builder.addCoffee();
        builder.addSoup();
        System.out.println("Your order: " + builder.build());

    }
}
