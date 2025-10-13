package org.patients;
import java.util.Scanner;

/**
 * Клас, що містить функції для взаємодії з класом пацієнтів. Розташований в PatientFunctions.java
 *  <p>Виконує такі функції:
 *  <ul>
 *  <li>Пошук за діагнозом;</li>
 *  <li>Пошук за номером медичної картки;</li>
 *  <li>Пошук за початковими цифрами номера телефона;</li>
 *  <li>Виведення інформації про всіх пацієнтів на екран.</li>
 *  </ul>
 */
public class PatientFunctions {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Функція пошуку пацієнтів за діагнозом.
     * @param patientArray масив класу пацієнтів
     */
    public static void searchByDiagnosis(Patient[] patientArray) {
        boolean isFound = false;
        System.out.print("Введіть діагноз: ");
        String diagnosis = scanner.next();

        System.out.println(".................................");

        for (int i = 0; i < patientArray.length; i++) {
            Patient patient = patientArray[i];
            if (patient.getID() != -1 && patient.getDiagnosis().toLowerCase().contains(diagnosis.toLowerCase())) {
                System.out.println(patient);
                isFound = true;
                System.out.println(".................................");
            }
        }

        if (!isFound) {
            System.out.println("Таких пацієнтів не існує!");
            System.out.println("------------------------------------------------------------------");
        }
    }

    /**
     * Функція пошуку пацієнтів за номером медичної картки
     * @param patientArray масив класу пацієнтів
     */
    public static void searchByMedicalNumberRange(Patient[] patientArray) {
        boolean isFound = false;
        System.out.print("Введіть початок інтервалу медичних карток: ");
        int start = scanner.nextInt();
        System.out.print("Введіть кінець інтервалу медичних карток: ");
        int end = scanner.nextInt();

        System.out.println(".................................");

        for (int i = 0; i < patientArray.length; i++) {
            Patient patient = patientArray[i];
            if (patient.getMedicalRecordNumber() >= start && patient.getMedicalRecordNumber() <= end) {
                System.out.println(patient);
                isFound = true;
                System.out.println(".................................");
            }
        }

        if (!isFound) {
            System.out.println("Таких пацієнтів не існує!");
            System.out.println("------------------------------------------------------------------");
        }
    }

    /**
     * Функція пошуку пацієнтів за початковими цифрами номера телефона
     * @param patientArray масив класу пацієнтів
     */
    public static void searchByPhoneNumber(Patient[] patientArray) {
        boolean isFound = false;
        int count = 0;

        System.out.print("Введіть перші цифри номера телефона: ");
        String prefix = scanner.next();

        System.out.println(".................................");

        for (int i = 0; i < patientArray.length; i++) {
            Patient patient = patientArray[i];
            if (patient.getID() != -1 && patient.getPhoneNumber().startsWith(prefix)) {
                System.out.println(patient);
                isFound = true;
                count++;
                System.out.println(".................................");
            }
        }

        if (!isFound) {
            System.out.println("Таких пацієнтів не існує!");
        } else {
            System.out.println("Кількість пацієнтів з номером, який починається на '" + prefix + "': " + count);
            System.out.println("------------------------------------------------------------------");
        }
    }

    /**
     * Функція виведення інформації про всіх пацієнтів на екран
     * @param patientArray масив класу пацієнтів
     */
    public static void showAllPatients(Patient[] patientArray) {
        boolean isFound = false;
        for (int i = 0; i < patientArray.length; i++) {
            Patient patient = patientArray[i];
            if (patient.getID() != -1) {
                System.out.println(patient);
                isFound = true;
                System.out.println(".................................");
            }
        }
        if (!isFound) {
            System.out.println("Не записано ні одного пацієнта!");
            System.out.println("------------------------------------------------------------------");
        }
    }
}