import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber;
        int level = 1;
        int bound = 100;
        String anotherGame = "y";

        do {
            System.out.println(ANSI_GREEN + "Level " + level + ANSI_RESET);
            randomNumber = random.nextInt(bound) + 1;
            System.out.printf(ANSI_BLUE + "Guess the number (1/%d)\n" + ANSI_RESET, bound);
            String playersNumber = scanner.nextLine();

            if (!inputInOrder(playersNumber, bound)) {
                continue;
            } else {

                while (!numberGuessed(playersNumber, randomNumber)) {
                    System.out.println(ANSI_RED + "Try again." + ANSI_RESET);
                    playersNumber = scanner.nextLine();

                    while (!inputInOrder(playersNumber, bound)) {
                        playersNumber = scanner.nextLine();
                    }
                }
            }
            level++;

            if (level < 6) {

                switch (level) {
                    case 2:
                        bound = 200;
                        break;
                    case 3:
                        bound = 300;
                        break;
                    case 4:
                        bound = 500;
                        break;
                    case 5:
                        bound = 1000;
                        break;
                }
                continue;
            }

            level = 1;
            bound = 100;
            System.out.println(ANSI_YELLOW + "Would you like another game? Y/N" + ANSI_RESET);
            anotherGame = scanner.nextLine();

            while (!anotherGame.equalsIgnoreCase("y") && !anotherGame.equalsIgnoreCase("n")) {
                System.out.println(ANSI_RED + "I'm sorry, what?" + ANSI_RESET);
                anotherGame = scanner.nextLine();
            }

            if (anotherGame.equalsIgnoreCase("n")) {
                System.out.print(ANSI_CYAN + "I hope to see you soon" + ANSI_RESET);
                return;
            }

        } while (anotherGame.equalsIgnoreCase("y"));
    }

    public static boolean inputInOrder(String input, int bound) {

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (!Character.isDigit(currentSymbol)) {
                System.out.println(ANSI_RED + "You must type a number\nTry again." + ANSI_RESET);
                return false;
            }
        }
        int number = Integer.parseInt(input);

        if (number < 1 || number > bound) {
            System.out.printf(ANSI_PURPLE + "You must choose a number between 1 and %d\nTry again.\n" + ANSI_RESET, bound);
            return false;
        }
        return true;
    }

    public static boolean numberGuessed(String input, int randomNumber) {
        int number = Integer.parseInt(input);

        if (number < randomNumber && number > randomNumber - 20) {
            System.out.println(ANSI_BLUE + "Low, but close." + ANSI_RESET);
            return false;
        } else if (number < randomNumber && number > randomNumber - 50) {
            System.out.println(ANSI_YELLOW + "Too low." + ANSI_RESET);
            return false;
        } else if (number < randomNumber && number > randomNumber - 100) {
            System.out.println(ANSI_PURPLE + "Way too low." + ANSI_RESET);
            return false;
        } else if (number < randomNumber - 100) {
            System.out.println(ANSI_CYAN + "Not even close low. :o" + ANSI_RESET);
            return false;
        } else if (number > randomNumber && number < randomNumber + 20) {
            System.out.println(ANSI_BLUE + "High, but close." + ANSI_RESET);
            return false;
        } else if (number < randomNumber && number < randomNumber - 50) {
            System.out.println(ANSI_YELLOW + "Too high." + ANSI_RESET);
            return false;
        } else if (number > randomNumber && number < randomNumber - 100) {
            System.out.println(ANSI_PURPLE + "Way too high." + ANSI_RESET);
            return false;
        } else if (number > randomNumber + 100) {
            System.out.println(ANSI_CYAN + "Not even close high. :o" + ANSI_RESET);
            return false;
        }
        System.out.println(ANSI_GREEN + "You guessed it. Yeeeeeyy!" + ANSI_RESET);
        return true;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
}
