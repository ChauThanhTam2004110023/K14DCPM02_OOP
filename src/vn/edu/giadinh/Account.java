package vn.edu.giadinh;

public class Account {
     //data
     int account_number;
     int account_balance;
 
     //operation
     //function
     void deposil(int amonth)
     {
         account_balance += amonth;
     }
 
     void withdraw(int amonth)
     {
         account_balance -= amonth;
     }
 
     void show()
     {
         System.out.println("Thông tin tai khoản");
         System.out.println("Số tiên: " +account_number);
         System.out.println("Số dư: " +account_balance);
     }
}
