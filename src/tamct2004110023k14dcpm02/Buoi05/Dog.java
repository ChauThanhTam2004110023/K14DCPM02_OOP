package tamct2004110023k14dcpm02.Buoi05;

public class Dog {
    int size;
    String bread;
    String name;

    public void selSize(int size)
    {
        if(size > 0)
        {
            this.size = size;
        }
        else
        {
            System.out.println("Size không hợp lệ");
        }
    }

    public int getSize()
    {
        return this.size;
    }
}
