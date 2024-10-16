import java.util.Scanner;

class Test 
{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The input for calculator: ");
        

        int a = sc.nextInt();
        System.out.println("Enter The input for calculator: ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("The addition of "+a+" and "+b+" is "+c);  
     
        sc.close(); 

        
    }

}
