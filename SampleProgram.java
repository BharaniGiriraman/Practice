import java.util.Scanner;
public class SampleProgram {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
	System.out.println("***** ***** ******* ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
	System.out.println("***** ****** ******* ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);

	System.out.println(" ");
	

 	multiple(num1,num2);
    }
   static void multiple(int num1,int num2){
	
	    int mul = num1 * num2;
	    System.out.println("Multiplication of these numbers: "+mul);
	
   }

}