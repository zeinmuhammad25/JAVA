package Overloading;

public class Sum {
    // metod 1
    public int sum(int x, int y)
    {
        return (x + y);
    }
    // metod 2
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    //metod 3
    public double sum(double x, double y)
    {
        return (x + y);
    }

    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
