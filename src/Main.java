import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivanovich";
        String lastName = "Ivan";
        String fullName = firstName + " " + lastName + " " + middleName;

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