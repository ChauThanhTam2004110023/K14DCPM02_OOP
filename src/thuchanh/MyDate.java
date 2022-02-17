package thuchanh;

///@@@@Phương thức toString
public class MyDate {
    int day;
    int mounth;
    int year;

    public MyDate(int day, int mounth, int year)
    {
        if(day >= 1 && day <= 31)
        {
            this.day = day;
        }
        else
        {
            this.day = 1;
        }

        if(mounth >= 1 && mounth <= 12)
        {
            this.mounth = mounth;
        }
        else
        {
            this.mounth = 1;
        }

        if(year >= 1)
        {
            this.year = year;
        }
        else
        {
            this.year = 1;
        }
    }

    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        if(day >= 1 && day <= 31)
        {
            this.day = day;
        }
    }

    public int getMounth()
    {
        return mounth;
    }
    public void setMonth(int mounth)
    {
        if(mounth >= 1 && mounth <= 12)
        {
            this.mounth = mounth;
        }
    }

    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        if(year >= 1)
        {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return this.day+ "/"+ this.mounth+ "/"+ this.year;   
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        { 
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(this.getClass() != obj.getClass())
            return false;

        MyDate orther = (MyDate) obj;
        if(this.day != orther.day)
        return false;
        if(this.mounth != orther.mounth)
        return false;
        if(this.year != orther.year)
        return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + mounth;
        result = prime * result + year;
        return result;
    } 
}
