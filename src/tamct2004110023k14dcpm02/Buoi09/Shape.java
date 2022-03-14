package tamct2004110023k14dcpm02.Buoi09;

public abstract class Shape {
    protected int x, y;
    Shape(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
    public abstract void draw();
    public abstract void erase();

    public void moveTo(int _x, int _y)
    {
        erase();
        x = _x;
        y = _y;
        draw();
    }
}
