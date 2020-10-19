//instruction
    '''
    1. The text editor has a file, HelloYou.java, that contains a HelloYou class with a main() method.
    Inside main(), add a statement which prints Hello someName!, with your name replacing someName. Make sure to end the statement with a semicolon.
    ''' 
public class HelloYou {
    public static void main(String[] args) {
        System.out.println("Hello Koki!");
    }
}
// Learn
    '''
    Hello Java File!
    Java runs on different platforms, but programmers write it the same way. Let’s explore some rules for writing Java.
    Java files have a .java extension. Some programs are one file, others are hundreds of files!
    Inside HelloWorld.java, we had a class:
    '''
    public class HelloWorld {
    }
    '''
    We’ll talk about classes more in the future, but for now think of them as a single concept.
    The HelloWorld concept is: Hello World Printer. Other class concepts could be: Bicycle, or: Savings Account.
    We marked the domain of this concept using curly braces: {}. Syntax inside the curly braces is part of the class.
    Each file has one primary class named after the file. Our class name: HelloWorld and our file name: HelloWorld. Every word is capitalized.
    Inside the class we had a main() method which lists our program tasks:
    '''
    public static void main(String[] args) {
    }
    '''
    Like classes, we used curly braces to mark the beginning and end of a method.
    public, static, and void are syntax we’ll learn about in future lessons. String[] args is a placeholder for information we want to pass into our program. This syntax is necessary for the program to run but more advanced than we need to explore at the moment.
    Our program printed “Hello World” with the line:
    '''
    System.out.println("Hello World");
    '''
    println is short for “print line”. We’ll use System.out.println() whenever we want a program to write a message to the screen.
    '''