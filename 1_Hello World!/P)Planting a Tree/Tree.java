//EXPLORE THIS SITE to check other printing methods from bleow site.
https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#out


//T1 We’re starting with a blank Java file named Tree.java. Define a class that follows the Java naming conventions.
public class Tree {
    //T2 This code produces an error because our program needs a main() method. Define this method inside the curly braces of the Tree class.
    public static void main(String[] args) {
        //T3 Write a comment in main() that describes the task it will perform. We’re going to introduce ourselves and print a tree to the screen. You can use the single-line or multi-line syntax for your comment.
        // I will print a introduction of myself.
        /* It will be amazing to create my first java project  by myself!
        thank you codecademy!
        */
        //T4 Below your comment, print a message introducing yourself to the user. Try something like “Hey there, I’m Ariel and I’m learning to code in Java!” When you run the code, you should see this message printed to the screen. 
        System.out.println("Hey there, I’m Koki and I’m learning to code in Java!");
        //T5 After introducing yourself, use another print statement to output the project goal! Something like “I’m going to plant a tree today!” or “Ready to get my hands dirty!”
        System.out.println("I’m going to plant a tree today! and Ready to get my hands dirty!");
        /*T6 See how the second statement begins on a new line? We’ll use multiple print statements to plant our tree. For example:
            System.out.println("  *  ");
            System.out.println(" *** ");
            System.out.println(" *** ");
            System.out.println("  *  ");
            System.out.println("  *  ");
        will print a tree like this:
             *  
            *** 
            *** 
             *  
             *  
        Try it out!
        */
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println("  ***  ");
    }
}