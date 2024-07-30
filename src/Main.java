import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, startPrice = 10;
        double total, perKM = 2.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilometers: ");
        km = input.nextInt();

        total = km * perKM + startPrice;
        total = (total < 20) ? 20 : total;

        System.out.println("Total price: " + total);
    }
}