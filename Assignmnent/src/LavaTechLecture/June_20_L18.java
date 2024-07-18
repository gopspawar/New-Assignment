package LavaTechLecture;

public class June_20_L18 {
	public static void main(String[] args) {
		//Array is indexed collection of homogeneous datatype
	//its fix in size
		
		// 3 steps to create an array
		
		/* 1. Declare array  
		 * int[] xyz;
		 * String[] names;
		 * float prices;
		 * 
		 * 2. Create array (we mention the array size)
		 * int[] xyz = new int[3];
		 * xyz=new int[5];
		 * 
		 * 3.initialize array
		 * xyz[0]=23;
		 * xyz[2]=34; */
		
		//one dimentional array
	   int[] age = {1,2,3};
	   int[] age1 = new int [3];
	   age1= new int[0];
	//two dimentional array
	   int[][] age2= {{12,23},{34,54}};
	   
	   // Declare:
	   String[][] details;
	   
	   
	   //Create
	   details = new String[5][2];
	   
	   
	   //initialize
	   details[0][0] = "Ram";
	   details[0][1] = "I";
	   details[1][0] = "Raman";
	   details[1][1] = "II";
	   
	   System.out.println(details[0][0]);
	
	
	   //Three Dimentional array
	   
	   String[][][] age5 = {
			    {
			        {"Ram"}, {"Ravi"}
			    },
			    {
			        {"Rajat"}, {"Raj"}
			    },
			    {
			        {"Rakhi"}, {"Rajveer"}
			    }
			};
	   // Iterate through the three-dimensional array and print the elements
       for (int i = 0; i < age5.length; i++) {
           for (int j = 0; j < age5[i].length; j++) {
               for (int k = 0; k < age5[i][j].length; k++) {
                   System.out.print(age5[i][j][k] + " ");
               }
               System.out.println(); // New line for each 2D array element
           }
           System.out.println(); // New line for each 3D array element
        
          System.out.println(age5[0][0][0]);
          System.out.println(age5[1][0][0]);
          System.out.println(age5[1][1][0]);
          System.out.println(age5[2][1][0]);
          
          System.out.println("\n");
          String[][][] data = {
        			{{"Mumbai","77Cr"},{"Delhi","64Cr"},{"Pune","77Cr"}},
        			{{"Boston","3Cr"},{"New jersy","5Cr"}}
        		};
          
          System.out.println(data[0][0][0]);
          System.out.println(data[0][0][1]);
          
          System.out.println(data[0][1][0]);
          System.out.println(data[0][1][1]);
          
          System.out.println(data[0][2][0]);
          System.out.println(data[0][2][1]);
          
          System.out.println(data[1][0][0]);
          System.out.println(data[1][0][1]);
          
          System.out.println(data[1][1][0]);
          System.out.println(data[1][1][1]);

//how to find the length of array
/*1.CharAt()
 * 2.Concat()
 * 3.lenght()
 * 4.equals()
 * 5.toUpperCase()
 * 6.toLowerCase()
 * 7.trim()
 * 8.indexOf()
 * 9.lastIndexOf() */

    System.out.println(age.length);
          
          
       }
   }
	   
}
