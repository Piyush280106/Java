public class Pattern7
{
    public static void main(String[]args)
    {
        int n=5,j=1;
        int i=1;
        String s = "Pattern\n";
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j==1||j==n||i==j)
                    s=s+"*";
                else
                    s=s+" ";
            }
            s=s+"\n";
        }
        System.out.println(s);
    }
}