import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Rushil Shah\t\t\tEnrollment no : 180410107110");
        Random g = new Random();
        System.out.println("Enter the no. of rows and columns :");
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int[][] x = new int [l][l];
        int i,j,cnt;
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                x[i][j]=g.nextInt(2);
                      
            }
            
        }
        for(i=0;i<l;i++)
        {
            cnt=0;
            for(j=0;j<l;j++)
            {
                System.out.printf(" %d ",x[i][j]);
                if(x[i][j]==1)
                {
                    cnt++;
                }
                
            }

            if(cnt%2==0)
                {
                    System.out.printf(" Even");
                }
                else
                {
                    System.out.printf(" Odd");
                }
            System.out.printf("\n");
        }

    }
}