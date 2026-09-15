import java.util.Arrays;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        this.seat = new PlaneSeat[12];
        this.numEmptySeat = 12;

        for (int i = 0; i < seat.length; i++) {
            this.seat[i] = new PlaneSeat(i + 1); // create 12 seat objects
        }
    }

    public PlaneSeat[] sortSeats() {
        PlaneSeat[] copy = Arrays.copyOf(this.seat, this.seat.length);
        Arrays.sort(copy, (s1, s2) -> Integer.compare(s1.getCustomerID(), s2.getCustomerID()));
        return copy;
    }

    public void showNumEmptySeats() {
        System.out.println(this.numEmptySeat);
    }

    public void showEmptySeats() {
        for (int i = 0; i < this.seat.length; i++) {
            if (!this.seat[i].isOccupied()) {
                System.out.println(this.seat[i].getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        if (bySeatId) {
            for (int i = 0; i < this.seat.length; i++) {
                if (this.seat[i].isOccupied()) {
                    System.out.println("Seat ID: " + this.seat[i].getSeatID() + ", Customer ID: " + this.seat[i].getCustomerID());
                }
            }
        } else {
            PlaneSeat[] sortedCustomers = sortSeats();
            for (int i = 0; i < sortedCustomers.length; i++) {
                if (sortedCustomers[i].isOccupied()) {
                    System.out.println("Seat ID: " + sortedCustomers[i].getSeatID() + ", Customer ID: " + sortedCustomers[i].getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatId, int customerId) {
        if (!this.seat[seatId - 1].isOccupied()) {
            this.seat[seatId - 1].assign(customerId);
            this.numEmptySeat--;
        }
    }

    public void unAssignSeat(int seatId) {
        if (this.seat[seatId - 1].isOccupied()) {
            this.seat[seatId - 1].unAssign();
            this.numEmptySeat++;
        }
    }
}