import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (Cat.deadCats < 9) {
            Cat cat = new Cat();
            cat.setCatColor(Colors.GREEN);
            while (!cat.getStatus().equals("Exploded") && !cat.getStatus().equals("Dead")) {
                System.out.println("\nYour " + cat.getCatColor() + " cat is now " + cat.getStatus() + "\n and its weight is " + cat.getWeight() + "\n and it totally ate " + cat.eatenGrams());
                System.out.println("\n Cats left: " + (9 - Cat.deadCats));
                System.out.println("1. Feed");
                System.out.println("2. Drink");
                System.out.println("3. Meow");
                System.out.println("4. Go to cat tray");
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
                        for (int i = 0; i < amount; i++) {
                            cat.meow();
                        }
                        break;
                    case "4":
                        System.out.println("\n Cat has went to tray and lost 100 grams of weight");
                        cat.goToTray();
                        break;
                    default:
                        System.out.println("Unknown command: " + command);
                        break;
                }
            }
    //TODO: make it red
            System.out.println("The cat has died due to the reason: " + cat.getStatus());
        }
        System.out.println("You have destroyed all 9 cat lives");

    }
}