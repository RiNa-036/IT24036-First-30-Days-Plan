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
