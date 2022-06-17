public class Ch1 {
    static int balance =0;
    public static void main(String[] args) {
        deposit(100000);
        chkBalance();
        withdraw(3000);
        chkBalance();
    }

    public static int deposit(int amount)
    {
        balance += amount;
        return balance;
    }

    public static int withdraw(int amount)
    {
        balance -= amount;
        return balance;
    }

    public static int chkBalance()
    {
        System.out.println("잔액 : " +balance);
        return balance;
    }
}

