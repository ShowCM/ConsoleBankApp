import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Money {

    private double balance;
    private double sumDeposits = 0;
    private double sumWithdrawals = 0;
    private String[] transactionHistory = new String[20];
    private int counterTransactions = 0;

    LocalDateTime transactionTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formatterTime = transactionTime.format(formatter);

    public Money() {
        balance = 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double deposit) {
        balance += deposit;
        sumDeposits += deposit;
        String operationDeposit = ". " + "\u001B[32m" + "Пополнение  " + "+" + deposit + "\u001B[0m" + "\n   " + formatterTime;
        setTransaction(operationDeposit);
    }

    public void withdraw(double withdrawFunds) {
        if (balance >= withdrawFunds) {
            balance -= withdrawFunds;
            sumWithdrawals += withdrawFunds;
            String operationWithdraw = ". " + "\u001B[31m" + "Перевод     " + "-" + withdrawFunds + "\u001B[0m" + "\n   " + formatterTime;
            setTransaction(operationWithdraw);
            System.out.println("Вы успешно вывели: " + withdrawFunds);
        }
        else {
            System.out.println("На ваше балансе недостаточно средств.");
        }
    }

    public void setTransaction(String operation) {
        transactionHistory[counterTransactions] = operation;
        counterTransactions++;
    }

    public void getTransactionHistory() {
        System.out.println("\u001B[36m" + "         История операций" + "\u001B[0m" + "\n");
        System.out.println("\u001b[1m" + "                        Переводы " + sumWithdrawals + "\u001B[0m");
        System.out.println("\u001b[1m" + "\u001B[32m" + "                        Поступления " + sumDeposits + "\u001B[0m");
        for (int i = transactionHistory.length - 1; i >= 0; i--) {
            if (transactionHistory[0] == null) {
                System.out.println("Нет операций");
                return;
            }
            if (transactionHistory[i] != null)
                if (transactionHistory[i].startsWith("+"))
                    System.out.println((i + 1) + transactionHistory[i]);
                else
                    System.out.println((i + 1) + transactionHistory[i]);
        }
    }

}
