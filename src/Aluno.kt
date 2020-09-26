class Aluno(
        val nome: String,
        val sobrenome: String,
        val codAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Aluno) {
            false
        } else {
            codAluno == other.codAluno
        }
    }
}