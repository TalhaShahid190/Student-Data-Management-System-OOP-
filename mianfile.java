package project1;

public class mianfile {
    public static void main(String[] args) {
        student1 s1 =new student1();
        s1.student1("Talha", 19, 190, 94);
        s1.info();
        student1 s2 = new sciencestudent();
        s2.student1("Abdullah", 19, 271, 95);
        s2.info();
        student1 s3 =new student1();
        s3.student1("Hamza", 19, 270, 94);
        s3.info();
        student1 s4 = new sciencestudent();
        s4.student1("Daniyal", 19, 272, 95);
        s4.info();

    }
}