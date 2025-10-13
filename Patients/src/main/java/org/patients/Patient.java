package org.patients;

/**
 * Клас пацієнта, що розташований в Patient.java
 * <p>Виконує такі функції:
 *  <ul>
 *  <li>Ініціалізація пацієнту;</li>
 *  <li>Виведення інформації про пацієнта на екран;</li>
 *  <li>Введення даних про пацієнта.</li>
 *  </ul>
 */
public class Patient {
    /**
     * ID пацієнта
     */
    private int id = -1;
    /**
     * Номер медичної картки пацієнта
     */
    private int medicalRecordNumber = -1;
    /**
     * Ім'я пацієнта
     */
    private String firstName = null;
    /**
     * По батькові пацієнта
     */
    private String middleName = null;
    /**
     * Прізвище пацієнта
     */
    private String lastName = null;
    /**
     * Домашня адреса пацієнта
     */
    private String address = null;
    /**
     * Номер телефону пацієнта
     */
    private String phoneNumber = null;
    /**
     * Діагноз пацієнта
     */
    private String diagnosis = null;

    /**
     * Варіант порожнього конструктора
     */
    Patient() {
    }

    /**
     * Варіант конструктора з параметрами
     * @param id пацієнта
     * @param firstName ім'я пацієнта
     * @param middleName по батькові пацієнта
     * @param lastName прізвище пацієнта
     * @param address адреса пацієнта
     * @param phoneNumber номер телефону пацієнта
     * @param medicalRecordNumber номер медичної картки пацієнта
     * @param diagnosis діагноз пацієнта
     */
    Patient(int id, String firstName, String middleName, String lastName,
            String address, String phoneNumber, int medicalRecordNumber, String diagnosis) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalRecordNumber = medicalRecordNumber;
        this.diagnosis = diagnosis;
    }

    /**
     * Запис ID
     * @param id пацієнта
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Запис імені
     * @param firstName ім'я пацієнта
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Запис по батькові
     * @param middleName по батькові пацієнта
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Запис прізвища
     * @param lastName прізвище пацієнта
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Запис домашньої адреси
     * @param address адреса пацієнта
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Запис номера телефона
     * @param phoneNumber номер телефону пацієнта
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Запис номера медичної картки
     * @param medicalRecordNumber номер медичної картки пацієнта
     */
    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    /**
     * Запис діагнозу
     * @param diagnosis діагноз пацієнта
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Отримання ID
     * @return ID пацієнта
     */
    public int getID() {
        return id;
    }

    /**
     * Отримання імені
     * @return ім'я пацієнта
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Отримання по батькові
     * @return по батькові пацієнта
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Отримання прізвища
     * @return прізвище пацієнта
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Отримання адреси
     * @return адреса пацієнта
     */
    public String getAddress() {
        return address;
    }

    /**
     * Отримання номера телефона
     * @return номер телефона пацієнта
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Отримання номера медичної картки
     * @return номер медичної картки пацієнта
     */
    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    /**
     * Отримання діагнозу
     * @return діагноз пацієнта
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Отримання інформації про пацієнта у вигляді рядка
     */
    @Override
    public String toString() {
        return ("ID: " + this.id + "\nПІБ: " + this.firstName + " " + this.middleName  + " " + this.lastName +
                "\nНомер медичної картки: " + this.medicalRecordNumber + "\nДіагноз: " + this.diagnosis + "\nАдреса: " +
                this.address + "\nНомер телефону: " + this.phoneNumber);
    }
}
