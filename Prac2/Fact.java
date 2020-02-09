import java.util.Scanner;

public class Fact
{
    public static void main(String[] args)
    {
        int a,i=2;
        System.out.println("Rushil Shah\t\t\tEnrollment No. : 180410107110");
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(a != 0)
        {
            if(a%i==0)
            {
                System.out.printf("%d\t",i);
                a=a/i;
            }
            else
            {
                i++;
            }
            
        }
    }
}