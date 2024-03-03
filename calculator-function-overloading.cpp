/*
Develop a C++ program to simulate a calculator that performs basic arithmetic operations on
integers and floating point numbers using the concept of function overloading.
*/

#include<iostream>
using namespace std;

// Function overloading for integer operations
int add(int a, int b)
{
    return a + b;
}

int subtract(int a, int b)
{
    return a - b;
}

int multiply(int a, int b)
{
    return a * b;
}

int divide(int a, int b)
{
    if (b == 0)
    {
        cout << "Error: Division by zero!" << endl;
        return 0;
    }
    return a / b;
}

// Function overloading for floating point operations
float add(float a, float b)
{
    return a + b;
}

float subtract(float a, float b)
{
    return a - b;
}

float multiply(float a, float b)
{
    return a * b;
}

float divide(float a, float b)
{
    if (b == 0.0)
    {
        cout << "Error: Division by zero!" << endl;
        return 0;
    }
    return a / b;
}

// main() function
int main() {
    int choice, i1, i2;
    float d1, d2;
    cout << "Calculator Program" << endl;
    cout << "Choose Operation: 1-Add, 2-Subtract, 3-multiply, 4-divide" << endl;
    cin >> choice;
    cout << "Enter 1 for integer operations and 2 for floating point operations: " << endl;
    int type;
    cin >> type;

    if(type == 1) {
        cout << "Enter two integers: ";
        cin >> i1 >> i2;
        switch (choice) {
            case 1: cout << "Result: " << add(i1, i2) << endl;
            break;
            case 2: cout << "Result: " << subtract(i1, i2) << endl;
            break;
            case 3: cout << "Result: " << multiply(i1, i2) << endl;
            break;
            case 4: cout << "Result: " << divide(i1, i2) << endl;
            break;
            default: cout << "Invalid Operation!!" << endl;
        }
    }
    else if(type == 2) {
        cout << "Enter two floating point numbers: ";
        cin >> d1 >> d2;
        switch(choice) {
            case 1: cout << "Result: " << add(d1, d2) << endl;
            break;
            case 2: cout << "Result: " << subtract(d1, d2) << endl;
            break;
            case 3: cout << "Result: " << multiply(d1, d2) << endl;
            break;
            case 4: cout << "Result: " << divide(d1, d2) << endl;
            break;
            default: cout << "Invalid Operation!!" << endl;
        }
    }
    else {
        cout << "Inavlid input type!!" << endl;
    }
    return 0;
}