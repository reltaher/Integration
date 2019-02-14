import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Which pizza is the best deal?");
	    System.out.println("Enter the price and diameter of a pizza");
	    System.out.println("to find out the cost per square inch.");
	    System.out.println("Enter pizza diameter:");
	    double pizzaDiameter = scan.nextDouble();
	    System.out.println("Enter pizza price:");
	    double pizzaPrice = scan.nextDouble();
	    scan.close();
	   
	    double pricePerInch = calculatePricePerInch(pizzaDiameter, pizzaPrice);

	    // output the price per inch
	    System.out.println("Pizza price per inch = " + pricePerInch);

	  }
	  // write method calculatePricePerInch here
	    public static double calculatePricePerInch(double dia, double pric)  {
	      return pric / (dia * Math.PI);
	    } 
	}