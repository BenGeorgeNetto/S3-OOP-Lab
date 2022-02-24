class Employee {
    String name, address;
    int age;
    long phone;
    float salary;

    Employee(String name, String address, int age, long phone, float salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }

    void print() {
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("Age = " + age);
        System.out.println("Phone = " + phone);
    }

    void printSalary() {
        System.out.println("Salary = " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, String address, int age, long phone, float salary, String specialization) {
        super(name, address, age, phone, salary);
        this.specialization = specialization;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Specialization = " + specialization);
        printSalary();
        System.out.println();
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String address, int age, long phone, float salary, String department) {
        super(name, address, age, phone, salary);
        this.department = department;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Department = " + department);
        printSalary();
        System.out.println();
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Officer o = new Officer("Peter Parker",
                "Parker Residence, Queens",
                21,
                9048716844L,
                125000f,
                "Biophysics");
        Manager m = new Manager("Tony Stark",
                "Stark Tower, Manhattan",
                51,
                8606140658L,
                750000f,
                "Engineering");

        o.print();
        m.print();
    }
}