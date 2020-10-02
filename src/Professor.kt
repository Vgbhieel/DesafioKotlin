abstract class Professor(
        val nome: String,
        var sobrenome: String,
        val codProfessor: Int
) {
    var tempoDeCasa = 0

    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Professor) {
            false
        } else {
            codProfessor == other.codProfessor
        }
    }
}