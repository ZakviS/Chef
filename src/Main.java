import abc.summa.Sum;
import controller.MeatSaladController;
import controller.ValidInsert;
import controller.VgSaladController;
import zxc.lib.Counter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidInsert vi = new ValidInsert();
        VgSaladController vsc = new VgSaladController();
        MeatSaladController msc = new MeatSaladController();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(8);

        Counter counter = new Counter();
        counter.counter(list);
        Sum sum = new Sum();
        sum.calc(1,3);
        System.out.println(sum.result());


        System.out.println("Hello!");

        int choice;
        do{
            System.out.println("\nChoice salad:\n1)Vegetables salad\n2)Meat salad\n3)Exit\n");

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next(); // this is important!
            }
            choice = scanner.nextInt();

            try {


            switch (choice) {
                case (1):

                    do {
                        System.out.println("\nEnter choice:\n1)Crate salad\n2)Max calories\n3)Max weight\n4)Info of salad\n5)Sort by name\n6)Sort by weight\n7)Sort by calories\n8)Exit\n");
                        while (!scanner.hasNextInt()) {
                            System.out.println("That's not a number!");
                            scanner.next(); // this is important!
                        }
                        choice = scanner.nextInt();

                        switch (choice) {
                            case (1):
                                int par;
                                do {
                                    System.out.println("\nEnter choice:\n1)Add onion\n2)Add cucumber\n3)Add tomato\n4)Random salad\n5)Exit\n");

                                    while (!scanner.hasNextInt()) {
                                        System.out.println("That's not a number!");
                                        scanner.next(); // this is important!
                                    }
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

                                            vsc.addOnion(weight);

                                            break;

                                        case (2):
                                            System.out.println("Enter cucumber weight");
                                            do {
                                                weight = scanner.nextInt();
                                                if (vi.ValidWeight(weight)) {
                                                    System.out.println("Incorrect cucumber weight");
                                                }
                                            } while (vi.ValidWeight(weight));

                                            vsc.addCucumber(weight);

                                            break;

                                        case (3):
                                            System.out.println("Enter tomato weight");
                                            do {
                                                weight = scanner.nextInt();
                                                if (vi.ValidWeight(weight)) {
                                                    System.out.println("Incorrect tomato weight");
                                                }
                                            } while (vi.ValidWeight(weight));

                                            vsc.addTomato(weight);

                                            break;
                                        case (4):
                                            Random random = new Random();

                                            weight = random.nextInt(200);
                                            vsc.addOnion(weight);

                                            weight = random.nextInt(200);
                                            vsc.addCucumber(weight);

                                            weight = random.nextInt(200);
                                            vsc.addTomato(weight);

                                        default:
                                            if (par > 5 ){
                                                System.out.println("Incorrect choice");
                                            }
                                            else System.out.println("Salad create");
                                            break;
                                    }
                                } while (par !=5);

                                break;

                            case (2):
                                vsc.maxCalories(vsc.getSalad());
                                break;

                            case (3):
                                vsc.maxWeight(vsc.getSalad());
                                break;

                            case (4):
                                vsc.printInfo(vsc.getSalad());

                                System.out.println("вывод через библиотеку");
                                counter.counter((ArrayList<?>) vsc.getSalad());
                                break;
                            case (5):
                                vsc.sortByName(vsc.getSalad());
                                break;
                            case (6):
                                vsc.sortByWeight(vsc.getSalad());
                                break;
                            case (7):
                                vsc.sortByCalories(vsc.getSalad());
                                break;
                            default:
                                if (choice > 8 ){
                                    System.out.println("Incorrect choice");
                                }
                                break;
                        }
                    } while (choice !=8);
                    break;

                case (2):

                    do {
                        System.out.println("\nEnter choice:\n1)Crate salad\n2)Max calories\n3)Max weight\n4)Info of salad\n5)Sort by name\n6)Sort by weight\n7)Sort by calories\n8)Exit\n");

                        while (!scanner.hasNextInt()) {
                            System.out.println("That's not a number!");
                            scanner.next(); // this is important!
                        }
                        choice = scanner.nextInt();

                        switch (choice) {
                            case (1):
                                int par;
                                do {
                                    System.out.println("\nEnter choice:\n1)Add onion\n2)Add cucumber\n3)Add tomato\n4)Add chicken\n5)Add turkey\n6)Exit\n");
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

                                            msc.addOnion(weight);

                                            break;

                                        case (2):
                                            System.out.println("Enter cucumber weight");
                                            do {
                                                weight = scanner.nextInt();
                                                if (vi.ValidWeight(weight)) {
                                                    System.out.println("Incorrect cucumber weight");
                                                }
                                            } while (vi.ValidWeight(weight));

                                            msc.addCucumber(weight);

                                            break;

                                        case (3):
                                            System.out.println("Enter tomato weight");
                                            do {
                                                weight = scanner.nextInt();
                                                if (vi.ValidWeight(weight)) {
                                                    System.out.println("Incorrect tomato weight");
                                                }
                                            } while (vi.ValidWeight(weight));

                                            msc.addTomato(weight);

                                            break;
                                        case (4):
                                            System.out.println("Enter chicken weight");
                                            do {
                                                weight = scanner.nextInt();
                                                if (vi.ValidWeight(weight)) {
                                                    System.out.println("Incorrect chicken weight");
                                                }
                                            } while (vi.ValidWeight(weight));

                                            msc.addChicken(weight);

                                            break;
                                        case (5):
                                            System.out.println("Enter turkey weight");
                                            do {
                                                weight = scanner.nextInt();
                                                if (vi.ValidWeight(weight)) {
                                                    System.out.println("Incorrect turkey weight");
                                                }
                                            } while (vi.ValidWeight(weight));

                                            msc.addTurkey(weight);

                                            break;

                                        default:
                                            if (par > 6 ){
                                                System.out.println("Incorrect choice");
                                            }
                                            else System.out.println("Salad create");
                                            break;
                                    }
                                } while (par !=6);

                                break;

                            case (2):
                                msc.maxCalories(msc.getSalad());
                                break;

                            case (3):
                                msc.maxWeight(msc.getSalad());
                                break;

                            case (4):
                                msc.printInfo(msc.getSalad());
                                break;
                            case (5):
                                msc.sortByName(msc.getSalad());
                                break;
                            case (6):
                                msc.sortByWeight(msc.getSalad());
                                break;
                            case (7):
                                msc.sortByCalories(msc.getSalad());
                                break;
                            default:
                                if (choice > 8 ){
                                    System.out.println("Incorrect choice");
                                }
                                break;
                        }
                    } while (choice !=8);
                    break;

                default:
                    if (choice > 3 ){
                        System.out.println("Incorrect choice");
                    }
                    break;
            }
            } catch (
                    Exception e
            ){
                System.out.println(e.getMessage());
            }

        } while (choice !=3);

    }



