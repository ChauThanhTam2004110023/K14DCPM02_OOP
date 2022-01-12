package vn.edu.giadinh;

import java.util.Scanner;

public class Bank {
    static int account_number;
    static int account_balance;
    public static void main(String[] args) {
        //data - dữ liệu
        //các biến (variable)
        //id của số tk

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        int sotien = sc.nextInt();
        account_balance += sotien;
        System.out.println("Số tiên: " +account_number);

        //rút tiền
        //int ruttien;
        System.out.println("Nhập số tiền rút: ");
        int ruttien = sc.nextInt();
        account_balance -= ruttien;
        System.out.println("Số dư: " +account_balance);
        show();

        /* System.out.println("thông tin tai khoản");
        System.out.println("Số tiên: " +account_number);
        System.out.println("Số dư: " +account_balance); */

    }

    static void show()
    {
        System.out.println("Thông tin tai khoản");
        System.out.println("Số tiên: " +account_number);
        System.out.println("Số dư: " +account_balance);
    }
}
