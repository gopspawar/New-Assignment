package LavaTechLecture;

import java.util.Scanner;
import java.util.stream.Stream;

public class L12 {
	
public static void main(String[] args) {
	
	int a=89;
	int b=0B10101;
	int c=034;
	int d=0Xaaff11;
	String f="\u0917\u094B\u092A\u093E\u0932";
	String name = "Gopal Pawar";
	String name1 = new String("Rajesh chaudhari");
	String phone="+91-9503540882";
	String address= new String(" Pune ");
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(f);
	System.out.println(name.substring(0,6));//substring method.
	System.out.println(name1.substring(7));
	System.out.println(phone.substring(0,3));
	System.out.println(address.charAt(2));//CharAt method
	System.out.println(address.concat(phone));// concat 
	String username="gopal";
	int pass=1234;
	
	if (address.isEmpty()) {
		System.out.println("String is empty");
	}else 
	{
		System.out.println("String is not empty");
	}
	
	
	System.out.println(address.isEmpty()); //isEmpty 
	System.out.println(address.equals("Pune ")); //equals
	System.out.println(address.length());//lenth
	System.out.println(address.replace("P", "M")); // replace
	System.out.println(address.trim());
	System.out.println(address);
	System.out.println(address.toLowerCase());
	System.out.println(address.toUpperCase());
	
	//immutable object data cannot be modified once created e.g. hashCode()
	//mutable object data can be modified once created. e.g. StringBuffer class
	
	Scanner un= new Scanner(System.in);
	System.out.println("Enter username: ");
	username = un.nextLine();
	System.out.println("Enter password: ");
	pass =un.nextInt();

if (username.equals("gopal") && pass==1234 )
{
	System.out.println("login successfull"); 
}
	else
	{
			System.out.println("login unsuccessfull"); 
	}
	}



}

