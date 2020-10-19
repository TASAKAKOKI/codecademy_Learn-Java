/*
In this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).
Mad Libs require:
    A short story with blank spaces (asking for different types of words).
    Words from the player to fill in those blanks.
“Roses are Red” poem example:
    Roses are _(adjective)_ _(Noun)_ are blue _(Noun)_ is _(Adjective)_ And so are you!
For this project, we have provided the story, but it will be up to you to complete the following:
    Create all the variables needed for the story.
    Print the story with the variables in the right places.
Let’s begin!
*/

//T1 Let’s create a comment that describes the program!
//The /* and */ are already in place for you. In between them, write a description that looks something like:
//  This program generates a mad libbed story.
//  Author: Laura
//  Date: 2/19/2049
public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Laura
    Date: 2/19/2049
    */
  	public static void main(String[] args){
      //T2 Take a look at the variable named story. It is set equal to a string that will contain our story.
      //All of these variables will need to be declared and initialized before the code will compile without errors.  
      String name1 = "MAIN";
      String adjective1 = "fast";
      String adjective2 = "slow";
      String noun1 = "Sun";
      String noun2 = "Moon";
      String verb1 = "Sky";
      String noun3 = "Cookie";
      String noun4 = "Smart-Phone";
      String adjective3 = "hungry";
      String name2 = "TIGER";
      String place1 = "Playground";
      String noun5 = "Radio";
      int number = 69;
      String noun6 = "GOD";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      //T11 Time to read the story! Use System.out.println() to print the story variable.
      System.out.println(story);
    }       
}