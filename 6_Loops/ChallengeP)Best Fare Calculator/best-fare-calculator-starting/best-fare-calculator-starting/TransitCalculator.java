public class TransitCalculator {
    int leftDays;
    //A field to keep track of the number of days a person will be using the transit system (up to 30 days).
    int expectedRidesPerPerson;
    //A field to keep track of the number of individual rides the person expects to take in that time.
    public TransitCalculator(int days, int rides) {
        leftDays = days;
        expectedRidesPerPerson = rides;
    }
    int[] fareOptions = {2.75,33.00,127.00}
    /*
    Pay-per-ride (single ride): $2.75
    7-day Unlimited Rides: $33.00
    30-day Unlimited Rides: $127.00
    */
    public double unlimited7Price(int rides, int days) {
        double totalPrice;
        double priceOf7 = 33.00;
        int howMany7;
        if (days % 7 == 0) {
            howMany7 = days // 7;
        } else {
            howMany7 = days // 7 + 1;
        }
        totalPrice = priceOf7 * howMany7 / rides;
        return totalPrice;
    }
    /*
    The method should return the overall price per ride of using the 7-day Unlimited option.
    20 rides over 19 days should return 4.95
    50 rides over 22 days should return 2.64
    14 rides over 6 days should return either 2.357142857142857 or 2.36
    */
    public static void main(String[] args) {

    }
}