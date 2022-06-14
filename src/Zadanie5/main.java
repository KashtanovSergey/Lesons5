package Zadanie5;

public class main {
    public static void main(String[] args){
        Employee[] employee = new Employee[5];
        employee[0] = new Employee ("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employee[1] = new Employee ("Петров Пётр Петрович", "Ген.директор", "petrov@mailbox.com", "892312312", 30000, 50);
        employee[2] = new Employee ("Сидоров Иван Петрович", "Зам.ген.директора", "Sidorov@mailbox.com", "892312312", 30000, 45);
        employee[3] = new Employee ("Морозов Олег Максимович", "Начальник тех.поддержки", "Morozov@mailbox.com", "892312312", 30000, 25);
        employee[4] = new Employee ("Каштанов Сергей Владимирович", "Начальник отдела снабжения", "Kashtanov_sv@mail.ru", "892312312", 30000, 31);

        for(int i = 0; i < employee.length; i++){
            if(employee[i].getAge() > 40)
                employee[i].info();
        }
    }
}
