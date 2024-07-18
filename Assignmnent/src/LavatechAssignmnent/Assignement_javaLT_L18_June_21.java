package LavatechAssignmnent;

public class Assignement_javaLT_L18_June_21 {
	public static void main(String[] args) 
	{
		String[][][] data = {
    			{{"Mumbai","77Cr"},{"Delhi","64Cr"},{"Pune","77Cr"}},
    			{{"Boston","3Cr"},{"New jersy","5Cr"}}
    		};
//      
//      System.out.println(data[0][0][0]);
//      System.out.println(data[0][0][1]);
//      
//      System.out.println(data[0][1][0]);
//      System.out.println(data[0][1][1]);
//      
//      System.out.println(data[0][2][0]);
//      System.out.println(data[0][2][1]);
//      
//      System.out.println(data[1][0][0]);
//      System.out.println(data[1][0][1]);
//      
//      System.out.println(data[1][1][0]);
//      System.out.println(data[1][1][1]);
		
		// Iterate through the three-dimensional array and print the structure
        for (int i = 0; i < data.length; i++) {
            System.out.println("age5[" + i + "]");
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("  |-- [" + j + "]");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.println("      |-- [" + k + "] -> " + data[i][j][k]);

	}
}
        }
	}
}
        
