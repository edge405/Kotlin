package Day11.Problem2

class ClinicManager {
    private val doctors = mutableListOf<Doctor>()
    private val patients = mutableListOf<Patient>()
    private val appointments = mutableListOf<Appointment>()

    fun addDoctor(doctor: Doctor): Boolean {
        return if (doctors.any { it.doctorId == doctor.doctorId }) {
            println("Doctor with ID ${doctor.doctorId} already exists.")
            false
        } else {
            doctors.add(doctor)
            true
        }
    }

    fun registerPatient(patient: Patient): Boolean {
        return if (patients.any { it.patientId == patient.patientId }) {
            println("Patient with ID ${patient.patientId} already exists.")
            false
        } else {
            patients.add(patient)
            true
        }
    }

    fun bookAppointment(appointment: Appointment): Boolean {
        val doctor = doctors.find { it.doctorId == appointment.doctorId }
        val patient = patients.find { it.patientId == appointment.patientId }

        return if (doctor != null && patient != null) {
            appointments.add(appointment)
            doctor.appointments.add(appointment)
            true
        } else {
            println("Booking failed: Doctor or patient not found.")
            false
        }
    }

    fun getDoctorDetails(doctorId: String): Doctor? {
        return doctors.find { it.doctorId == doctorId }
    }

    fun viewAllDoctors(): List<Doctor> {
        return doctors
    }

    fun getPatientDetails(patientId: String): Patient? {
        return patients.find { it.patientId == patientId }
    }

    fun viewAllPatients(): List<Patient> {
        return patients
    }

    fun viewAppointmentsForDoctor(doctorId: String): List<Appointment> {
        return appointments.filter { it.doctorId == doctorId }
    }
}