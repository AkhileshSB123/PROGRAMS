import java.util.Scanner;

public class sum{

    public static void main(String[] args)
    {
        Scanner myinput =new Scanner(System.in);
        int a,b,c;
        
        System.out.println("enter first no:");
        a=myinput.nextInt();
        System.out.println("enter second no:");
        b=myinput.nextInt();
        c=a+b;
        System.out.println("sum="+c);
    }
}