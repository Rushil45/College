import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        System.out.println("Rushil Shah\t\t\tEnrollment no : 180410107110");
        Scanner s = new Scanner(System.in);
        int[] x = new int[10];
        for (int i=1;i<11;i++){
            System.out.printf("Enter no #%d :\t",i);
            x[i-1] = s.nextInt();
        }
        Rev m = new Rev();
        m.reverse(x);
    }
    void reverse(int[] a){
        int i,k;
        System.out.println("Before");
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]+"  ");
        }
        for(i=0;i<5;i++)
        {
            k=a[i];
            a[i]=a[9-i];
            a[9-i]=k;
        }
        System.out.println("\nAfter");
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}