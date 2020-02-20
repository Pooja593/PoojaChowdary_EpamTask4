package cost_estimate;

import java.util.Scanner;

public class Cost_calculation {
	public static void main(String[] z)
	{
		Scanner s=new Scanner(System.in);
		System.out.format("choose input from below:\nstandard\nabove standard\nhigh standard\nhigh standard and fully automated\n enter Input:");
		String Standard=s.nextLine();
		System.out.format("enter area of house in square feet:");
		double Area_of_house=s.nextDouble(),Estimated_Cost;
		if(Standard.equalsIgnoreCase("standard"))
			Estimated_Cost=Area_of_house*1200;
		else if(Standard.equalsIgnoreCase("above standard"))
			Estimated_Cost=Area_of_house*1500;
		else if(Standard.equalsIgnoreCase("high standard"))
			Estimated_Cost=Area_of_house*1800;
		else if(Standard.equalsIgnoreCase("high standard and fully automated")) 
			Estimated_Cost=Area_of_house*2500;
		else
			Estimated_Cost=0;
		System.out.format("Estimated cost is : %.2f",Estimated_Cost);
	}

}
