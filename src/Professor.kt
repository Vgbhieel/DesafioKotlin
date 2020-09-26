abstract class Professor(
        val nome: String,
        var sobrenome: String,
        var tempoDeCasa: Int,
        val codProfessor: Int
) {

    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Professor) {
            false
        } else {
            codProfessor == other.codProfessor
        }
    }
}