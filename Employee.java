//parameterized constructor
public class Employee {
    int empid;
    String empName;

    Employee(int id, String name) {
        this.empid = id;
        this.empName = name;
    }

    void info() {
        System.out.println("id: " + empid + " Name: " + empName);
    }

    public static void main(String args[]) {
        Employee obj1 = new Employee(112233, "Chirag");
        Employee obj2 = new Employee(992244, "Narendra");
        obj1.info();
        obj2.info();
    }
}
