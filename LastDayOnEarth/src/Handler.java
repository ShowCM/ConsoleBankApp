import java.util.Scanner;

public class Handler {

    User user = new User();

    public void registrationAuth() {
        user.registration();
        user.auth();
    }

    public void switches() {
        Scanner console = new Scanner(System.in);
        DefaultComands.mainMenu();

        int option = console.nextInt();

        switch (option) {
            case 1:
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println(user.getName() + "                  Баланс: " + user.getBalance() + "₽");
                DefaultComands.consoleClear();
                switches();
                break;
            case 2:
                System.out.println("\n\n\n\n\n\n\n\n\n\n");`
                System.out.print("Введите сумму депозита: ");
                double deposit = console.nextDouble();
                user.setBalance(deposit);
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Вы успешно внесли: " + deposit);
                DefaultComands.consoleClear();
                switches();
                break;
            case 3:
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ваш баланс: " + user.getBalance());
                System.out.print("Введите сумму вывода: ");
                double withdrawFunds = console.nextDouble();
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                user.withdraw(withdrawFunds);
                System.out.println("Ваш баланс: " + user.getBalance());
                DefaultComands.consoleClear();
                switches();
                break;
            case 4:
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                user.getTransactionHistory();
                DefaultComands.consoleClear();
                switches();
                break;
        }
    }
}
