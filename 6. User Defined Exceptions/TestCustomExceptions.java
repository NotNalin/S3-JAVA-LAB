class PrimeException extends Exception
{
    private String message;
    public PrimeException(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
}
class TestCustomExceptions
{
    public static void main(String args[])
    {
        try
        {
            int n=15,flag=0;
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                throw new PrimeException(n+" is not Prime");	
            System.out.println(n+" is Prime");
        }
        catch (PrimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
