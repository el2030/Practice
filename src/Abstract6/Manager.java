package Abstract6;

public class Manager extends Employee {
    @Override
    void job() {
        System.out.println("The job position is a manager");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.job();
    }
}
