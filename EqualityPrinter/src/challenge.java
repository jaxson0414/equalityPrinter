/* Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise print "Neither all are equal or different".

EXAMPLES OF INPUT/OUTPUT:

printEqual(1, 1, 1); should print text All numbers are equal
printEqual(1, 1, 2); should print text Neither all are equal or different
printEqual(-1, -1, -1); should print text Invalid Value
printEqual(1, 2, 3); should print text All numbers are different
NOTES

 The printEqual method needs to be defined as public static like we have been doing so far in the course.
 Do not add main method to solution code.*/
public class challenge {
    public static void main(String[] args) {
        printEqual(6, 6, 6);
    }


    public static void printEqual(int a, int b, int c) {
            if ((a < 0) || (b < 0) || (c < 0)) {
                System.out.println("Invalid Value");
            } else if ((a == b) && (b == c) && (c == a)) {
                System.out.println("All numbers are equal");
            } else if ((a != b) && (b != c) && (c != a)) {
                System.out.println("ALl numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
    }
}
