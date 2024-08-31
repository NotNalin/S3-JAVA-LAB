class Multiply 
{
    public synchronized void display(int num)
    {
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

class myClass1 extends Thread 
{
    private Multiply t;

    public myClass1(Multiply t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.display(5);
    }
}

class myClass2 extends Thread 
{
    private Multiply t;

    public myClass2(Multiply t) 
    {
        this.t = t;
    }

    public void run()
    {
        t.display(10);
    }
}

class ThreadSync 
{
    public static void main(String[] args)
    {
        Multiply obj = new Multiply();

        myClass1 m = new myClass1(obj);
        myClass2 n = new myClass2(obj);

        m.start();
        n.start();
    }
}
