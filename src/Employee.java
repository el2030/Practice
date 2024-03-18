import java.util.Scanner;

public class Employee {
    private String name;
    private int id;
    private int age;
    private static int employeeCount;
    private static Employee[] employeeData = new Employee[99];

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        setEmployeeData(this, id);
    }

    public static void setEmployeeData(Employee employee, int id) {
        employeeData[id] = employee;
    }

    public static void increaseEmployeeCount() {
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void updateEmployee(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the new name of the employee or press enter to skip");
        String update = sc.nextLine();
        if (update.isEmpty()){
        } else {employeeData[id].setName(update);}
        System.out.println("Please update the age or press enter to skip ");
        int age = sc.nextInt();
        if (update.isEmpty()){
        } else {employeeData[id].setAge(age);}
    }

    public void showEmployee(){
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's id: " + id);
        System.out.println("Employee's age: " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
