import controller.ValidInsert;
import controller.saladController;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidInsert vi = new ValidInsert();
        saladController sc = new saladController();
        saladController nsc = new saladController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!");

        int choice;
        do {
            System.out.println("\nEnter choice:\n1)Crate salad\n2)Max calories\n3)Max weight\n4)Info of salad\n5)Create cope of salad \n6)Print info of cope salad\n8)Exit\n");
            choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    int par;
                    do {
                        System.out.println("\nEnter choice:\n1)Add onion\n2)Add cucumber\n3)Add tomato\n4)Exit\n");
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
                                if (par > 4 ){
                                    System.out.println("Incorrect choice");
                                }
                                else System.out.println("Salad create");
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
                case(5):
                    nsc = new saladController(sc);
                    System.out.println("create cope");
                    break;
                case(6):
                    if (vi.isNull(nsc.getSalad())){
                        System.out.println("not cope");
                    }else nsc.printInfo();
                    break;
                case (7):
                    do {
                    System.out.println("\nEnter choice:\n1)Add onion\n2)Add cucumber\n3)Add tomato\n4)Exit\n");
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

                            nsc.addOnion(weight);

                            break;

                        case (2):
                            System.out.println("Enter cucumber weight");
                            do {
                                weight = scanner.nextInt();
                                if (vi.ValidWeight(weight)) {
                                    System.out.println("Incorrect cucumber weight");
                                }
                            } while (vi.ValidWeight(weight));

                            nsc.addCucumber(weight);

                            break;

                        case (3):
                            System.out.println("Enter tomato weight");
                            do {
                                weight = scanner.nextInt();
                                if (vi.ValidWeight(weight)) {
                                    System.out.println("Incorrect tomato weight");
                                }
                            } while (vi.ValidWeight(weight));

                            nsc.addTomato(weight);

                            break;

                        default:
                            if (par > 4 ){
                                System.out.println("Incorrect choice");
                            }
                            else System.out.println("Salad create");
                            break;
                    }
                    } while (par !=4);

            break;

            default:
                    if (choice > 8 ){
                        System.out.println("Incorrect choice");
                    }
                    break;
            }
        } while (choice !=8);

    }
}