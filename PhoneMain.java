public class PhoneMain {
    public static void main(String[] args) {

        Phone phone1 = new Phone("I", 1, 12.3, 256, 25000);
        phone1.setBrand("XIOMI");
        phone1.setVersion(14);
        String string = phone1.toString();
        System.out.println(string);
        System.out.println();

        Phone phone2 = new Phone("ygf", 1, 17.3, 256, 35000);
        phone2.setBrand("Iphone");
        phone2.setVersion(12);
        String string2 = phone2.toString();
        System.out.println(string2);
        System.out.println();

        Phone phone3 = new Phone("tyr", 1, 15.3, 256, 15000);
        phone3.setBrand("Honor");
        phone3.setVersion(15);
        String string3 = phone3.toString();
        System.out.println(string3);
    }

}
