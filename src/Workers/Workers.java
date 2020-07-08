package Workers;

public class Workers {

    private String name;
    private double salary;
    private int age;
    private String gender;

    public Workers (String name, double salary, int age, String gender){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    /*public GenderType getGender(){
        return gender;
    }*/

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
