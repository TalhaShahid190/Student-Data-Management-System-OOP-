package project1;

class student1 {
    private String name;
    private int age;
    private int rolno;
    private int marks;

    public void student1(String n, int a, int r, int m) {
        name = n;
        age = a;
        rolno = r;
        marks = m;
    }

    public void info() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rolno);
        System.out.println("Marks: " + marks);
        System.out.println("age: " + age);
    }
}

class sciencestudent extends student1 {
    sciencestudent() {
        System.out.println("\nStream: Science");
    }
}