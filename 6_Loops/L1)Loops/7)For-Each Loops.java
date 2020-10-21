//Learn
    Sometimes we need access to the elements’ indices or we only want to iterate through a portion of a list. If that’s the case, a regular for loop is a great choice. But sometimes we couldn’t care less about the indices; we only care about the element itself. At times like these, for-each loops come in handy.
    For-each loops allow you to directly loop through each item in a list of items (like an array or ArrayList) and perform some action with each item. The syntax looks like this:
        for (String inventoryItem : inventoryItems) {
            System.out.println(inventoryItem);
        }
    We can read the : as “in” like this: for each inventoryItem (which should be a String) in inventoryItems, print inventoryItem.
    Note that we can name the individual item whatever we want; using the singular of a plural is just a convention. You may also encounter conventions like String word : sentence.

Instructions
    1.
    Let’s use a for-each loop to find the priciest item in expenses.
    Build a for-each loop that iterates through each expense in expenses. For now, leave the body of the loop empty.
    2.
    Inside the for-each loop, check if expense is greater than mostExpensive.
    If it is, set mostExpensive equal to expense.