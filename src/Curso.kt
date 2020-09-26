class Curso(
        val nome: String,
        val codCurso: Int
) {
    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Curso) {
            false
        } else {
            codCurso == other.codCurso
        }
    }
}