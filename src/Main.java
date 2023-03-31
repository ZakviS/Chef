import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter paragraph");
        int i = scanner.nextInt();
        switch (i) {
            case (1):

                break;
            case (2):
                break;
            default:
                break;
        }





        System.out.println("Enter your age");
        int weight = scanner.nextInt();
        System.out.println(weight);

        Onion onion = new Onion("Onion",weight, 0.4);
        onion.printInfo();

    }
}