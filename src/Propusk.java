import java.util.*;

public class Propusk {
    public static void main(String[] args) {
        ArrayList<Pass> register = new ArrayList<>();

        // Наполнение массива пропусками
        register.add(new TeacherPass("Хазова Ксения Сергеевна", "Физика", "Кафедра Механики"));
        register.add(new TeacherPass("Алексей Олег Мисин", "Математика", "Кафедра Геометрии"));
        register.add(new StudentPass("Кузнецов Максим Юрьевич", "Математика", 2022));
        register.add(new StudentPass("Кочетков Никита Алексеевич", "Физика", 2021));

        // Вывод информации о всех пропусках
        System.out.println("Всe пропуска:");
        for (Pass pass : register) {
            pass.displayInfo();
        }

        // Вывод информации о пропусках студентов
        System.out.println("\nПропуска студентов:");
        for (Pass pass : register) {
            if (pass instanceof StudentPass) {
                pass.displayInfo();
            }
        }

        // Вывод информации о пропусках учителей
        System.out.println("\nПропуска учителей:");
        for (Pass pass : register) {
            if (pass instanceof TeacherPass) {
                pass.displayInfo();
            }
        }

        // Определение количества аннулируемых пропусков
        int expiringPasses = 0;
        for (Pass pass : register) {
            if (pass instanceof StudentPass) {
                expiringPasses++;
            }
        }

        System.out.println("\nКоличество пропусков, которые должны быть аннулированы: " + expiringPasses);
    }
}