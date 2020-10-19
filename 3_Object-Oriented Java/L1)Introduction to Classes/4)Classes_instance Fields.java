//learn
    Our last exercise ended with printing an instance of Store, which looked something like Store@6bc7c054. The first part, Store, refers to the class, and the second part @6bc7c054 refers to the instance’s location in the computer’s memory.
    We don’t care about memory location, but our instances have no other characteristics!
    We’ll add associated data to an object by introducing instance variables, or instance fields. Instance fields are the state in our objects.
    We want Car instances of different colors, so we declare a String color instance field.
        public class Car {
            /*
            declare fields inside the class
            by specifying the type and name
            */
            String color;
            public Car() {
                /* 
                instance fields available in
                scope of constructor method
                */
            }
            public static void main(String[] args) {
                // body of main method
            }
        }
    ***The declaration is within the class and the instance variable will be available for assignment inside the constructor.
    ***Fields are a type of state each instance will possess. One instance may have "red" as its color, another "blue", etc. We’ll learn how to assign values in the next exercise.
//Instructions
    1.
    Add some state to our Store class.
    Declare a String instance field for productType.