//Learn
    Hang on, you might be thinking, if the child class inherits its parent’s fields and methods, does it also inherit the constructor? It does indeed, and sometimes this isn’t quite what we want.
    Let’s say Shape has a numSides field that is set by passing an integer into the constructor. If we’re instantiating a Triangle, we would want that number to always be 3, so we’d want to modify the constructor to automatically assign numSides with a value of 3.
    Can we do that?
    As it happens, Java has a trick up its sleeve for just this occasion: using the super() method which acts like the parent constructor inside the child class constructor:
        class Triangle extends Shape {
            Triangle() {
                super(3);
            }
            // additional Triangle class members
        }
    By passing 3 to super(), we are making it possible to instantiate a Triangle without passing in a value for numSides.
    Meanwhile, super() (behaving as Shape()) will shoulder the responsibility of setting numSides to 3 for our Triangle object.
    It is also possible to just completely override a parent class constructor by writing a new constructor for the child class:
        class Triangle extends Shape {
            Triangle() {
                this.numSides = 3;
            }   
            // additional Triangle class members
        }
    In the above example, numSides is just set to 3 without leveraging the parent class constructor.

Instructions
    1.
    Tab over to Pho.java and build a constructor for Pho.
    Leave the constructor’s parameters blank. Inside the constructor, pass the following arguments in the following order to super() — the constructor for Noodle:
        A lengthInCentimeters of 30.0
        A widthInCentimeters of 0.64
        A shape of "flat"
        ingredients of "rice flour"
    2.
    Tab back over to Noodle.java. Inside main(), instantiate a new Pho instance called phoChay.
    Now print out phoChay‘s shape.