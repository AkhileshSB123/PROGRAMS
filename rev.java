import java.util.Scanner;

public class rev{

    public static void main(String[] args)
    {
        Scanner myinput =new Scanner(System.in);
        int n,r;
        int s=0;
        System.out.println("enter no:");
        n=myinput.nextInt();
        while(n!=0)
        {
        r=n%10;
        s=s*10+r;
        n=n/10;
        }
        System.out.println("rev="+s);
    }
}