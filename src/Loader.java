import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cat cat = new Cat();

        while (!cat.getStatus().equals("Exploded") && !cat.getStatus().equals("Dead")) {
            System.out.println("\nThe cat is currently " + cat.getStatus() + " and its weight is " + cat.getWeight());
            System.out.println("1. Feed");
            System.out.println("2. Drink");
            System.out.println("3. Meow");

            String command = input.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Type amount of food:");
                    Double feed = input.nextDouble();
                    input.nextLine(); // Добавлено для считывания остатка строки
                    cat.feed(feed);
                    break;
                case "2":
                    System.out.println("Type amount of drink:");
                    Double drink = input.nextDouble();
                    input.nextLine(); // Добавлено для считывания остатка строки
                    cat.drink(drink); // Исправлено с cat.feed на cat.drink, если вы хотите напоить кота.
                    break;
                case "3":
                    System.out.println("Type amount of meows:");
                    int amount = input.nextInt();
                    input.nextLine(); // Добавлено для считывания остатка строки


                    for (int i = 0; i<amount; i++) {
                        cat.meow();
                    }
                    break;
                default:
                    System.out.println("Unknown command: " + command);
                    break;
            }
        }

        System.out.println("The cat has died due to the reason: " + cat.getStatus());
    }
}