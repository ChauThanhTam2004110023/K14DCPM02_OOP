package tamct2004110023k14dcpm02.Buoi11;

public abstract class Animal {
    private String picture;
    private String food;
    private int hunger;

    public abstract void makeNosie();
    protected abstract void eat();

    protected void sleep()
    {
        System.out.println("Sleeping....");
    }
    protected void roam()
    {
        System.out.println("Roaming.....");
    }

    /*Da hinh khong co o huong doi tuong khac
    Loi ich cua da hinh la thay doi code khi chuong trinh chay 
    Moi qua he giua interface va lop con giong vs laoi inmplment*/
}
