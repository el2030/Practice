package CollectionFramework;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames();
        student.setNames();
        //student.printNames();
        //student.searchName("one");
        //student.searchName(1);
        student.removeName("one");
        student.printNames();

    }
}
