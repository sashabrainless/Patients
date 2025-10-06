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
    private String phone = null;
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
     * @param pID ID пацієнта
     * @param pFirstName ім'я пацієнта
     * @param pMiddleName по батькові пацієнта
     * @param pLastName прізвище пацієнта
     * @param pAddress адреса пацієнта
     * @param pPhone номер телефону пацієнта
     * @param pMedicalRecordNumber номер медичної картки пацієнта
     * @param pDiagnosis діагноз пацієнта
     */
    Patient(int pID, String pFirstName, String pMiddleName, String pLastName,
                         String pAddress, String pPhone, int pMedicalRecordNumber, String pDiagnosis) {
        this.id = pID;
        this.firstName = pFirstName;
        this.middleName = pMiddleName;
        this.lastName = pLastName;
        this.address = pAddress;
        this.phone = pPhone;
        this.medicalRecordNumber = pMedicalRecordNumber;
        this.diagnosis = pDiagnosis;
    }

    /**
     * Варіант конструктора з параметрами
     * @param pID ID пацієнта
     * @param pFirstName ім'я пацієнта
     * @param pMiddleName по батькові пацієнта
     * @param pLastName прізвище пацієнта
     * @param pAddress адреса пацієнта
     * @param pPhone номер телефону пацієнта
     * @param pMedicalRecordNumber номер медичної картки пацієнта
     * @param pDiagnosis діагноз пацієнта
     */
    public void setValue(int pID, String pFirstName, String pMiddleName, String pLastName,
                         String pAddress, String pPhone, int pMedicalRecordNumber, String pDiagnosis) {
        id = pID;
        firstName = pFirstName;
        middleName = pMiddleName;
        lastName = pLastName;
        address = pAddress;
        phone = pPhone;
        medicalRecordNumber = pMedicalRecordNumber;
        diagnosis = pDiagnosis;
    }

    /**
     * Запис ID
     * @param pID ID пацієнта
     */
    public void setID(int pID) {
        this.id = pID;
    }

    /**
     * Запис імені
     * @param pFirstName ім'я пацієнта
     */
    public void setFirstName(String pFirstName) {
        this.firstName = pFirstName;
    }

    /**
     * Запис по батькові
     * @param pMiddleName по батькові пацієнта
     */
    public void setMiddleName(String pMiddleName) {
        this.middleName = pMiddleName;
    }

    /**
     * Запис прізвища
     * @param pLastName прізвище пацієнта
     */
    public void setLastName(String pLastName) {
        this.lastName = pLastName;
    }

    /**
     * Запис адреси
     * @param pAddress адреса пацієнта
     */
    public void setAddress(String pAddress) {
        this.address = pAddress;
    }

    /**
     * Запис номера телефона
     * @param pPhone номер телефона пацієнта
     */
    public void setPhone(String pPhone) {
        this.phone = pPhone;
    }

    /**
     * Запис номера медичної картки
     * @param pMedicalRecordNumber номер медичної картки пацієнта
     */
    public void setMedicalRecordNumber(int pMedicalRecordNumber) {
        this.medicalRecordNumber = pMedicalRecordNumber;
    }

    /**
     * Запис діагнозу
     * @param pDiagnosis діагноз пацієнта
     */
    public void setDiagnosis(String pDiagnosis) {
        this.diagnosis = pDiagnosis;
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
    public String getPhone() {
        return phone;
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
     * Виведення інформації про пацієнта у вигляді рядка
     */
    public void getToString() {
        System.out.println("ID: " + id + "\nПІБ: " + firstName + " " + middleName
                + " " + lastName + "\nНомер медичної картки: " + medicalRecordNumber + "\nДіагноз: " + diagnosis + "\nАдреса: " + address + "\nНомер телефону: " + phone);
    }

    /**
     * Виведення ID у вигляді рядка
     */
    public void getIDToString() {
        System.out.print(id);
    }

    /**
     * Виведення імені у вигляді рядка
     */
    public void getFirstNameToString() {
        System.out.print(firstName);
    }

    /**
     * Виведення по батькові у вигляді рядка
     */
    public void getMiddleNameToString() {
        System.out.print(middleName);
    }

    /**
     * Виведення прізвища у вигляді рядка
     */
    public void getLastNameToString() {
        System.out.print(lastName);
    }

    /**
     * Виведення адреси у вигляді рядка
     */
    public void getAddressToString() {
        System.out.print(address);
    }

    /**
     * Виведення номера телефона у вигляді рядка
     */
    public void getPhoneToString() {
        System.out.print(phone);
    }

    /**
     * Виведення номера медичної картки у вигляді рядка
     */
    public void getMedicalRecordNumberToString() {
        System.out.print(medicalRecordNumber);
    }

    /**
     * Виведення діагнозу у вигляді рядка
     */
    public void getDiagnosisToString() {
        System.out.print(diagnosis);
    }
}
