import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Ingredient> salad = new ArrayList<Ingredient>();
        Onion onion = new Onion("Onion",100, 0.4);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter paragraph");
        int i = scanner.nextInt();
        switch (i) {
            case (1):
                salad.add(onion);
                System.out.println("case 1");
                break;
            case (2):
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println(salad.size() + " " + salad.get(0).printInfoStr());


        System.out.println("Enter your weight");
        int weight = scanner.nextInt();


        onion.printInfo();

    }
}