//Learn
    Remember our Car example from the last lesson? Let’s add a method to this Car called startEngine() that will print:
        Starting the car!
        Vroom!
    This method looks like:
        public void startEngine() {
            System.out.println("Starting the car!");
            System.out.println("Vroom!");
        }
    The first line, public void startEngine(), is the method signature. It gives the program some information about the method:
        public means that other classes can access this method. We will learn more about that later in the course.
        The void keyword means that there is no specific output from the method. We will see methods that are not void later in this lesson, but for now all of our methods will be void.
        startEngine() is the name of the method.
    A checkBalance() method for the Savings Account we talked about earlier looks something like:
        public void checkBalance(){
            System.out.println("Hello!");
            System.out.println("Your balance is " + balance);
        }
    The two print statements are inside the body of the method, which is defined by the curly braces.
    Anything we can do in our main() method, we can do in other methods! All of the Java tools you know, like the math and comparison operators, can be used to make interesting and useful methods.

Instructions
    1.
    In between the constructor and the main() method, add a method called advertise() to the Store class. It should be accessible by other classes, and should have no output.
    You can leave the body of the method empty.
    2.
    Inside the advertise() method, type two print statements. They should result in the printouts:
    "Come spend some money!"
    "Selling productType!"
    where productType is replaced with the value in the variable productType.
    However, we’re not going to see these Strings printed out yet! We’ll see in the next exercise how we can make these printouts actually run.