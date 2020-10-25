//Learn
    If our program has no compile-time errors, it’ll run. This is where the fun really starts.
    Errors which happen during program execution (run-time) after successful compilation are called run-time errors. Run-time errors occur when a program with no compile-time errors asks the computer to do something that the computer is unable to reliably do.
    Some common run-time errors:
        Division by zero also known as division error
        Trying to open a file that doesn’t exist
    There is no way for the compiler to know about these kinds of errors when the program is compiled.
    Here’s an example of a run-time error message:
        Exception in thread "main" java.lang.ArithmeticException: / by zero at Debug.main(Debug.java:8)

Instructions
    1.
    There’s a run-time error in Debug.java.
    This program is supposed to find the ratio of a table’s dimensions, which is supposed to be 20 x 40.