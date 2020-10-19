/*
In this project, you will become a mathemagician and write a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you choose.
The instructions provided are general guidelines. Upon completion of the project, feel free to explore the code on your own.
*/

//1_Create an int variable called myNumber. Set it equal to any integer other than 0.
public class Magic {
	public static void main(String[] args) {
        int myNumber = 1202;
        // We will refer to myNumber as the original number from now on - it might be helpful to document this.
        
        //2_Create an int variable called stepOne.
        //Set it equal to the original number (myNumber) multiplied by itself
        int stepOne = myNumber * myNumber;
        
        //3_Create an int variable called stepTwo.
        //Set it equal to the previous result (stepOne) plus the original number (myNumber).
        int stepTwo = stepOne + myNumber;
        
        //4_Create an int variable called stepThree.    
        //Set it equal to the previous result (stepTwo) divided by the original number.
        int stepThree = stepTwo / myNumber;
        
        //5_Create an int variable called stepFour.
        //Set it equal to the previous result (stepThree) plus 17.
        int stepFour = stepThree + 17;

        //6_Create an int variable called stepFive.
        //Set it equal to the previous result (stepFour) minus the original number.
        int stepFive = stepFour - myNumber;

        //7_Create an int variable called stepSix.
        //Set it equal to the previous result (stepFive) divided by 6.
        int stepSix = stepFive / 6;

        //8_Print out the value of the last step.
        //Then, save and run your code!
        //What number is printed to the console?
        System.out.println(stepSix);

        //Now, go back to your code and change myNumber to any other integer. Run your program again.
        //Is the output the same?
        //It’s math magic!
	}
}