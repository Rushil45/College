import java.util.*;
import java.util.Scanner;

public class BMI {
    public static void main(String args[]){
        System.out.println("Rushil Shah\t\tEnrollment no : 180410107110");
        float w,h,b;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter your Weight in kilograms:");
        w=c.nextFloat();
        System.out.println("Enter your Height in centimeters:");
        h=c.nextFloat();
        b=(w/(h*h))*10000;
        System.out.println("Your BMI index is "+b);
    }
}

