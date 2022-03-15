package thuchanh.Class.Class02;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        Casio casio = new Casio();
        VinaCon vinaCon = new VinaCon();

        System.out.println("5 + 3 = " +casio.cong(5, 3));
        System.out.println("5 - 3 = " +casio.tru(5, 3));
        System.out.println("5 * 3 = " +casio.nhan(5, 3));
        System.out.println("5 / 3 = " +casio.chia(5, 3));

        System.out.println("Test câu b: ");
        double[] arr = new double[] {4,7,2,3,6,8,9};
        double[] arr1 = new double[] {0,3,5,1,5,7,9,8,9};
        SapXepChon sXepChon = new SapXepChon();
        SapXepChen sapXepChen = new SapXepChen();

        sapXepChen.sapXepTang(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]+ "");
        }
        System.out.println();
        sXepChon.sapXepGiam(arr1);
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]+ "");
        }
    }
}
