public class thisptrconstructor {  // Class name should start with uppercase (convention)
    static class Employee {  // Made Employee class static
        public String empName;
        public int empSalary;
        public String address;

        public Employee() {
            this("Chaitanya");
        }

        public Employee(String name) {
            this(name, 120035);
        }

        public Employee(String name, int sal) {
            this(name, sal, "Gurgaon");
        }

        public Employee(String name, int sal, String addr) {
            this.empName = name;
            this.empSalary = sal;
            this.address = addr;
        }

        void disp() {
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Salary: " + empSalary);
            System.out.println("Employee Address: " + address);
        }
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Employee obj = new Employee();
        obj.disp();
    }
}
