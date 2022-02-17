package thuchanh;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate0 = new MyDate(1, 7, 2021);
        MyDate myDate1 = new MyDate(1, 7, 2021);
        MyDate myDate2 = new MyDate(2, 9, 2200);
        MyDate myDate3 = new MyDate(30, 4, 2022);

        System.out.println(myDate0);
        System.out.println(myDate1);
        System.out.println(myDate2);
        System.out.println(myDate3);

        System.out.println("myDate0 so sánh bằng myDate1 " +myDate0.equals(myDate1));
        System.out.println("myDate2 so sáng bằng myDate3 " +myDate2.equals(myDate3));

        System.out.println("HashCode mydate0: " +myDate0.hashCode());
        System.out.println("HashCode mydate1: " +myDate1.hashCode());
        System.out.println("HashCode mydate2: " +myDate2.hashCode());
        System.out.println("HashCode mydate3: " +myDate3.hashCode());
    }
}
