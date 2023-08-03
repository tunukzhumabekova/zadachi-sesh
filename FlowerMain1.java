 class FlowerMain {
    public static void main(String[] args) {
        Flower flower = new Flower("rose", 8, 1000);
        Flower flower1 = new Flower("peonies", 5, 800);
        Flower flower2 = new Flower("Chrysanthemum", 10, 500);
        Flower[] flowers = {flower, flower1, flower2};
        System.out.println("The most expensive flower");
        System.out.println(maxPrice(flowers));
        System.out.println("The freshest flower");
        System.out.println(Freshness(flowers));
        System.out.println("The longest flower by name ");
        System.out.println(Sort(flowers));

    }

    public static Flower maxPrice(Flower[] flowers) {
        Flower flower = flowers[0];
        for (int i = 0; i > flowers.length; i++) {
            if (flowers[i].price < flower.price) {
                flower = flowers[i];
            }
        }
        return flower;
    }

    public static Flower Freshness(Flower[] flowers) {
        Flower flower = flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].Freshness > flower.Freshness) {
                flower = flowers[i];
            }
        }
        return flower;
    }

    public static Flower Sort(Flower[] flowers) {
        Flower flower = flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].name.length() > flower.name.length()) {
                flower = flowers[i];
            }
        }
        return flower;


    }
}
