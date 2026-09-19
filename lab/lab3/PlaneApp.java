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

            switch (choice) {
                case 1:
                    System.out.print("\nThere are ");
                    plane.showNumEmptySeats();
                    System.out.println(" empty seats");
                    break;

                case 2:
                    System.out.println("\nThe following seats are empty:");
                    plane.showEmptySeats();
                    break;

                case 3:
                    System.out.println("\nThe seat assignments are as follow:");
                    plane.showAssignedSeats(true);
                    break;

                case 4:
                    System.out.println("\nThe seat assignments are as follow:");
                    plane.showAssignedSeats(false);
                    break;

                case 5:
                    System.out.println("\nAssigning Seat ..");
                    System.out.print("  Please enter SeatID: ");
                    int seat_id = sc.nextInt();
                    System.out.print("  Please enter Customer ID: ");
                    int customer_id = sc.nextInt();
                    plane.assignSeat(seat_id, customer_id);
                    break;

                case 6:
                    System.out.print("\n  Enter SeatID to unassign customer from: ");
                    int unassign_seat_id = sc.nextInt();
                    plane.unAssignSeat(unassign_seat_id);
                    break;

                case 7:
                    break;

                default:
                    break;
            }
        } while (choice != 7);

        sc.close();
    }
}
