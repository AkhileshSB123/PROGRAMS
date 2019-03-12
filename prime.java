
public class prime{

    public static void main(String[] args)
    {
     int c;
        System.out.println("prime no nb/w 2 to 100:");
        for (int i = 2; i < 100; i++) {
            c=0;
            for(int j =1;j<=i;j++)
            {
        if(i%j==0)
        {
            c++;
        }    
        
    }
    if(c==2)
    {
    System.out.println(i);
}
        }
}
}