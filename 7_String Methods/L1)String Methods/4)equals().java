//Learn
    With objects, such as Strings, we can’t use the primitive equality operator == to check for equality between two strings. To test equality with strings, we use a built-in method called equals().
    For example:
        String flavor1 = "Mango";
        String flavor2 = "Peach";
        System.out.println(flavor1.equals("Mango"));
        // prints true
        System.out.println(flavor2.equals("Mango"));
        // prints false
    Side note, there’s also a ***equalsIgnoreCase() method that compares two strings without considering upper/lower cases.

Instructions
    1.
    In Password.java, there’s a password with a value of "correcthorsebatterystaple".
    Use equals() to print out whether it’s the same as another string.