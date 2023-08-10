public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "Hùng");
        Student s2 = new Student(2,"Kiên");
        Student s3 = new Student(3, "Dương");

        s1.display();
        s2.display();
        s3.display();
    }
}