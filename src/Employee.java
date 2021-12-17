public class Employee {
    private String full_name;
    private String position;
    private String email;
    private String phone_number;
    private int age;

    public Employee(String full_name, String position, String email, String phone_number, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Информация о сотруднике "+this.full_name+"\n"+
                           "Должность: "+this.position+"\n"+
                           "Электронная почта: "+this.email+"\n"+
                           "Номер телефона: "+this.phone_number+"\n"+
                           "Возраст: "+this.age+"\n");
    }

    public int getAge() {
        return age;
    }
}
