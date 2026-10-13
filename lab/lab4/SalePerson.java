public class SalePerson implements Comparable<SalePerson> {
    private final String firstName;
    private final String lastName;
    private final int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public String toString() {
        return lastName + " , " + firstName + " : " + totalSales;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SalePerson)) {
            return false;
        }
        SalePerson person = (SalePerson) other;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }

    // As required, ordering uses sales, while equality uses only the names.
    @Override
    public int compareTo(SalePerson other) {
        int salesComparison = Integer.compare(totalSales, other.totalSales);
        if (salesComparison != 0) {
            return salesComparison;
        }
        // Reverse the name comparison so descending sort lists surnames A-Z.
        return other.lastName.compareTo(lastName);
    }
}
