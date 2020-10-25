//Learn
    Exception handling is an essential feature of Java programming that allows us to use run-time error exceptions to make our debugging process a little easier.
    One way to handle exceptions is using the try/catch:
    The try statement allows you to define a block of code to be tested for errors while it is being executed.
    The catch statement allows you to define a block of code to be executed if an error occurs in the try block.
    The try and catch keywords come in pairs, though you can also catch several types of exceptions in a single block:
        try {
            //  Block of code to try
        } catch (NullPointerException e) {
            // Print the error message like this:
            System.err.println("NullPointerException: " + e.getMessage());
            // Or handle the error another way here
        }
    Notice how we used System.err.println() here instead of System.out.println(). System.err.println() will print to the standard error and the text will be in red.
    You can also chain exceptions together:
        try {
            //  Block of code to try
        } catch (NullPointerException e) {
            //  Code to handle a NullPointerException
        } catch (ArithmeticException e) {
            //  Code to handle an ArithmeticException
        }
    You can learn more about exceptions and handling them here.

Instructions
    1.
    Put the code that you think will cause an ArithmeticException into a try block.
    Create a catch block that catches the ArithmeticException and prints the error message to the terminal.