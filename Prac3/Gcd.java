import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        System.out.println("Rushil Shah\t\t\tEnrollment no : 180410107110");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st no. :");
        int a = s.nextInt();
        System.out.println("Enter 2nd no. :");
        int b = s.nextInt();
        Gcd m = new Gcd();
        int z = m.gcd(a,b);
        System.out.println("GCD of "+a+" & "+b+" is : "+z);
    }
    int gcd(int a,int b){
        int i=2,gcd=1;
        while(i<=a && i<=b)
        {
            if(a%i==0 && b%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}