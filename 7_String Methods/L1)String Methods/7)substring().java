//Learn
    There may be times when we only want a part of a string. In such cases, we may want to extract a substring from a string.
    The substring() method does exactly that. For example:
        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(23));
    It would output Constellations rung because that’s what begins at index 23 and ends at the end of line. The substring begins with the character at the specified index and extends to the end of the string.
    ***But suppose we want a substring at the middle of the string. We can include two arguments with this string method. For example:
        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(23, 38));
    It would output Constellations because that’s the substring that begins at index 23 and ends at index 38.

Instructions
    1.
    Change the arguments of the line.substring() method so that it prints out Heav'ns instead.