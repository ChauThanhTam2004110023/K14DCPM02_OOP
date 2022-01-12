package vn.edu.giadinh;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.show();
        account.deposil(500);
        account.show();
        account.withdraw(200);
        account.show();
    }
}
