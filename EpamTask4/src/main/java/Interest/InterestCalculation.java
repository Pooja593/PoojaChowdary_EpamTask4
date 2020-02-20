package Interest;

import java.util.Scanner;

public class InterestCalculation {
	public static void main(String[] z)
	{
		Scanner s=new Scanner(System.in); 
		System.out.format("enter Principal_Amount:");
		double Principal=s.nextDouble();
		System.out.format("enter Rate_Of_Intrest:");
		double InterestOfRate=s.nextDouble();
		System.out.format("enter Period_Of_Time:");
		int time=s.nextInt();
		double Simple_Interest,Compound_Interest;
		Simple_Interest=Principal*time*(InterestOfRate/100);
		Compound_Interest=Principal*(Math.pow(1+(InterestOfRate/100),time))-Principal;//compounded annually
		System.out.format("Simple Intrest is:%.3f\n",Simple_Interest);
		System.out.format("Compound Intrest is:%.3f\n",Compound_Interest);
	}
	
}
