//learn
    We’ll use a combination of constructor method and instance field to create instances with individual state.
    We need to alter the constructor method because now it needs to access data we’re assigning to the instance.
    Our Car constructor now has a parameter: String carColor.
        public class Car {
            String color;

            // constructor method with a parameter
            public Car(String carColor) {
                ///*** parameter value assigned to the field
                color = carColor;
            }
            public static void main(String[] args) {
                // program tasks
            }
        }
    We need a value for the instance field color, so we’ve added String carColor as a parameter.
    Parameters specify the type and name of data available for reference within a method’s scope.
    We’ve already seen a parameter in the main() method: String[] args, but this is the first time we’re using the parameter value within a method body.
    The parameter carColor references the value passed in during a method call:
        new Car("blue");
        // carColor references "blue" inside constructor
        new Car("yellow");
        // carColor references "yellow" inside constructor
    Within the constructor, we assign the parameter value to the instance field.
    Instance fields are available for assignment inside the constructor because we declared them within the class.
//Instructions
    1.
    Add the String parameter product to the Store() constructor.
    2.
    Inside of the constructor method, set the instance variable productType equal to the product parameter.