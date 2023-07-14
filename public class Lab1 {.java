public class Lab1 {
    public static void main(String[] args)
    {
// Declare a Scanner object here to be used for input
        String input; // read in user input as a string
        double price = 12.34 ; // price of purchase item
        int qty = 2; // number of items purchased
        System.out.print("Price of purchased item: "); // user prompt
// read input here as a string
// convert string to double and store in price variable
        System.out.print("Quantity: "); // user prompt
// read input here as a string
// convert string to integer and store in qty variable
// displays the final amount
        System.out.println("Total purchase order = $" + price * qty);
// display the final amount w/2 decimals using printf
        System.out.printf("Total purchase order = $%.2f\n", price * qty);
// display the final amount w/2 decimals using String.format
        String output = String.format("Total purchase order = $%.2f\n" + price * qty);
        System.out.printf(output);
    } // end main
} // end class Lab1

