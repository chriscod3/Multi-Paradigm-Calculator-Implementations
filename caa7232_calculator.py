"""
Scripting Paradigm:
This implementation demonstrates key features of scripting languages
"""

# Function to add two numbers
def add(a, b):
    return a + b

# Function to subtract two numbers
def subtract(a, b):
    return a - b

# Function to multiply two numbers
def multiply(a, b):
    return a * b

# Function to divide two numbers
def divide(a, b):
    if b == 0:
        raise ValueError("No division by zero!")
    return a / b

# Function to get a number input from the user
def get_number(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Invalid input. Please enter a number.")

# Function to get an operation from the user
def get_operation():
    return input("Enter operation: +, -, *, /: ")

# Main function to run the calculator
def main():
    while True:
        try:
            # Get input from the user
            num1 = get_number("Enter the first number: ")
            num2 = get_number("Enter the second number: ")
            operation = get_operation()


            # Perform the requested operation
            if operation == '+':
                result = add(num1, num2)
            elif operation == '-':
                result = subtract(num1, num2)
            elif operation == '*':
                result = multiply(num1, num2)
            elif operation == '/':
                result = divide(num1, num2)
            else:
                print("Invalid input try again please.")
                continue

            # Display the result
            print(f"Result: {result:.2f}")
        except ValueError as e:
            print(f"Error: {e}")

# Run the main function if this script is executed
if __name__ == "__main__":
    main()
