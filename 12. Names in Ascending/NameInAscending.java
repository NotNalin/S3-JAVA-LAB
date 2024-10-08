import java.util.Scanner;
class NameInAscending
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Names : ");
        int n = sc.nextInt();
        String s[] = new String[100];
        System.out.println("Enter Names : ");
        for(int i=0;i<=n;i++)
        	s[i] = sc.nextLine();
        
        System.out.println("Given Array of Names");
        for(int i=0;i<=n;i++)
        	System.out.println(s[i]);

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1-i;j++)
            {
            	if(s[j].compareTo(s[j+1])>0)
            	{
            		String t = s[j];
            		s[j] = s[j+1];
            		s[j+1] = t;
            	}
            }
        }
        System.out.println("Names in ascending : ");
        for(int i=0;i<=n;i++)
        	System.out.println(s[i]);
    }
}

