import java.util.Scanner;
import java.util.SortedMap;

public class User extends Money{

    Scanner scan = new Scanner(System.in);

    private String name;
    private String phoneNumber;
    private String password;

    public void registration() {
        System.out.print("Введите ваше имя: ");
        this.name = scan.nextLine();
        System.out.print("Введите ваш номер телефона: ");
        this.phoneNumber = scan.nextLine();
        System.out.print("Введите пароль: ");
        this.password = scan.nextLine();
        System.out.print("Вы успешно зарегестрировались!\n\n");
    }

    public void auth() {

        System.out.println("                  Вход");
        System.out.print("Введите номер телефона: ");
        String authPhoneNum = scan.nextLine();

        System.out.print("Введите пароль: ");
        String authPassword = scan.nextLine();
        if (authPhoneNum.equals(phoneNumber) && authPassword.equals(password)) {
            DefaultComands.greeting();
            DefaultComands.welcome(name);
        } else {
            System.out.println("Вы введи неправильный логин или пароль.");
            auth();
        }
    }

    public String getName() {
        return name;
    }
}
