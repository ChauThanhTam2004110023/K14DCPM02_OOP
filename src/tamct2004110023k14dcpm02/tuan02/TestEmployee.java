package tamct2004110023k14dcpm02.tuan02;

public class TestEmployee {
    public static void main(String[] args) {
        Employee em = new Employee("Tài Thành Lâm Vũ", 00, 20, "k14");
        em.printName();
        em.printId();
        em.printAge();
        em.printClass();

        Employee em1 = new Employee("Trung Bùi", 01, 18, "k13");
        em1.printName();
        em1.printId();
        em1.printAge();
        em1.printClass();

        Employee em2 = new Employee("Thạch lê", 02, 19, "k15");
        em2.printName();
        em2.printId();
        em2.printAge();
        em2.printClass();

        


    }
}
