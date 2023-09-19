import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Total Bill: ");
        double totalBill = s.nextDouble();
        System.out.print("Tip Percentage ( without % ): ");
        int tipPercent = s.nextInt();
        System.out.print("Number of people: ");
        int numOfPeople = s.nextInt();

        double totalTip = totalBill * ( 0.01 * tipPercent );
        double totalBillAndTip = totalBill * (( 0.01 * tipPercent ) + 1);
        double totalTipPerPerson = totalTip / numOfPeople ;
        double totalPerPerson = totalBillAndTip / numOfPeople;

        System.out.println("Total Tip: $" + String.format("%.2f", totalTip));
        System.out.println("Total Bill + Tip: $" + String.format("%.2f", totalBillAndTip));
        System.out.println("Total Tip per person: $" + String.format("%.2f", totalTipPerPerson));
        System.out.println("Total Bill + Tip per person: $" + String.format("%.2f", totalPerPerson));
    }
}