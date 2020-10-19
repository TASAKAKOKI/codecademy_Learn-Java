//learn
    Now that our constructor has a parameter, we must pass values into the method call. These values become the state of the instance.
    Here we create an instance, ferrari, in the main() method with "red" as its color field:
        public class Car {
            String color;

            public Car(String carColor) {
                // assign parameter value to instance field
                color = carColor;
            }

            public static void main(String[] args) {
                // parameter value supplied when calling constructor
                Car ferrari = new Car("red");
            }
        }
    We pass the String value "red" to our constructor method call: new Car("red");.
    The type of the value given to the invocation must match the type declared by the parameter.
    Inside the constructor, the parameter carColor refers to the value passed in during the invocation: "red". This value is assigned to the instance field color.
    color has already been declared, so we don’t specify the type during assignment.
    The object, ferrari, holds the state of color as an instance field referencing the value "red".
    We access the value of this field with the dot operator (.):
        /*
        accessing a field:
        objectName.fieldName
        */

        ferrari.color; // == "red"
//Instructions
    1.
    Inside main(), create an instance of Store and assign it to the variable lemonadeStand. Use "lemonade" as the parameter value.
    2.
    Print the instance field productType from lemonadeStand.