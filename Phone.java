public class Phone {

        private String brand;
        private int version;
        double screen;
        int memory;
        int price;

        public Phone(String brand, int version, double screen, int memory, int price) {
            this.brand = brand;
            this.version = version;
            this.screen = screen;
            this.memory = memory;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Phone" +
                    "brand: " + brand + "\n" +
                    "version: " + version + "\n" +
                    "screen: " + screen + "\n" +
                    "memory: " + memory + "\n" +
                    "price: " + price;
        }


        public String setBrand(String brand) {
            this.brand = brand;
            return brand;
        }
        public int setVersion(int version) {
            this.version = version;
            return version;
        }

        public double getScreen(){
            return getScreen();
        }
        public int getMemory() {
            return memory;
        }

        public int getPrice() {
            return price;
        }
    }


