#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>


/* Procedural Paradigm:
 * This implementation follows the procedural paradigm by organizing the program
 * into a series of procedure calls. Each function performs a specific task,
 */

//function to add two numbers
double add(double a, double b) {
    return a + b;
}

// Function to subtract two numbers
double subtract(double a, double b) {
    return a - b;
}

double multiply(double a, double b) {
    return a * b;
}

// this function to divide two numbers
double divide(double a, double b) {
    return a / b;
}

//  this gets a valid operation from the user
int get_operation() {
    char op;
    printf("Enter operation (+, -, *, /) or 'q' to quit: ");
    scanf(" %c", &op);
    return op;
}

// to get a valid number from the user
double get_number(const char* prompt) {
    char input[100];
    double num;
    int valid;

    do {
        printf("%s", prompt);
        scanf("%s", input);
        valid = 1;

        for (int i = 0; input[i] != '\0'; i++) {
            if (!isdigit(input[i]) && input[i] != '.' && input[i] != '-') 
{
                valid = 0;
                break;
            }
        }

        if (valid) {
            num = atof(input);
        } else {
            printf("Invalid input. Please try again.\n");
        }
    } while (!valid);

    return num;
}

int main() {
    double num1, num2, result;
    char operation;

    while (1) {
        num1 = get_number("Enter the first number: ");
        num2 = get_number("Enter the second number: ");
        operation = get_operation();

        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
            //to handle division by zero
                if (num2 == 0) {
                    printf("No Dividing by zero!\n");
                    continue;
                }
                result = divide(num1, num2);
                break;
            default:
                printf("Invalid operation. Please try again.\n");
                continue;
        }

        printf("Result: %.2f\n", result);
    }

    return 0;
}
