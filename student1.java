package project1;

class Student1 {
    private String name;
    private int age;
    private int rolno;
    private int marks;

    Student1(String n, int a, int r, int m) {
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

class ScienceStudent extends Student1 {
    public void ScienceStudent() {
        System.out.println("\nStream: Science");
    }

}
