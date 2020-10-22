Best Fare Calculator
    Overview
        This project is slightly different than others you have encountered thus far on Codecademy. Instead of a step-by-step tutorial, this project contains a series of open-ended requirements which describe the project you’ll be building. There are many possible ways to correctly fulfill all of these requirements, and you should expect to use the internet, Codecademy, and other resources when you encounter a problem that you cannot easily solve.
    Project Goals
        If you’ve ever wondered if you chose the right fare option for riding the metro or bus, you’re not alone. In this project you will write a Java program that determines the best fare option for someone visiting New York City who plans to use the NYC transit system. The program should use constructors, methods, conditionals, loops, and arrays.
    Setup Instructions
        If you choose to do this project on your computer instead of Codecademy, you can download what you’ll need by clicking the “Download” button below. If you need help setting up your computer, be sure to check out our setup guide.(https://www.codecademy.com/courses/learn-java/articles/what-is-an-ide)

//Instructions
Prerequisites
    1.
    In order to complete this project, you should be familiar with Java classes and objects, methods, conditionals and control flow, loops, and arrays. Ideally, you’ve finished the first six sections of Learn Java (through Loops).
Project Requirements
    2.
    Start by building a TransitCalculator class in TransitCalculator.java. The class should include
        A main() method to run the code.
        A field to keep track of the number of days a person will be using the transit system (up to 30 days).
        A field to keep track of the number of individual rides the person expects to take in that time.
    3.
    Build a class constructor for TransitCalculator that accepts the number of days and rides and sets the values for the corresponding fields.
    4.
    The NYC transit system has three regular fare options:
        Pay-per-ride (single ride): $2.75
        7-day Unlimited Rides: $33.00
        30-day Unlimited Rides: $127.00
    Add variables or arrays to the class to keep track of these values.
    5.
    Create a method unlimited7Price() with a double return type. The method should return the overall price per ride of using the 7-day Unlimited option.
        20 rides over 19 days should return 4.95
        50 rides over 22 days should return 2.64
        14 rides over 6 days should return either 2.357142857142857 or 2.36
    Make sure to account for all days the person might be riding public transit in NYC. For example, if a person plans to use the train or bus over the course of 15 days, then three 7-day Unlimited purchases would be required.
    6.
    Build a method getRidePrices() that will return an array of doubles. Inside the method, you’ll need to calculate the price per ride for each fare option. You should use the unlimited7Price() method to determine this value for the 7-day Unlimited option.
    The method should return an array of the price per ride for the three fare options.
    7.
    Create a String method called getBestFare().
    Inside the method, you should use the array of ride prices calculated with getRidePrices() and at least one loop to determine:
        the lowest price
        the best (corresponding) fare method
    At the end of the method, you should return a String that communicates the findings.
    For example, for 54 rides over the course of 26 days, the method should return the following text:
        You should get the 30-day Unlimited option at $2.35 per ride.
    For 12 rides over the course of 5 days, the method should return:
        You should get the Pay-per-ride option at $2.75 per ride.

TransitCalculator.java
    import java.util.Arrays;
    public class TransitCalculator {
        int daysUsing;
        int totalRides;
        String[] rideOption = {"Single Ride", "7-day Unlimited", "30-day Unlimited"};
        double[] priceOption  = {2.75, 33.00, 127.00};
        public TransitCalculator(int rides, int days) {
            if (days <= 30 && days > 0 && rides > 1) {
            daysUsing = days;
            totalRides = rides;
            } else {
                System.out.println("Opps. This is invalid values..");
            }
        }
        public double unlimited7Price() {
            int count = (int)Math.ceil(daysUsing / 7);
            if (daysUsing % 7 != 0) {
                count += 1;
            }
            double pricePerRide = count * priceOption[1] / totalRides;
            return pricePerRide;
        }
        public double[] getRidePrices() {
            double[] RidePrices = {priceOption[0]*daysUsing, unlimited7Price()*totalRides, priceOption[2]};
            return RidePrices;
        }
        public String getBestFare() {
            double LowPrice = getRidePrices()[2];
            int idx = 0;
            for (int i = 0; i < 2; i++) {
            if (PriceList[i] < LowPrice) {
                LowPrice = PriceList[i];
                idx = i;
            }
            }
            return "You should get the " + rideOption[i] + " option at " + LowPrice + " per ride.";   
        }
        public static void main(String[] args) {
            TransitCalculator myT = new TransitCalculator(14,6);
            System.out.println(myT.unlimited7Price());
            String printRidePrices = Arrays.toString(myT.getRidePrices());
            System.out.println(printRidePrices);
            System.out.println(myT.getBestFare());
        }
    }

Project Extensions & Solution
    8.
    Nice work! If you’d like to see the solution, move to the next task. If you’d like to extend your project on your own, you could consider the following:
        The NYC transit system also offers reduced fare options for people with disabilities and people who are at least 65 years old. Refactor the TransitCalculator class so that it checks if the rider qualifies for reduced fare and calculates the best reduced fare option if they do.
            Pay-per-ride (single ride): $1.35
            7-day Unlimited Rides: $16.50
            30-day Unlimited Rides: $63.50
        NYC isn’t the only city where there are several fare options available! Extend your TransitCalculator to work for a different city. Pick your own, or choose from these below:
            Vancouver
            Mexico City
            Delhi
            Berlin
            Paris
            Seoul
    9.
    Great work! Visit our forums to compare your project to our sample solution code. You can also learn how to host your own solution on GitHub so you can share it with other learners! Your solution might look different from ours, and that’s okay! There are multiple ways to solve these projects, and you’ll learn more by seeing others’ code.