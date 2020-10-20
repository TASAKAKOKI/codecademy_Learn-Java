//Learn
  We saw how a method’s scope prevents us from using variables declared in one method in another method. What if we had some information in one method that we needed to pass into another method?
  Similar to how we added parameters to constructors, we can customize all other methods to accept parameters.
  class Car {
    String color;
    public Car(String carColor) {
      color = carColor;         
    }
    public void startRadio(String station) {
      System.out.println("Turning on the radio to " + station + "!");
      System.out.println("Enjoy!");
    }
    public static void main(String[] args){
      Car myCar = new Car("red");
      myCar.startRadio("Meditation Station");
    }
  }
  In this code, we create a startRadio() method that accepts an String parameter called station. In the main() method, we call the startRadio() method on the myCar object and provide an String argument of "Meditation Station".
  A call to the startRadio() method on myCar results in printing:
  Turning on the radio to Meditation Station!
  Enjoy!
Instructions
  1.
  Add a method to the Store class called greetCustomer(). It should be accessible by other classes, and return no output. For now, have it take no parameters and leave the body of the method empty.
  2.
  Modify the greetCustomer() method so that it accepts a String parameter called customer.
  3.
  Inside of the greetCustomer() method, add a print statement to print:
  "Welcome to the store, " + customer + "!"
  4.
  Inside the main() method, call the greetCustomer() method on the lemonadeStand object. Pass in a String argument of your choice!