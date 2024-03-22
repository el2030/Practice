package HashMapExamples;

public class TestStudentHashMap {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames();
        student.setNames();
        student.printNames();
        student.printSize();
        student.remove("one");
        student.printNamesKeySet();
    }
}