//                case(5):
//                    //nsc = new saladController(vsc);
//                    System.out.println("create cope");
//                    break;
//                case(6):
//                    if (vi.isNull(nsc.getSalad())){
//                        System.out.println("not cope");
//                    }else nsc.printInfo();
//                    break;
//                case (7):
//                    do {
//                    System.out.println("\nEnter choice:\n1)Add onion\n2)Add cucumber\n3)Add tomato\n4)Exit\n");
//                    par = scanner.nextInt();
//                    switch (par) {
//                        case (1):
//
//                            System.out.println("Enter onion weight");
//                            int weight;
//                            do {
//                                weight = scanner.nextInt();
//                                if (vi.ValidWeight(weight)) {
//                                    System.out.println("Incorrect onion weight");
//                                }
//                            } while (vi.ValidWeight(weight));
//
//                            nsc.addOnion(weight);
//
//                            break;
//
//                        case (2):
//                            System.out.println("Enter cucumber weight");
//                            do {
//                                weight = scanner.nextInt();
//                                if (vi.ValidWeight(weight)) {
//                                    System.out.println("Incorrect cucumber weight");
//                                }
//                            } while (vi.ValidWeight(weight));
//
//                            nsc.addCucumber(weight);
//
//                            break;
//
//                        case (3):
//                            System.out.println("Enter tomato weight");
//                            do {
//                                weight = scanner.nextInt();
//                                if (vi.ValidWeight(weight)) {
//                                    System.out.println("Incorrect tomato weight");
//                                }
//                            } while (vi.ValidWeight(weight));
//
//                            nsc.addTomato(weight);
//
//                            break;
//
//                        default:
//                            if (par > 4 ){
//                                System.out.println("Incorrect choice");
//                            }
//                            else System.out.println("Salad create");
//                            break;
//                    }
//                    } while (par !=4);
//
//            break;

}