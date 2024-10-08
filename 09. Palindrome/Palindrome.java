import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        int flag=0;
        String str = sc.nextLine();
        int l = str.length();
        for(int i=0;i<=l/2;i++)
        {
            if(str.charAt(i)!=str.charAt(l-i-1))
            {
                flag=1;
                break;
            }
        }
    	if(flag==1)
    		System.out.println(str+ " is not palindrome");
    	else
    		System.out.println(str+ " is palindrome"); 
    }
}

