//instruction
    1. In Creator.java, we have defined some variables related to James Gosling, the creator of Java.
    Inside main(), use System.out.println() to print out the variable name.
        :System.out.println(name);
    2. Use the same command to print out yearCreated.
        :System.out.println(yearCreated);
    3. 
//learn
    Let’s say we need a program that connects a user with new jobs. We need the user’s name, their salary, and their employment status. All of these pieces of information are stored in our program.
    We store information in variables, named locations in memory.
    Naming a piece of information allows us to use that name later, accessing the information we stored.
    Variables also give context and meaning to the data we’re storing. The value 42 could be someone’s age, a weight in pounds, or the number of orders placed. With a name, we know the value 42 is age, weightInPounds, or numOrdersPlaced.
    In Java, we specify the type of information we’re storing. Primitive datatypes are types of data built-in to the Java system.
    We must declare a variable to reference it within our program. Declaring a variable requires that we specify the type and name:
        // datatype variableName
        int age;
        double salaryRequirement;
        boolean isEmployed;
    The above variable types are int, double, and boolean. This lesson will introduce these built-in types and more.
    The names of the variables are age, salaryRequirement, and isEmployed.
    These variables don’t have any associated value. To assign a value to a variable, we use the assignment operator =:
        age = 85;
    It’s common to declare a variable and assign the value in one line!
    For example, to assign 2011 to a variable named yearCodecademyWasFounded of type int, we write:
        int yearCodecademyWasFounded = 2011;