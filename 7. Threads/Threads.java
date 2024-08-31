class Display extends Thread
{
    public void run()
    {
        for(int i=1; i<30;i++)
        {
            if(i%2==0)
                System.out.println(i+ " is divisible by 2");
        }
    }
}
class Print implements Runnable
{
    public void run()
    {
        for(int i=1;i<30;i++)
        {
            if(i%7==0)
                System.out.println(i+ " is divisible by 7");
        }
    }
}
class Threads
{
    public static void main(String args[])
    {
        try{
            Display d = new Display();
            Print p = new Print();
            Thread t = new Thread(p);
            d.start();
            t.start();
            d.join();
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
 
