public class Test {
    public static void main(String[] args) {
        // Create a Date object
        Date myDate = new Date(28, 01, 2006);

        // Display the date
        myDate.displayDate();

        // Change values using set methods
        myDate.setMonth(1);
        myDate.setDay(2);
        myDate.setYear(2024);

        // Display updated date
        myDate.displayDate();
    }
}
