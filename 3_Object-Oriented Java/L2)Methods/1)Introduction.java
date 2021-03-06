//Learn
    In the last lesson, we created an instance of the Store class in the main method. We learned that objects have state and behavior:
    We have seen how to give objects state through instance fields. Now, we’re going to learn about behavior. Remember our example of a Savings Account.
    A savings account should know:
        The balance of money available
    It should be able to perform:
        Depositing
        Increasing the amount available
        Withdrawing
        Decreasing the amount available
        Checking the balance
        Displaying the amount available.
    You have defined and called constructor methods, which create an instance of a class. You have also defined main methods, which are the tasks that execute when the program is run. These are specific examples of methods. We can also define our own that will take input, do something with it, and return the kind of output we want.
    makeSandwich() adds ingredients together to make a sandwich
    What if it took 20 lines of code to make a sandwich? Our program would become very long very quickly if we were making multiple sandwiches. Methods are powerful because they allow us to create blocks of code that are repeatable and modular.

Instructions
    1.
    We have made a SavingsAccount class without using any methods beyond main() and the constructor, SavingsAccount().
    Run the code to see some account behavior happen.
    Look at the main method! It’s so long! There is so much repeated code! Can you imagine how messy it would look if you needed to make 10 deposits?
    Throughout this lesson, we will learn how to make methods that would make checking the balance, depositing, and withdrawing all behavior that would take only one line of code.