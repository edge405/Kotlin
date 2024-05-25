package Day11.Problem2

data class Doctor(
    val doctorId: String,
    val name: String,
    val specialization: String,
    val appointments: MutableList<Appointment> = mutableListOf()
)