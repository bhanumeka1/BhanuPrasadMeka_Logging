import java.util.Scanner;
public class CCclass{

public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Principal: ");
	float p= scan.nextFloat();
	System.out.println("Enter rate of interest:");
	int r=scan.nextInt();
	System.out.println("Enter time in years");
	int t = scan.nextInt();
	SimpleInt si= new SimpleInt();
	System.out.println("The  Simple Interest amount is:"+si.simpleInterest(p,r,t));
	CompoundInt ci = new CompoundInt();
	System.out.println("The Compound Interest amount is:"+ci.compoundInterest(p,r,t));
	System.out.println("Choose the type of materials used for construction");
	System.out.println("1.Standard");
	System.out.println("2.Above Standard");
	System.out.println("3.High Standard Materials");
	System.out.println("4.High Standard Materials and Fully Automated");
	int standard= scan.nextInt();
	System.out.println("Enter total area of house:");
	float totarea=scan.nextFloat();
	CostOfHouse hc = new CostOfHouse();
	System.out.println("Estimated Cost for Construction of House is Rs."+hc.cost(standard,totarea));
	scan.close();
	
}
}
