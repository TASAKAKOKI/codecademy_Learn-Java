//Learn
    The concat() method concatenates one string to the end of another string. Concatenation is the operation of joining two strings together.
    Suppose we have a String called str1 and another String called str2, using str1.concat(str2) would return str1 with str2 appended to the end of it.
    For example:
        String name = "Code";
        name = name.concat("cademy");
        System.out.println(name);
    Codecademy would be printed.
    In the code block above, we changed the value of name by reassigning it with a new value. ***However, concat() doesn’t actually change the value of the original string.
    Suppose we do something slightly different:
        String name = "Code";
        name.concat("cademy");
        System.out.println(name);
    Code would be printed instead.

Instructions
    1.
    Store your first name in firstName and your last name in lastName.
    Print out your full name using concat().