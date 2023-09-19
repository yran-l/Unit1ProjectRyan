import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // This is used for user input.

        // Process of getting the user input.
        System.out.println("**************************************************************************************");
        System.out.print("* Total Bill: ");
        double totalBill = s.nextDouble();
        System.out.print("* Tip Percentage ( without % ): ");
        int tipPercent = s.nextInt();
        System.out.print("* Number of people: ");
        int numOfPeople = s.nextInt();

        // Doing math to get total tip, total bill and tip, tip per person, and total per person
        double totalTip = totalBill * ( 0.01 * tipPercent );
        double totalBillAndTip = totalBill * (( 0.01 * tipPercent ) + 1);
        double totalTipPerPerson = totalTip / numOfPeople ;
        double totalPerPerson = totalBillAndTip / numOfPeople;

        // Final print statements for the user to read.
        System.out.println("**************************************************************************************");
        System.out.println("* Total Tip: $" + String.format("%.2f", totalTip));
        System.out.println("* Total Bill + Tip: $" + String.format("%.2f", totalBillAndTip));
        System.out.println("* Total Tip per person: $" + String.format("%.2f", totalTipPerPerson));
        System.out.println("* Total Bill + Tip per person: $" + String.format("%.2f", totalPerPerson));
        System.out.println("**************************************************************************************");

    }
}