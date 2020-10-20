'''
Build A Droid
    We’ve set up a robot workshop to build some droids. All that’s missing are the instructions on how to create the robots and what they’ll do.
    Can we write a Java class to help?
    We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work!
'''
Droid.java
    Declaring Droid
        1.
        The Droid.java file is empty.
        Start by defining the class Droid.
        Don’t forget to include a main() method! You can leave it empty for now.
        We want a Droid object that has the following state:
            name
            battery level
        and the following behavior:
            performing a task
            stating its battery level
        2.
        Declare an instance field called batteryLevel. We want to store whole number values in this field.
        3.
        Declare another instance field called name which will store our droid’s name.
        What type should this be?
        4.
        Create a constructor method for the Droid class.
        The method should have one parameter of String droidName.
        5.
        Inside the constructor, assign the parameter value of droidName to the appropriate instance field.
        Set the value of batteryLevel to 100. Every new instance of Droid will have a batteryLevel of 100.
    Declaring Instances of Drone
        6.
        Inside main(), create a new instance of Droid named "Codey".
        7.
        Print out the variable using System.out.println().
        8.
        That output isn’t very informative!
        Define a toString() method within Droid.
        The return type is String.
        Inside toString(), return a string that introduces the Droid using their name.
        Something like “Hello, I’m the droid: droidNameHere”
    Doing Droid Things
        9.
        Define a new method: performTask(). This method should have a single parameter: String task.
        This method does not return any value.
        10.
        Inside performTask(), print a statement like “name is performing task: task“.
        For example, codey.performTask("dancing"); will print:
        Codey is performing task: dancing
        11.
        Performing tasks is hard work. After the print statement, set batteryLevel to be 10 less than it was before.
        We’ll need to reassign the instance field to be the current value minus 10.
        12.
        Have your Droid instance perform some tasks inside of main().
    Next steps
        13.
        Create new instances and play around with methods. Here are some ideas to get you started:
            Create a energyReport() method that prints the instance’s batteryLevel.
            Create another instance.
            Create a method energyTransfer() that exchanges batteryLevel between instances.
// result of Droid.java
public class Droid {
  String name;
  int battery;
  public Droid(String droidName) {
    name = droidName;
    battery = 100;
  }
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    battery -= 10;
  }
  public void energyReport() {
    System.out.println(name + "'s battery level is now " + battery);
  }
  public void energyTransfer(Droid transferTo, int energy) {
    battery -= energy;
    transferTo.battery += energy;
    System.out.println(name + " transfered " + energy + " energy to " + transferTo.name + "...\n" + "...\n" + "...\n" + "as result\n" +"current battery of " + name +" is " + battery + " and of " + transferTo.name + " is " + transferTo.battery + ".");
  }
  public String toString() {
    return "Hello, I'm the droid: " + name + "\n" +"    current battery is: " + battery;
  }
  public static void main(String[] args) {
    Droid myDroid = new Droid("Codey");
    Droid droid2 = new Droid("KOKI");
    System.out.println(myDroid);
    System.out.println(droid2);
    myDroid.performTask("singing");
    myDroid.energyReport();
    droid2.performTask("dancing");
    droid2.energyReport();
    myDroid.energyTransfer(droid2,35);  
  }
}