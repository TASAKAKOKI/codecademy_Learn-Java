//Learn
    If you have examined the code thoroughly, and you are sure the compiler is compiling the right source file, it is time for desperate measures:
        1. Divide and conquer: Comment out or temporarily delete half the code to isolate an issue.
            If the program compiles now, you know the error is in the code you deleted. Bring back about half of what you removed and repeat.
            If the program still doesn’t compile, the error must be in the code that remains. Delete about half of the remaining code and repeat.
          Tip: In most code editors, one can highlight a block of code and use the keyboard shortcut command + / to comment it out.
        2. Print statements for the rescue: Use System.out.println() to check variable/return values at various points throughout the program.
            A lot of the time with logic errors, there was a flawed piece of logic, a miscalculation, a missing step, etc. By printing out the values at different stages of the execution flow, you can then hopefully pinpoint where you made a mistake.

Instructions
    1.
    Here’s a AreaCalculator.java program that solves for the area of different shapes:
        Triangle:
           area = 1/2 ⋅ base ⋅ height
        Rectangle:
            area = length ⋅ width
        Circle:
            area = π ⋅ r^2 
    There is a logical error: it is not calculating the areas right for one of the shapes. Find the bug!