public class LunchBuilder {

    String lunch = "Lunch";

    public String build() {
        return lunch;
    }


    public void addCoffee() {
        lunch += ", coffee";
    }


    public void addSoup() {
        lunch += ", soup";
    }


    public void addSalad() {
        lunch += ", salad";
    }
}
