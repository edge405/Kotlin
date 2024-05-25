### Problem: Clinic Patient Management System

You need to create a clinic patient management system that allows patients to book appointments with doctors, manage doctor details, and handle patient records. The system should provide functionalities for managing doctors, patients, appointments, and viewing appointment details.

#### Requirements:

1. **Doctor Data Class**:
    - **Attributes**:
        - `doctorId: String`
        - `name: String`
        - `specialization: String`
        - `appointments: MutableList<Appointment>`
    - No methods required.

2. **Patient Data Class**:
    - **Attributes**:
        - `patientId: String`
        - `name: String`
    - No methods required.

3. **Appointment Data Class**:
    - **Attributes**:
        - `appointmentId: String`
        - `patient: Patient`
        - `doctor: Doctor`
        - `appointmentDate: String`
    - No methods required.

4. **ClinicManager Class**:
    - **Attributes**:
        - `doctors: MutableList<Doctor>`
        - `patients: MutableList<Patient>`
    - **Methods**:
        - `addDoctor(doctor: Doctor)`: Add a new doctor.
        - `registerPatient(patient: Patient)`: Register a new patient.
        - `bookAppointment(appointment: Appointment)`: Book an appointment for a patient with a doctor.
        - `getDoctorDetails(doctorId: String): Doctor?`: Retrieve doctor details.
        - `viewAllDoctors(): List<Doctor>`: View all doctors.
        - `getPatientDetails(patientId: String): Patient?`: Retrieve patient details.
        - `viewAllPatients(): List<Patient>`: View all patients.
        - `viewAppointmentsForDoctor(doctorId: String): List<Appointment>`: View all appointments for a specific doctor.

### Example Usage:
```kotlin
fun main() {
    val clinicManager = ClinicManager()

    // Add doctors
    val doctor1 = Doctor("d001", "Dr. Smith", "Cardiology")
    val doctor2 = Doctor("d002", "Dr. Jones", "Dermatology")

    clinicManager.addDoctor(doctor1)
    clinicManager.addDoctor(doctor2)

    // Register patients
    val patient1 = Patient("p001", "Alice")
    val patient2 = Patient("p002", "Bob")

    clinicManager.registerPatient(patient1)
    clinicManager.registerPatient(patient2)

    // Book appointments
    val appointment1 = Appointment("a001", patient1, doctor1, "2024-06-15")
    val appointment2 = Appointment("a002", patient2, doctor2, "2024-07-20")

    clinicManager.bookAppointment(appointment1)
    clinicManager.bookAppointment(appointment2)

    // View doctor details
    val doctorDetails1 = clinicManager.getDoctorDetails("d001")
    println("Doctor Details for d001: $doctorDetails1")

    val doctorDetails2 = clinicManager.getDoctorDetails("d002")
    println("Doctor Details for d002: $doctorDetails2")

    // View all doctors
    val doctors = clinicManager.viewAllDoctors()
    println("All Doctors: $doctors")

    // View patient details
    val patientDetails1 = clinicManager.getPatientDetails("p001")
    println("Patient Details for p001: $patientDetails1")

    val patientDetails2 = clinicManager.getPatientDetails("p002")
    println("Patient Details for p002: $patientDetails2")

    // View all patients
    val patients = clinicManager.viewAllPatients()
    println("All Patients: $patients")

    // View appointments for a doctor
    val appointmentsForDoctor1 = clinicManager.viewAppointmentsForDoctor("d001")
    println("Appointments for Doctor d001: $appointmentsForDoctor1")
}
```
This problem will help you practice managing collections of data and implementing basic CRUD operations in Kotlin.
###
Yo! tbh this problem is hard when I always run the main method it always gives me this error : "Exception in thread "main" java.lang.StackOverflowError" it's so fucking frustrating! I just found out that the object in Appointment data class "Patient and Doctor" are the reason why I have a bug to my code. So I just make them as a String not an Object, after rerun the main method a lot of fucking errors fades out and it runs smoothly. Phew
![img.png](img.png)
