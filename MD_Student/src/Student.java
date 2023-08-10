public class Student {
    private String student = "Long";
    private String classes = "C06";

    public Student() {}

    protected void setStudent(String student) {
        this.student = student;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    public String getStudent() {
        return student;
    }

    public String getClasses() {
        return classes;
    }

    public Student(String student, String classes) {
        this.student = student;
        this.classes = classes;
    }

    void display() {
        System.out.println("Học Sinh: " + student + " Lớp: " + classes);
    }

}
