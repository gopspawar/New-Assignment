package LavaTechLecture;

import java.util.Scanner;

public class L25 {
public static void main(String[] args) {
	//Arithematic operator
	
//	int a=100, b=20;
//	System.out.println("Sum="+(a+b));
//	System.out.println("Sub="+(a-b));
//	System.out.println("mul="+(a*b));
//	System.out.println("remender= "+(a%b)+" and "+"Division="+(a/b));
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your first number: ");
	int a = sc.nextInt();
	System.out.println("Enter your first number: ");
	int b = sc.nextInt();
	System.out.println("Enter your choice:"
			+ "\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division\n5.String Concatenation Operator");
	int n=sc.nextInt();
	switch(n)
	{
	case 1 :
		System.out.println("Sum="+(a+b));
		break;
	case 2:
		System.out.println("Sub="+(a-b));
		break;
	case 3:	
		System.out.println("mul="+(a*b));	
		break;
	case 4:
		System.out.println("remender= "+(a%b)+" and "+"Division="+(a/b));
		break;
	case 5: 
		int num1 = 10;
        String str = "Hello";
        float num2 = 3.14f;
        String result = num1 + str + num2;
        String result2 = num1 + num2 + str;
		System.out.println("The String Concatenation Operator is +\r\n"
				+ "1.Int+string+float\r\n"+"E.g.10,Hello,3.14f = "+result
				+ "\n2.Int+int+string \r\n"+"E.g.20Hello = "+result2);
	case 6:
		System.out.println("Increment/Decrement Operator:\n");
		
	default:
		System.out.println("Invalid input");
		
		
		
		
	}
}
}
