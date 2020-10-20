//Learn
    The requirements of our enrollment program have changed again. Certain courses have prerequisites that are satisfied by multiple courses. As long as students have taken at least one prerequisite, they should be allowed to enroll.
    Here’s one way we could write the code:
        if (hasAlgebraPrerequisite) {
        // Enroll in course
        }
        if (hasGeometryPrerequisite) {
        // Enroll in course
        }
    We’re using two different if-then statements with the same code block. We can be more concise with the OR operator:
        if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
        // Enroll in course
        }
    The OR operator, ||, is used between two boolean values and evaluates to a single boolean value. If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.
    This code illustrates every combination:
        true || true
        // true
        false || true
        // true
        true || false
        // true
        false || false
        // false
Instructions
    1.
    Let’s write a message inside the Reservation() constructor that warns against bad input.
    Our restaurants can’t seat parties of more than 8 people, and we don’t want reservations for 0 or less because that would be silly.
    Inside Reservation(), write a conditional that uses ||.
    If count is less than 1 OR greater than 8 we want to write the following message: Invalid reservation!.