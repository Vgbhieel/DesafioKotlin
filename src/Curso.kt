class Curso(
        var nome: String,
        val codCurso: Int,
        var qtdMaximaAlunos: Int
) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    val listaAlunosMatriculados: MutableList<Aluno> = mutableListOf()

    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Curso) {
            false
        } else {
            codCurso == other.codCurso
        }
    }

    fun adicionarUmAluno(aluno: Aluno): Boolean {
        return if (listaAlunosMatriculados.size < qtdMaximaAlunos) {
            listaAlunosMatriculados.add(aluno)
            true
        } else {
            false
        }
    }

    fun excluirAluno(aluno: Aluno) : Boolean {
        return if (listaAlunosMatriculados.contains(aluno)) {
            listaAlunosMatriculados.remove(aluno)
            true
        } else {
            false
        }
    }
}