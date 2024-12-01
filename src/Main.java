import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Ф.И.О. Сотрудника - " + fullName);
        System.out.println();

        System.out.println("Задача 2");

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName);
        System.out.println();

        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','е');
        System.out.println(fullName);
    }
}