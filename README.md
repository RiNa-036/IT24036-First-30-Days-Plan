# IT24036-First-30-Days-Plan

Date : 19/4/2026
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
Date : 20/4/2026
Day : 2
Topic : Encapsulation
Video Link : https://youtu.be/HZUUYnIZO_0?feature=shared
Example 1 :
class Person{
 private String name;
 private int age;
 //Constructor
 public Person(String name , int age){
   this.name = name;
   this.age = age;
 }
 // public method to get the name
 public String getName(){
   return name;
 }
 // public method to set the name
 public void setName(String name){
   this.name = name;
 }

 // public method to get the age
 public int getAge(){
   return age;
 }
 // public method to set the name
 public void setAge(int age){
   if (age >= 0 ){
      this.age = age;
   } else {
      System.out.println("Age cannot be negative.");
   }
  }
 }
public class Main{
 public static void main(String[] args ){
   Person person = new Person("Alice",30);
   System.out.println("Name: "+person.getName());
   System.out.println("Age: "+person.getAge());
   //Modify the properties using setters
   person.setName("Bob");
   person.setAge(25);  
   System.out.println("Updated name: "+person.getName());
   System.out.println("Age: "+person.getAge());
   person.setAge(-5);//this will trigger validation message
 }
}

Example 2 :
class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sky");
        System.out.println(s.getName());
    }
}
Date : 21/4/2026
Day : 3
Topic : Constructor
Video Link :https://youtu.be/acfR5vRTZvc?feature=shared
Example 1 :- 
Default constructor:
class Dog{
 String Name;
 //Default Constructor
 Dog(){
  name = "Unknown";
 }
 void display(){
   System.out.println("Dog's name :"+name);
 }
}
public class Main {
  public static void main(String[] args){
    Dog myDog = new Dog();
    myDog.display();
  }
}

Example 2:-
Parameterized constructor:
class Dog{
 String Name;
 //Parameterized Constructor
 Dog(String dogName){
  name = dogName;
 }
 void display(){
   System.out.println("Dog's name :"+name);
 }
}
public class Main {
  public static void main(String[] args){
    Dog myDog = new Dog("Buddy");
    myDog.display();// Output: Dog's name : Buddy
  }
}

Date : 22/4/2026
Day : 4
Topic : Inheritance
Video Link : https://youtu.be/j_VA2Rp6jM0?feature=shared

Example 1:-
Single inheritance:
 class Animal{//superclass
   String name;
   void eat(){
      System.out.println(name + "is eating.");
   }
//subclass
class Dog extends Animal{
   void bark(){
     System.out.println(name + "says woof!.");
   }
}
public class Main{
  public static void main(String[] args){
    Dog myDog = new Dog();
    myDog.name = "Buddy";//setting the name
    myDog.eat();//
    myDog.bark();
  }
}

Example 2 :-
Multilevel Inheritance :
 class Animal{//superclass
   String name;
   void eat(){
      System.out.println(name + "is eating.");
   }
//subclass
class Dog extends Animal{
   void bark(){
     System.out.println(name + "says woof!.");
   }
}

class Puppy extends Dog{
  void weep(){
    System.out.println(name + "is weeping.");
  }
}
public class Main{
  public static void main(String[] args){
    Dog myDog = new Dog();
    Puppy myPuppy = new Puppy();
    myDog.name = "Buddy";//setting the name
    myDog.eat();//
    myDog.bark();
    myPuppy.bark();
    myPuppy.weep();
  }
}

Date : 26/4/2026
Day : 5
Topic : Polymorphism
Video Link : https://youtu.be/bLke13zY4rg?feature=shared
Example 1  :-
Compile time Polymorphism :
class MathOperations{
   // method to add two integers
   int add(int a,int b){
     return a + b;
   }
   // method to add three integers

    int add(int a,int b,int c){
     return a + b +c;
   }
     // method to add two double values

    double add(double a,double b){
     return a + b;
   }
}

 public class MainMath{
   public static void main(String[] args ){
     MathOperations math = new  MathOperations();
     System.out.println("Sum of 2 and 3 : "+math.add(2,3));
     System.out.println("Sum of 2, 3 and 4 : "+math.add(2,3,4));
     System.out.println("Sum of 2.5 and 3.5 : "+math.add(2.5,3.5));
   }
}

Example 2 :-
Runtime Polymorphism:
class Animal{
  void sound(){
    System.out.println("Animal makes sound.");
  }
}
class Dog extends Animal {
  void sound(){
    System.out.println("Dog barks");
  }
}
class Cat extends Animal {
  void sound(){
    System.out.println("Cat meows");
  }
}
public class Main{
   public static void main(String[] args ){
      Animal myAnimal;
      myAnimal = new Dog();
      myAnimal.sound();
      myAnimal = new Cat();
      myAnimal.sound();
  }
}
Date : 27/4/2026
Day : 6
Topic : Abstract class and Interface
Video Link : https://youtu.be/1SXyi3DK-88?si=0sSQRMuc_nGXvSTe

Date : 28/4/2026
Day : 7
Topic : Inner class
Video Link : https://youtu.be/lsJ9QjJPbx8?si=iMdfsE0sLoVufRtv

Date : 29/4/2026
Day : 8
Topic : Array and Linked list
Video Link : https://youtu.be/q-5D9Z9BCVI?si=5YqmvQJ2OeO1UCqb

 Date : 30/4/2026
Day : 9
Topic : HashSet and TreeSet
Video Link :https://youtu.be/XDw-BkAZYmY?si=N7BmziRjssKC4hFT

Date : 1/5/2026
Day : 10
Topic : Queue Implementation
Video Link : https://youtu.be/PccU1wAdnlM?si=G3ys1yPLe3wa3VC6

Date : 2/5/2026
Day : 11
Topic : HashMap and TreeMap
Video Link : https://youtu.be/ZarOdaT7P2k?si=Pb4T8rsuIu2IyUjP

Date : 3/5/2026
Day : 12
Topic : Collection in real world scenario
Video Link : https://youtu.be/gtmBSl10DvY?si=FBKAqL2pTUgeoxx-
