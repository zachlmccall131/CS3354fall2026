import java.util.Scanner;

public class ticketCounter {


  
    public static void main(String[] args) {
        int ticketsSold = 0;
        double ticketPrice = 15.0;
        double totalRevenue = 0.0;

        // Simulate selling tickets
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of tickets sold: ");
        ticketsSold = keyboard.nextInt();
        totalRevenue = ticketsSold * ticketPrice;

        System.out.println("Tickets Sold: " + ticketsSold);
        System.out.println("Total Revenue: $" + totalRevenue);
        keyboard.close();
    }
}
