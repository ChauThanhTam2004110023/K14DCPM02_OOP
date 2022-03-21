package tamct2004110023k14dcpm02.Buoi11;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        List<Pig> pig = new ArrayList<>();
        List<Dog> dog = new ArrayList<>();
        dog.add(new Dog());
        for(Dog d: dog)
        {
            d.eat();
        }
        for(Dog d: dog)
        {
            d.play();
        }
        pig.add(new Pig());
        for(Pig item : pig)
        {
            item.beFriendly();
        }
        for(Pig item : pig)
        {
            item.play();
        }
    }
}
