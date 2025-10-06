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

            Patient[] patient = new Patient[1000];
            int patientID, patientMedicalRecordNumber;
            String patientFirstName, patientMiddleName, patientLastName, patientAddress, patientPhone, patientDiagnosis;
            boolean isFound;

            for (int i = 0; i < 1000; i++) {
                patient[i] = new Patient();
            }

            while(true) {
                System.out.print("1 - Записати пацієнта" +
                        "\n2 - Видалити пацієнта" +
                        "\n3 - Змінити дані про пацієнта" +
                        "\n4 - Прочитати інформацію про пацієнта" +
                        "\n5 - Пошук пацієнтів за діагнозом" +
                        "\n6 - Пошук пацієнтів за інтервалом номеру медичної картки" +
                        "\n7 - Пошук пацієнтів за першими цифрами номера телефону" +
                        "\n8 - Перегляд всіх пацієнтів" +
                        "\n0 - Вихід" +
                        "\nОберіть: ");
                int var = scanner.nextInt();

                System.out.println("------------------------------------------------------------------");

                switch (var) {
                    case 1:
                        System.out.print("Введіть ID: ");
                        patientID = scanner.nextInt();
                        if (patientID >= 0) {
                            if (patient[patientID].getFirstName() != null) {
                                System.out.println("Пацієнт з таким ID вже існує!");
                            }
                            else {
                                System.out.print("Введіть ім'я: ");
                                patientFirstName = scanner.next();
                                System.out.print("Введіть по батькові: ");
                                patientMiddleName = scanner.next();
                                System.out.print("Введіть прізвище: ");
                                patientLastName = scanner.next();
                                System.out.print("Введіть діагноз: ");
                                patientDiagnosis= scanner.next();
                                System.out.print("Введіть номер медичної картки: ");
                                patientMedicalRecordNumber = scanner.nextInt();
                                System.out.print("Введіть адресу: ");
                                patientAddress = scanner.next();
                                System.out.print("Введіть номер телефону: ");
                                patientPhone = scanner.next();
                                patient[patientID].setValue(patientID, patientFirstName, patientMiddleName,
                                        patientLastName, patientAddress, patientPhone, patientMedicalRecordNumber, patientDiagnosis);
                            }
                        }
                        else {
                            System.out.println("ID повинно бути більше за -1!");
                        }
                        System.out.println("------------------------------------------------------------------");
                        break;
                    case 2:
                        System.out.print("Введіть ID пацієнта: ");
                        patientID = scanner.nextInt();
                        if (patientID >= 0) {
                            if (patient[patientID].getID() == -1) {
                                System.out.println("Такого пацієнту немає!");
                            }
                            else {
                                patient[patientID].setValue(-1, null, null, null,
                                        null, null, -1, null);
                                System.out.println("Пацієнта видалено!");
                            }
                        }
                        else {
                            System.out.println("ID повинно бути більше за -1!");
                        }
                        System.out.println("------------------------------------------------------------------");
                        break;
                    case 3:
                        System.out.print("Введіть ID пацієнта: ");
                        patientID = scanner.nextInt();

                        if (patientID >= 0) {
                            if (patient[patientID].getFirstName() != null) {
                                editLoop:
                                while (true) {
                                    System.out.print("1 - Ім'я" +
                                            "\n2 - По батькові" +
                                            "\n3 - Прізвище" +
                                            "\n4 - Адреса" +
                                            "\n5 - Номер телефону" +
                                            "\n6 - Номер медичної картки" +
                                            "\n7 - Діагноз" +
                                            "\n0 - Назад" +
                                            "\nОберіть: ");
                                    int editVar = scanner.nextInt();

                                    System.out.println(".................................");

                                    switch (editVar) {
                                        case 1:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setFirstName(scanner.next());
                                            System.out.println(".................................");
                                            break;
                                        case 2:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setMiddleName(scanner.next());
                                            System.out.println(".................................");
                                            break;
                                        case 3:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setLastName(scanner.next());
                                            System.out.println(".................................");
                                            break;
                                        case 4:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setAddress(scanner.next());
                                            System.out.println(".................................");
                                            break;
                                        case 5:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setPhone(scanner.next());
                                            System.out.println(".................................");
                                            break;
                                        case 6:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setMedicalRecordNumber(scanner.nextInt());
                                            System.out.println(".................................");
                                            break;
                                        case 7:
                                            System.out.print("Введіть: ");
                                            patient[patientID].setDiagnosis(scanner.next());
                                            System.out.println(".................................");
                                            break;
                                        case 0:
                                            break editLoop;
                                        default:
                                            System.out.println("Такого варіанту немає!" +
                                                    "\n.................................");
                                            break;
                                    }
                                }
                            }
                            else {
                                System.out.println("Такого пацієнту не існує!" +
                                        "------------------------------------------------------------------");
                            }
                        }
                        else {
                            System.out.println("ID повинно бути більше за -1!" +
                                    "------------------------------------------------------------------");
                        }
                        break;
                    case 4:
                        System.out.print("Введіть ID пацієнта: ");
                        patientID = scanner.nextInt();

                        if (patientID >= 0) {
                            if (patient[patientID].getFirstName() != null) {
                                lookUpLoop:
                                while (true) {
                                    System.out.print("1 - ПІБ" +
                                            "\n2 - Адреса та номер телефону" +
                                            "\n3 - Номер медичної картки та діагноз" +
                                            "\n4 - Повна інформація" +
                                            "\n0 - Назад" +
                                            "\nОберіть: ");
                                    int lookUpVar = scanner.nextInt();

                                    System.out.println(".................................");

                                    switch (lookUpVar) {
                                        case 1:
                                            System.out.print("ПІБ: ");
                                            patient[patientID].getFirstNameToString();
                                            System.out.print(" ");
                                            patient[patientID].getMiddleNameToString();
                                            System.out.print(" ");
                                            patient[patientID].getLastNameToString();
                                            System.out.println("\n.................................");
                                            break;
                                        case 2:
                                            System.out.print("Адреса: ");
                                            patient[patientID].getAddressToString();
                                            System.out.print("\nНомер телефону: ");
                                            patient[patientID].getPhoneToString();
                                            System.out.println("\n.................................");
                                            break;
                                        case 3:
                                            System.out.print("Номер медичної картки: ");
                                            patient[patientID].getMedicalRecordNumberToString();
                                            System.out.print("\nДіагноз: ");
                                            patient[patientID].getDiagnosisToString();
                                            System.out.println("\n.................................");
                                            break;
                                        case 4:
                                            patient[patientID].getToString();
                                            System.out.println(".................................");
                                            break;
                                        case 0:
                                            break lookUpLoop;
                                        default:
                                            System.out.println("Такого варіанту немає!" +
                                                    "\n.................................");
                                            break;
                                    }
                                }
                            }
                            else {
                                System.out.println("Такого пацієнту не існує!" +
                                        "------------------------------------------------------------------");
                            }
                        }
                        else {
                            System.out.println("ID повинно бути більше за -1!" +
                                    "------------------------------------------------------------------");
                        }
                        break;
                    case 5:
                        isFound = false;

                        System.out.print("Введіть діагноз: ");
                        patientDiagnosis = scanner.next();

                        System.out.println(".................................");

                        for (int i = 0; i < patient.length; i++) {
                            if (patient[i].getID() != -1) {
                                if (patient[i].getDiagnosis().toLowerCase().contains(patientDiagnosis)) {
                                    patient[i].getToString();
                                    isFound = true;
                                    System.out.println(".................................");
                                }
                            }
                        }
                        if (!isFound) {
                            System.out.println("Таких пацієнтів не існує!" +
                                    "\n------------------------------------------------------------------");
                        }
                        break;
                    case 6:
                        isFound = false;

                        System.out.print("Введіть початок інтервалу медичних карток: ");
                        int medicalNumberStart = scanner.nextInt();

                        System.out.print("Введіть кінець інтервалу медичних карток: ");
                        int medicalNumberEnd = scanner.nextInt();

                        System.out.println(".................................");

                        for (int i = 0; i < patient.length; i++) {
                            if (patient[i].getMedicalRecordNumber() <= medicalNumberEnd &&
                                    patient[i].getMedicalRecordNumber() >= medicalNumberStart) {
                                patient[i].getToString();
                                isFound = true;
                                System.out.println(".................................");
                            }
                        }
                        if (!isFound) {
                            System.out.println("Таких пацієнтів не існує!" +
                                    "\n------------------------------------------------------------------");
                        }
                        break;
                    case 7:
                        int count = 0;

                        isFound = false;

                        System.out.print("Введіть перші цифри номеру телефону: ");
                        patientPhone = scanner.next();

                        System.out.println(".................................");

                        for (int i = 0; i < patient.length; i++) {
                            if (patient[i].getID() != -1) {
                                if (patient[i].getPhone().startsWith(patientPhone)) {
                                    patient[i].getToString();
                                    count++;
                                    isFound = true;
                                    System.out.println(".................................");
                                }
                            }
                        }
                        if (!isFound) {
                            System.out.println("Таких пацієнтів не існує!" +
                                    "\n.................................");
                        }
                        else {
                            System.out.println("Кількість пацієнтів з номером який починається на '" + patientPhone + "': " + count +
                                    "\n------------------------------------------------------------------");
                        }
                        break;
                    case 8:
                        isFound = false;

                        for (int i = 0; i < patient.length; i++) {
                            if (patient[i].getID() != -1) {
                                patient[i].getToString();
                                isFound = true;
                                System.out.println(".................................");
                            }
                        }
                        if (!isFound) {
                            System.out.println("Не записано ні одного пацієнта!" +
                                    "\n------------------------------------------------------------------");
                        }
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