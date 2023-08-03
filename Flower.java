public class Flower {
    String name;
    int Freshness;
    int price;

    @Override
    public String toString() {
        return "Flower\n" +
                "name=" + name + "\n" +
                "Freshness=" + Freshness+"\n" +
                "price=" + price +"\n";
    }

    public Flower(String name, int freshness, int price) {
        this.name = name;
        Freshness = freshness;
        this.price = price;

    }


}