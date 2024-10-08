import java.util.Scanner;
class Frequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int count = 0;
        System.out.println("Enter Character to find fequency of : ");
        char c = sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            	count++;
        }
        System.out.println("Fequency of " + c +" is : " + count);
    }
}

