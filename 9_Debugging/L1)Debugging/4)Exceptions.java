//Learn
    In the last exercise when we were dealing with run-time errors, you might’ve noticed a new word in the error message: “Exception”.
    Java uses exceptions to handle errors and other exceptional events. Exceptions are the conditions that occur at runtime and may cause the termination of the program.
    When an exception occurs, Java displays a message that includes the name of the exception, the line of the program where the exception occurred, and a stack trace. The stack trace includes:
        The method that was running
        The method that invoked it
        The method that invoked that one
        and so on…
    Make sure to examine it.
    Some common exceptions that you will see in the wild:
        ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
        NullPointerException: You tried to access an instance variable or invoke a method on an object that is currently null.
        ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
        FileNotFoundException: Java didn’t find the file it was looking for.
Instructions
    Run the code to revisit the ArithmeticException you saw in the previous exercise.
    Then move on to the next exercise to see how you can use exceptions to your advantage.