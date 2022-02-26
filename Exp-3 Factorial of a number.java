import java.util.*;
class Main{  
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner input=new Scanner(System.in);
  int number=input.nextInt();
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
} 
