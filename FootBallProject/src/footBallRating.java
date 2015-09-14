import java.util.Scanner;

public class footBallRating {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number of touchdowns");
		int td = reader.nextInt();
		System.out.print("Enter number of Yards");
		int yards = reader.nextInt();
		System.out.print("Enter number of interceptions");
		int cepts = reader.nextInt();
		System.out.print("Enter number of completions");
		int comps = reader.nextInt();
		System.out.print("Enter number of passes attempted");
		int atts = reader.nextInt();
		
		
		double a = ((comps/atts)-.3)*5;
		double b = ((yards/atts)-3)*.25;
		double c = (td/atts)*20;
		double d = 2.375 - ((cepts/atts)*25);
		
		double rating = (a+b+c+d)/6 *100;
		
		System.out.print("The rating is "+rating);
				
			
	}

	
}