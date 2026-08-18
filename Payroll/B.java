abstract class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double monthlySalary();
}

class FullTime extends Employee {

    double salary;

    FullTime(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double monthlySalary() {
        return salary;
    }
}

class PartTime extends Employee {

    int hours;
    double rate;

    PartTime(String name, int id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    double monthlySalary() {
        return hours * rate;
    }
}

class Intern extends Employee {

    double stipend;

    Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    double monthlySalary() {
        return stipend;
    }
}

public class B {

    public static void main(String[] args) {

        Employee[] employees = {
            new FullTime("Rahul", 101, 50000),
            new PartTime("Riya", 102, 80, 300),
            new Intern("Amit", 103, 10000)
        };

        double total = 0;

        for (int i=0;i<employees.length;i++) {

            double salary = employees[i].monthlySalary();

            System.out.println( employees[i].name + " : " + salary);

            total = total + salary;
        }

        System.out.println("Total Salary = " + total);
    }
}