package webDriverPackage;

public class ForLoopALsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * FOR LOOP
		 * Formula: for (initialize; condition; increment/decrement)
		 * { Statement}
		 */
		
		//PRINT 1 TO 10; EVEN NUMBER (so....2,4,6,8,10)
		//
		int i; //declare variable first
		for (i=2; i<=10; i = i+2) 
			/*
			 * for i=2 you use the lowest value; 
			 * i<=10 the highest number to use; 
			 * i = i+2 is increment of 2
			 * */
		{
			System.out.println(i);
		}
		
		//validation i=i+2; 
		//iteration1: 2+2=4
		//iteration2: 4+2=6
		//iteration3:6+2=8
		//iteration4:8+2=10
		//iteration5: 10+2=12 (should not print because i should be less than or equal to 10
		//the program will check if i<=10, if this is true then it will continue
		
//print odd numbers between 1 and 10	
		int b;
		for (b=1; b<=10; b=b+2)
		{
			System.out.println(b);
		}
	}

}