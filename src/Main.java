import controller.ValidInsert;
import controller.saladController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidInsert vi = new ValidInsert();
        saladController sc = new saladController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!");

        int choice;
        do {
            System.out.println("Enter choice:\n1)Crate salad\n2)Max calories\n3)Max weight\n4)Info of salad\n5)Exit\n");
            choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    int par;
                    do {
                        System.out.println("Enter choice:\n1)Add onion\n2)Add cucumber\n3)Add tomato\n4)Exit\n");
                        par = scanner.nextInt();
                        switch (par) {
                            case (1):

                                System.out.println("Enter onion weight");
                                int weight;
                                do {
                                    weight = scanner.nextInt();
                                    if (vi.ValidWeight(weight)) {
                                        System.out.println("Incorrect onion weight");
                                    }
                                } while (vi.ValidWeight(weight));

                                sc.addOnion(weight);

                                break;

                            case (2):
                                System.out.println("Enter cucumber weight");
                                do {
                                    weight = scanner.nextInt();
                                    if (vi.ValidWeight(weight)) {
                                        System.out.println("Incorrect cucumber weight");
                                    }
                                } while (vi.ValidWeight(weight));

                                sc.addCucumber(weight);

                                break;

                            case (3):
                                System.out.println("Enter tomato weight");
                                do {
                                    weight = scanner.nextInt();
                                    if (vi.ValidWeight(weight)) {
                                        System.out.println("Incorrect tomato weight");
                                    }
                                } while (vi.ValidWeight(weight));

                                sc.addTomato(weight);

                                break;

                            default:
                                System.out.println("Salad create\n2");
                                break;
                        }
                    } while (par !=4);

                    break;

                case (2):
                    sc.maxCalories();
                    break;

                case (3):
                    sc.maxWeight();
                    break;

                case (4):
                    sc.printInfo();
                    break;

                default:
                    break;
            }
        } while (choice !=5);

    }
}