//Learn
    One common pattern you’ll encounter as a programmer is looping through a list of data and doing something with each item. In Java, that list would be an array or ArrayList and the loop could be a for loop. But wait, how does this work?
    for loops begin with a counter variable. We can use that counter to track the index of the current element as we iterate over the list of data.
    Because the first index in an array or ArrayList is 0, the counter would begin with a value of 0 and increment until the end of the list. So we can increment through the array or ArrayList using its indices.
    For example, if we wanted to add 1 to every int item in an array secretCode, we could do this:
        for (int i = 0; i < secretCode.length; i++) {
            secretCode[i] += 1;
        }
    Notice that our condition in this example is i < secretCode.length. Because array indices start at 0, the length of secretCode is 1 larger than its final index. Therefore, the loop should stop when it is less than BUT NOT equal to the length value.
    In the case of an ArrayList, this code would look like:
        for (int i = 0; i < secretCode.size(); i++) {
            int num = secretCode.get(i);
            secretCode.set(i, num + 1);
        }
Instructions
    1.
    Let’s use a for loop to iterate over expenses and sum up the total of all items.
    Start with the skeleton of a for loop:
        Initialize a counter i with a value of 0.
        The loop should run while i is less than the size() of expenses.
        Increment i.
    You can leave the body empty for now.
    2.
    Inside the for loop, add the item’s value to total.