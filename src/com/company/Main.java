package com.company;

import javax.print.attribute.ResolutionSyntax;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student();

    }
}

class Person
{
    Person()
    {
        System.out.println("Person class Constructor");
    }

    
}

/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {
        // invoke or call parent class constructor


        System.out.println("Student class Constructor");
    }

}
