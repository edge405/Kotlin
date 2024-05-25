package Day11.Problem2

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
    val appointment1 = Appointment("a001", patient1.patientId, doctor1.doctorId, "2024-06-15")
    val appointment2 = Appointment("a002", patient2.patientId, doctor2.doctorId, "2024-07-20")

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