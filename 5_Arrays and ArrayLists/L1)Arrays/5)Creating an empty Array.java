//Learn
    We can also create empty arrays and then fill the items one by one. Empty arrays have to be initialized with a fixed size:
        String[] menuItems = new String[5];
    Once you declare this size, it cannot be changed! This array will always be of size 5.
    After declaring and initializing, we can set each index of the array to be a different item:
        menuItems[0] = "Veggie hot dog";
        menuItems[1] = "Potato salad";
        menuItems[2] = "Cornbread";
        menuItems[3] = "Roasted broccoli";
        menuItems[4] = "Coffee ice cream";
    This group of commands has the same effect as assigning the entire array at once:
        String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};
    We can also change an item after it has been assigned! Let’s say this restaurant is changing its broccoli dish to a cauliflower one:
        menuItems[3] = "Baked cauliflower";
    Now, the array looks like:
        ["Veggie hot dog", "Potato salad", "Cornbread", "Baked cauliflower", "Coffee ice cream"]
Instructions
    1.
    We now want a Newsfeed to be able to keep track of a user’s top 10 articles.
    We’ve declared a String array called favoriteArticles, but we haven’t initialized it yet.
    In the constructor for Newsfeed, set favoriteArticles to be a new empty String array of size 10.
    2.
    Inside the method setFavoriteArticle(), set the value of the favoriteArticles array at index favoriteIndex to be the value of newArticle.
    For example, if I called setFavoriteArticle(2, "Celebrity Hands Throughout the Decades"), the value of favoriteArticles at index 2 would be set to "Celebrity Hands Throughout the Decades".