package Zadanie5;

public class Employee {

    private String FIO;
    private String jobTitle;
    private String mail;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String FIO, String jobTitle, String mail, String telephone, int salary, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.mail = mail;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("[" + FIO + ", " + jobTitle + ", " + mail + ", " + telephone + ", " + salary + ", " + age + "]" );
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
