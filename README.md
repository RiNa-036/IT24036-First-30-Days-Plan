# IT24036-First-30-Days-Plan

Date : 20/4/2026
Day : 1
Topic : CLASS & OBJECT
Video Link : https://youtu.be/lWFzm8qIR1c?feature=shared

Creating a class :-
Example 1 :
Public class Car{
 //Attributes of the Car class
 String color;
 String model;
 int year;
 // Method to display car information
 Void displayInfo(){
  System.out.println("Car Model: " + model);
  System.out.println("Car Color: " + color);
  System.out.println("Car Year: " + year);
 }
}

Example 2 : 
class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name  = name;
        this.age   = age;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println("Name:  " + name);
        System.out.println("Age:   " + age);
        System.out.println("Grade: " + grade);
    }
}

Creating an object :-
Example 1 :
public class Main {
 public static void main(String[] args){
  //Creating an object of the Car class
  Car myCar = new Car();
  //Assigning values to the object's attributes
  myCar.color = "Red";
  myCar.model = "Toyota";
  myCar.year = 2020;
  // Calling the displayInfo method
  myCar.displayInfo();
 }
}

Example 2 :
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rina", 21, 3.8);
        Student s2 = new Student("Shorna",   21, 3.9);

        s1.displayInfo();
        System.out.println("---");
        s2.displayInfo();
    }
}
