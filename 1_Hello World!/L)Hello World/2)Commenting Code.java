//Instruction
    1. The file Timeline.java has plain text information about Java.
    Plain text facts aren’t valid syntax. We’ll use comments to avoid breaking the program.
    Use the single-line comment syntax for the first fact.
    Change this line into a comment:
        Sun Microsystems announced the release of Java in 1995
    2.
    Our program is still broken!
    Use the multi-line syntax to make these lines into a single comment:
        James Gosling is a Canadian engineer who created Java while
        working at Sun Microsystems. His favorite number is the
        square root of 2!
    You should still see You are a fun language! printed!


//Learn
    Writing code is an exciting process of instructing the computer to complete fantastic tasks.
    Code is also read by people, and we want our intentions to be clear to humans just like we want our instructions to be clear to the computer.
    Fortunately, we’re not limited to writing syntax that performs a task. We can also write comments, notes to human readers of our code. These comments are not executed, so there’s no need for valid syntax within a comment.
    When comments are short we use the single-line syntax: //.
        // calculate customer satisfaction rating
    When comments are long we use the multi-line syntax: /* and */.
        /*
        We chose to store information across multiple databases to
        minimize the possibility of data loss. We'll need to be careful
        to make sure it does not go out of sync!
        */
    Here’s how a comment would look in a complete program:
        public class CommentExample {
        // I'm a comment inside the class
            public static void main(String[] args) {
                // I'm a comment inside a method
                System.out.println("This program has comments!");
            }
        }
    Comments are different from printing to the screen, when we use System.out.println(). These comments won’t show up in our terminal, they’re only for people who read our code in the text editor.
