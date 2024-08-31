class Overload
{
    public void area(double r)
    {
        System.out.println("Area of Circle =" + (3.14*r*r));
    }
    public void area(double a, double b)
    {
        System.out.println("Area of Rectangle =" + (a*b));
    }
    public int area(int s)
    {
        System.out.println("Area of Square =" + (s*s));
        return s*s;
    }
}

class TestOverload
{
    public static void main(String args[])
    {
        int area;
        Overload o = new Overload();
        o.area(7.5);
        o.area(10,20);
        area = o.area(5);
    }
}
        

