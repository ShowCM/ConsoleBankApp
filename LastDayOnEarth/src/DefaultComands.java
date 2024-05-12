import java.util.Scanner;

public class DefaultComands {

    static Scanner enterScan = new Scanner(System.in);

    public static void greeting() {
        System.out.println("\n\n\n\n\n");
        System.out.println("                PupsikBank");
        enter();
    }

    public static void welcome(String name) {

        System.out.println("Добро пожаловать, " + name + "!");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public static void mainMenu() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("1 - Личный кабинет");
        System.out.println("2 - Депозит");
        System.out.println("3 - Вывод");
        System.out.println("4 - История операций");
    }

    public static void enter() {
        System.out.println("Нажмите Enter, чтобы продоржить...");
        enterScan.nextLine();
    }

    public static void consoleClear() {
        System.out.println("\n");
        DefaultComands.enter();
        System.out.println("\n\n");
    }
}
