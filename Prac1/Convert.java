import java.util.*;
import java.util.Scanner;

public class Convert
{
    public static void main(String args[])
    {
        System.out.println("Rushil Shah\t\t\tEnrollment no : 180410107110");
        float m,a;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no. in meters");
        m=ob.nextFloat();
        a=3.281f*m;
        System.out.printf("%.2f meters = %.3f feet",m,a);
    }
}
 