/*
Implement a C++ Program to demonstrate the concept of class, objects and constructors by
creatinh a class that holds the basic information of students belonging to an engineering
college.
*/


#include <iostream>
#define MAX 10
using namespace std;

int i, n, z = 1, y = 1;

class Student
{
private:
    char name[40];
    int rollno;
    int totalmarks;

public:
    void getDetails()
    {
        cout << "Enter Student " << z << " name: ";
        cin >> name;
        cout << "Enter Student " << z << " roll no.: ";
        cin >> rollno;
        cout << "Enter Student " << z << " total marks: ";
        cin >> totalmarks;
        z++;
        cout << endl
             << endl;
    }

    void putDetails(void);

    void student()
    {
        name[0] = '\0';
        rollno = 0;
        totalmarks = 0;
    }
};

void Student::putDetails(void)
{
    cout << "\n\n------Student " << y << " Details are------\n\n";
    cout << "Name: " << name << endl;
    cout << "Roll Number: " << rollno << endl;
    cout << "Total Mraks: " << totalmarks << endl;
    y++;
}

int main()
{
    Student s[MAX];
    cout << "Enter the total number of students: ";
    cin >> n;
    cout << endl;

    if (n > 10)
    {
        cout << "Maximum number of student details that can be entered is 10." << endl;
    }
    else
    {
        for (i = 1; i <= n; i++)
        {
            s[i].getDetails();
        }

        for (i = 1; i <= n; i++)
        {
            s[i].putDetails();
        }
    }
    return 0;
}