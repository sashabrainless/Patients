package org.patients;
import java.util.Scanner;

/**
 * Головний клас програми, що розташований в Main.java
 *  <p>Виконує такі функції:
 *  <ul>
 *  <li>Запуск програми;</li>
 *  <li>Викликає функції;</li>
 *  <li>Викликає інші класи.</li>
 *  </ul>
 */
public class Main {
    /**
     * Головна функція програми
     */
    public static void main(String[] args) {
        try {
            System.out.println("Лабораторна робота №2. Робота з класами\n" +
                    "Виконала Жандик О. А. ОІ-11сп, варіант 8\n" +
                    "------------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);

            Patient[] patient = new Patient[3];

            patient[0] = new Patient(0, "Mariia", "Andriivna", "Shevchenko", "Kyiv",
                    "0604563746", 235620, "Flu");
            patient[1] = new Patient(1, "Dmytro", "Mykolaiovych", "Tkachenko", "Cherkasy",
                    "0998771251", 235634, "Flu");
            patient[2] = new Patient();
            patient[2].setID(2);
            patient[2].setFirstName("Yana");
            patient[2].setMiddleName("Viktorivna");
            patient[2].setLastName("Honcharuk");
            patient[2].setAddress("Kyiv");
            patient[2].setPhoneNumber("0997937284");
            patient[2].setMedicalRecordNumber(235124);
            patient[2].setDiagnosis("Cold");

            while(true) {
                System.out.print("1 - Пошук пацієнтів за діагнозом" +
                        "\n2 - Пошук пацієнтів за інтервалом номеру медичної картки" +
                        "\n3 - Пошук пацієнтів за першими цифрами номера телефону" +
                        "\n4 - Перегляд всіх пацієнтів" +
                        "\n0 - Вихід" +
                        "\nОберіть: ");
                int var = scanner.nextInt();

                System.out.println("------------------------------------------------------------------");

                switch (var) {
                    case 1:
                        PatientFunctions.searchByDiagnosis(patient);
                        break;
                    case 2:
                        PatientFunctions.searchByMedicalNumberRange(patient);
                        break;
                    case 3:
                        PatientFunctions.searchByPhoneNumber(patient);
                        break;
                    case 4:
                        PatientFunctions.showAllPatients(patient);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Такого варіанту немає!" +
                                "\n------------------------------------------------------------------");
                        break;
                }
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}