
package webDriverPackage;

public class CondStatement 
{

	public static void main(String[] args) {
		// 
		int score =90;
		
		if (score >= 90)
			
		{
			System.out.print("you receive A");
		}
		
		else if (score >=80)
		{
			
			System.out.print("you receive B");
		}
		
		else if (score >=70)
		{
			System.out.print("you receive C");
		}
		
		else 
		{
			System.out.println("you failed");
		}
	}
}