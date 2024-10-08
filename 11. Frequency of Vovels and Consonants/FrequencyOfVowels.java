import java.util.Scanner;
class FrequencyOfVowels
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int v = 0;
        int c = 0;
        for(int i=0;i<str.length();i++)
        {
            char x = str.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
            	v++;
            else
            	c++;
        }
        System.out.println("Number of vowels is : " + v + ", Consonants : "+ c);
    }
}

