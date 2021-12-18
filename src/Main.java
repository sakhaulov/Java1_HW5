public class Main {
    public static void main(String[] args) {
        Employee[] empArray = getEmployeeArray();
        printEmployeeInfo(empArray);
    }

    public static Employee[] getEmployeeArray() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30);
        empArray[1] = new Employee("John Smith", "Ceo", "js@mailbox.com", "892312313", 45);
        empArray[2] = new Employee("Jane Doe", "QA", "jd@mailbox.com", "892312314", 25);
        empArray[3] = new Employee("Cecil Cash", "Project Manager", "cm@mailbox.com", "892312315", 42);
        empArray[4] = new Employee("Mark Milton", "DevOps", "mm@mailbox.com", "892312316", 29);
        return empArray;
    }

    public static void printEmployeeInfo(Employee[] empArray) {
        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee.getInfo());
            }
        }
    }

}
