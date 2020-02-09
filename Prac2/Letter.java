import java.util.Scanner;

public class Letter {
    public static void main(String args[]){
        System.out.println("Rushil Shah\t\t\tEnrollment no : 180410107110");
        char x;
        System.out.println("Enter a letter of alphabet:");
        Scanner s=new Scanner(System.in);
        x=s.next().charAt(0);
        if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u' )
        {
            System.out.println(x+" is a vowel");
        }
        else
        {
            System.out.println(x+" is a consonant");
        }
    }
}