import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.print("\n   Enter the number of your choice: ");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 7);

        switch (choice) {
            case 1:
                System.out.print("\nThere are ");
                plane.showNumEmptySeats();
                System.out.println(" empty seats");
                break;

            case 2:
                // to be implemented
            case 5:
                System.out.println("\nAssigning Seat ..");
                System.out.print("  Please enter SeatID: ");
                int seat_id = sc.nextInt();
                System.out.print("  Please enter Customer ID: ");
                int customer_id = sc.nextInt();
                plane.assignSeat(seat_id, customer_id);
                System.out.println("Seat Assigned!");
                break;
            default:
                System.out.println("Lol");
                break;
        }
    }
}