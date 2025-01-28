import java.util.Scanner;
// "import" - keyword to bring in external classes or packages.
// "java.util" - package for utility classes (e.g., Scanner).
// "Scanner" - class that reads input from the user.

public class MenuDrivenProgram {
    // "public" - access specifier that allows access from anywhere.
    // "class" - defines a class.
    // "MenuDrivenProgram" - class name, starts the class definition.

    public static void main(String[] args) {
        // "public" - access specifier, allows access from anywhere.
        // "static" - method can be called without an instance of the class.
        // "void" - method does not return any value.
        // "main" - entry point method.
        // "String[] args" - command-line arguments.

        Scanner scanner = new Scanner(System.in);
        // "Scanner" - class for taking input from the user.
        // "System.in" - input stream from the keyboard.

        int choice;
        // "int" - variable type to store the user's menu choice.
        // "choice" - variable name.

        do {
            // "do" - loop keyword, executes the code inside at least once.

            System.out.println("\n--- Menu ---");
            // "System.out.println" - prints the menu header on the console.

            System.out.println("1. Print 'Welcome to Java Programming'");
            // Displays menu option 1.

            System.out.println("2. Add two numbers");
            // Displays menu option 2.

            System.out.println("3. Calculate difference, product, and division of two numbers");
            // Displays menu option 3.

            System.out.println("4. Find the square of a number");
            // Displays menu option 4.

            System.out.println("5. Check if a number is even or odd");
            // Displays menu option 5.

            System.out.println("6. Check if a number is positive, negative, or zero");
            // Displays menu option 6.

            System.out.println("7. Find the largest of three numbers");
            // Displays menu option 7.

            System.out.println("8. Print multiplication table of a given number");
            // Displays menu option 8.

            System.out.println("9. Calculate the factorial of a number");
            // Displays menu option 9.

            System.out.println("10. Print all even numbers from 1 to 100");
            // Displays menu option 10.

            System.out.println("11. Check if a given string is a palindrome");
            // Displays menu option 11.

            System.out.println("12. Count the number of vowels in a given string");
            // Displays menu option 12.

            System.out.println("13. Reverse the digits of a number");
            // Displays menu option 13.

            System.out.println("14. Check if a given number is a palindrome");
            // Displays menu option 14.

            System.out.println("15. Find the sum of digits of a number");
            // Displays menu option 15.

            System.out.println("16. Print Fibonacci series up to n terms");
            // Displays menu option 16.

            System.out.println("17. Calculate the sum of the first n natural numbers");
            // Displays menu option 17.

            System.out.println("18. Check if a number is prime");
            // Displays menu option 18.

            System.out.println("0. Exit");
            // Displays menu option 0 for exit.

            System.out.print("Enter your choice: ");
            // "System.out.print" - prompt to enter a choice.

            choice = scanner.nextInt();
            // "scanner.nextInt()" - reads an integer from the user and stores it in "choice".

            switch (choice) {
                // "switch" - starts a control structure that performs different actions based on "choice".

                case 1:
                    // "Print 'Welcome to Java Programming'"
                    System.out.println("Welcome to Java Programming");
                    // Prints a welcome message.
                    break;

                case 2:
                    // "Add two numbers"
                    System.out.print("Enter two numbers: ");
                    // Prompt the user for two numbers.

                    int addNum1 = scanner.nextInt();
                    // "addNum1" - first number entered by the user.

                    int addNum2 = scanner.nextInt();
                    // "addNum2" - second number entered by the user.

                    System.out.println("Sum: " + (addNum1 + addNum2));
                    // Prints the sum of addNum1 and addNum2.
                    break;

                case 3:
                    // "Calculate difference, product, and division of two numbers"
                    System.out.print("Enter two numbers: ");
                    // Prompt the user for two numbers.

                    int diffProdNum1 = scanner.nextInt();
                    // "diffProdNum1" - first number entered by the user.

                    int diffProdNum2 = scanner.nextInt();
                    // "diffProdNum2" - second number entered by the user.

                    System.out.println("Difference: " + (diffProdNum1 - diffProdNum2));
                    // Prints the difference between diffProdNum1 and diffProdNum2.

                    System.out.println("Product: " + (diffProdNum1 * diffProdNum2));
                    // Prints the product of diffProdNum1 and diffProdNum2.

                    if (diffProdNum2 != 0) {
                        // "if" - checks if diffProdNum2 is not zero before dividing.
                        System.out.println("Division: " + (diffProdNum1 / diffProdNum2));
                        // Prints the result of division.
                    } else {
                        // "else" - runs if diffProdNum2 is zero.
                        System.out.println("Cannot divide by zero.");
                        // Prints error message for division by zero.
                    }
                    break;

                case 4:
                    // "Find the square of a number"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int squareNum = scanner.nextInt();
                    // "squareNum" - reads the input number.

                    System.out.println("Square: " + (squareNum * squareNum));
                    // Prints the square of the number.
                    break;

                case 5:
                    // "Check if a number is even or odd"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int evenOddNum = scanner.nextInt();
                    // "evenOddNum" - reads the input number.

                    if (evenOddNum % 2 == 0) {
                        // "if" - checks if the number is even by verifying remainder.
                        System.out.println("Even");
                        // Prints "Even" if the number is even.
                    } else {
                        // "else" - runs if the number is odd.
                        System.out.println("Odd");
                        // Prints "Odd" if the number is odd.
                    }
                    break;

                case 6:
                    // "Check if a number is positive, negative, or zero"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int posNegZeroNum = scanner.nextInt();
                    // "posNegZeroNum" - reads the input number.

                    if (posNegZeroNum > 0) {
                        // "if" - checks if the number is positive.
                        System.out.println("Positive");
                        // Prints "Positive" if posNegZeroNum is greater than zero.
                    } else if (posNegZeroNum < 0) {
                        // "else if" - checks if the number is negative.
                        System.out.println("Negative");
                        // Prints "Negative" if posNegZeroNum is less than zero.
                    } else {
                        // "else" - runs if the number is zero.
                        System.out.println("Zero");
                        // Prints "Zero" if posNegZeroNum equals zero.
                    }
                    break;

                case 7:
                    // "Find the largest of three numbers"
                    System.out.print("Enter three numbers: ");
                    // Prompt the user for three numbers.

                    int largestNum1 = scanner.nextInt();
                    // "largestNum1" - first number entered by the user.

                    int largestNum2 = scanner.nextInt();
                    // "largestNum2" - second number entered by the user.

                    int largestNum3 = scanner.nextInt();
                    // "largestNum3" - third number entered by the user.

                    int largest = largestNum1;
                    // "largest" - stores the largest number.

                    if (largestNum2 > largest) largest = largestNum2;
                    if (largestNum3 > largest) largest = largestNum3;
                    System.out.println("Largest number: " + largest);
                    break;

                case 8:
                    // "Print multiplication table of a given number"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int tableNum = scanner.nextInt();
                    // "tableNum" - reads the input number.

                    for (int i = 1; i <= 10; i++) {
                        // "for" - loop to print the multiplication table.
                        System.out.println(tableNum + " * " + i + " = " + (tableNum * i));
                        // Prints the multiplication of tableNum by each number from 1 to 10.
                    }
                    break;

                case 9:
                    // "Calculate the factorial of a number"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int factNum = scanner.nextInt();
                    // "factNum" - reads the input number.

                    int fact = 1;
                    // "fact" - stores the factorial result.

                    for (int i = 1; i <= factNum; i++) {
                        // "for" - loop from 1 to factNum to calculate the factorial.
                        fact *= i;
                    }
                    System.out.println("Factorial: " + fact);
                    // Prints the factorial of factNum.
                    break;

                case 10:
                    // "Print all even numbers from 1 to 100"
                    System.out.println("Even numbers from 1 to 100:");
                    // Prints header for even numbers.

                    for (int i = 2; i <= 100; i += 2) {
                        // "for" - loop to print all even numbers from 1 to 100.
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 11:
                    // "Check if a given string is a palindrome"
                    System.out.print("Enter a string: ");
                    // Prompt the user for a string.

                    String palindromeStr = scanner.next();
                    // "palindromeStr" - the string entered by the user.

                    String reversedStr = new StringBuilder(palindromeStr).reverse().toString();
                    // "reversedStr" - the reversed string.

                    if (palindromeStr.equals(reversedStr)) {
                        // "if" - checks if the original string matches the reversed string.
                        System.out.println("Palindrome");
                    } else {
                        // "else" - runs if the string is not a palindrome.
                        System.out.println("Not a Palindrome");
                    }
                    break;

                case 12:
                    // "Count the number of vowels in a given string"
                    System.out.print("Enter a string: ");
                    // Prompt the user for a string.

                    String vowelStr = scanner.next();
                    // "vowelStr" - the string entered by the user.

                    int vowelCount = 0;
                    // "vowelCount" - counter for vowels.

                    for (int i = 0; i < vowelStr.length(); i++) {
                        // "for" - loop to iterate through each character in the string.
                        char ch = vowelStr.charAt(i);
                        // "ch" - current character in the string.

                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                            // "if" - checks if the character is a vowel.
                            vowelCount++;
                        }
                    }
                    System.out.println("Number of vowels: " + vowelCount);
                    // Prints the number of vowels.
                    break;

                case 13:
                    // "Reverse the digits of a number"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int reverseNum = scanner.nextInt();
                    // "reverseNum" - reads the input number.

                    int reversedNumber = 0;
                    // "reversedNumber" - stores the reversed number.

                    while (reverseNum != 0) {
                        // "while" - loop until reverseNum becomes 0.
                        reversedNumber = reversedNumber * 10 + reverseNum % 10;
                        // Reverses the digits by extracting the last digit of reverseNum.
                        reverseNum /= 10;
                        // Removes the last digit of reverseNum.
                    }
                    System.out.println("Reversed number: " + reversedNumber);
                    // Prints the reversed number.
                    break;

                case 14:
                    // "Check if a given number is a palindrome"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int palindromeNum = scanner.nextInt();
                    // "palindromeNum" - reads the input number.

                    int originalNum = palindromeNum;
                    // "originalNum" - stores the original number.

                    int reversedNum = 0;
                    // "reversedNum" - stores the reversed number.

                    while (palindromeNum != 0) {
                        reversedNum = reversedNum * 10 + palindromeNum % 10;
                        palindromeNum /= 10;
                    }

                    if (originalNum == reversedNum) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not a Palindrome");
                    }
                    break;

                case 15:
                    // "Find the sum of digits of a number"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int sumDigitsNum = scanner.nextInt();
                    // "sumDigitsNum" - reads the input number.

                    int sumOfDigits = 0;
                    // "sumOfDigits" - stores the sum of digits.

                    while (sumDigitsNum != 0) {
                        sumOfDigits += sumDigitsNum % 10;
                        // Adds the last digit of sumDigitsNum to sumOfDigits.
                        sumDigitsNum /= 10;
                        // Removes the last digit of sumDigitsNum.
                    }
                    System.out.println("Sum of digits: " + sumOfDigits);
                    // Prints the sum of digits.
                    break;

                case 16:
                    // "Print Fibonacci series up to n terms"
                    System.out.print("Enter the number of terms: ");
                    // Prompt the user for the number of terms.

                    int fibonacciTerms = scanner.nextInt();
                    // "fibonacciTerms" - reads the number of terms.

                    int a = 0, b = 1;
                    // "a" and "b" - first two numbers of the Fibonacci series.

                    System.out.print("Fibonacci series: ");
                    for (int i = 1; i <= fibonacciTerms; i++) {
                        // "for" - loop to print the Fibonacci series.
                        System.out.print(a + " ");
                        int next = a + b;
                        // "next" - next number in the Fibonacci series.
                        a = b;
                        // "a" takes the value of "b".
                        b = next;
                        // "b" takes the value of "next".
                    }
                    System.out.println();
                    break;

                case 17:
                    // "Calculate the sum of the first n natural numbers"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int nSumNum = scanner.nextInt();
                    // "nSumNum" - reads the input number.

                    int sum = nSumNum * (nSumNum + 1) / 2;
                    // Formula for the sum of the first n natural numbers.

                    System.out.println("Sum of first " + nSumNum + " natural numbers: " + sum);
                    // Prints the sum.
                    break;

                case 18:
                    // "Check if a number is prime"
                    System.out.print("Enter a number: ");
                    // Prompt the user for a number.

                    int primeNum = scanner.nextInt();
                    // "primeNum" - reads the input number.

                    boolean isPrime = true;
                    // "isPrime" - flag to indicate if the number is prime.

                    for (int i = 2; i <= Math.sqrt(primeNum); i++) {
                        // "for" - checks for divisors from 2 to the square root of primeNum.
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime && primeNum > 1) {
                        // "if" - checks if the number is prime.
                        System.out.println(primeNum + " is a prime number.");
                    } else {
                        // "else" - runs if the number is not prime.
                        System.out.println(primeNum + " is not a prime number.");
                    }
                    break;

                case 0:
                    // "Exit"
                    System.out.println("Exiting...");
                    // Prints exit message.
                    break;

                default:
                    // "default" - handles invalid choices by the user.

                    System.out.println("Invalid choice. Try again.");
                    // Prints an error message for invalid choices.
            }

        } while (choice != 0);
        // "while" - condition to repeat the menu loop until choice is 0 (exit).

        scanner.close();
        // "scanner.close()" - closes the scanner object to free resources after use.

    }
}
