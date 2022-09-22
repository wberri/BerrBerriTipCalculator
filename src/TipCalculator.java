import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //Declaring
        int numOfPeople;
        int tipPercentage;
        double totalCost = 0;
        double totalTip;
        double itemCost = 0.00;
        double totalBillWithTip;
        double perPersonCostBeforeTip;
        double tipPerPerson;
        double totalCostPerPerson;
        double tipAsDecimal;

        //user input
        System.out.println("Hello! Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        numOfPeople = scan.nextInt();
        System.out.print("What's the tip percentage? ");
        tipPercentage =  scan.nextInt();

        //adding up total and asking user costs.
        while (itemCost != -1) {
            System.out.print("Enter the cost of an item you bought in dollars and cents, e.g. 12.50(type -1 to end): ");
            itemCost = scan.nextDouble();
            totalCost += itemCost;
        }
        totalCost++; //adding the -1 that was taken away
        System.out.println("-----------------------------------------------------------------------");

        totalCost *= 100; //changing to only cents

        //Calculations
        tipAsDecimal = tipPercentage *0.01;
        totalTip = totalCost * tipAsDecimal;
        totalBillWithTip = totalCost + totalTip;
        perPersonCostBeforeTip = totalCost / numOfPeople;
        tipPerPerson = totalTip / numOfPeople;
        totalCostPerPerson = tipPerPerson + perPersonCostBeforeTip;

        System.out.println("Total Bill Before Tip: " + formatter.format(totalCost*0.01));
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + formatter.format(totalTip*0.01));
        System.out.println("Total Bill With Tip: " + formatter.format(totalBillWithTip*0.01));
        System.out.println("Per Person Cost Before Tip: " + formatter.format(perPersonCostBeforeTip*0.01));
        System.out.println("Tip Per Person: " + formatter.format(tipPerPerson*0.01));
        System.out.println("Total Cost Per Person: " + formatter.format(totalCostPerPerson *0.01));
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Have a great day.");

    }
}
