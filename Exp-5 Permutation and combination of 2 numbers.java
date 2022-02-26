import java.util.Scanner;
 
public class Main
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n1, r1,n2,r2;
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Value of n1 : ");
        n1 = scanner.nextInt();
        System.out.print("Enter Value of r1 : ");
        r1 = scanner.nextInt();
        System.out.print("NCR of 1st number is " +(fact(n1)/(fact(n1-r1)*fact(r1))));
        System.out.print("\nNPR of 1st number is " +(fact(n1)/(fact(n1-r1))));
        
        System.out.print("\nEnter Value of n2 : ");
        n2 = scanner.nextInt();
        System.out.print("Enter Value of r2 : ");
        r2 = scanner.nextInt();
        System.out.print("NCR of 2nd number is " +(fact(n2)/(fact(n2-r2)*fact(r2))));
        System.out.print("\nNPR of 2nd number is " +(fact(n2)/(fact(n2-r2))));
    }
}
