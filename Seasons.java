import java.util.Scanner;

public class Seasons {


    public int number(int x) {
        if (x == 12 || x == 2 || x == 1) {
            System.out.println("Winter");
            return 0;
        }
        if (x == 3 || x == 4 || x == 5) {
            System.out.println("spring");
            return 0;
        }
        if (x == 6 || x == 7  || x== 8) {
            System.out.println("summer");
            return 0;
        }
        if (x == 9 || x == 10 || x == 11) {
            System.out.println("autumn");
            return 0;
        }if (x>12 || x==0){
            System.out.println("it is not true");
        }
        return x;
    }
}

