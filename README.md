# IT24036-First-30-Days-Plan

Date : 20/4/2026
Day : 1
Topic : CLASS & OBJECT
Video Link : https://youtu.be/lWFzm8qIR1c?feature=shared

Example 1 :
Creating a class :-
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
Creating an object :-
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
