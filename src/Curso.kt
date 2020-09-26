class Curso(
        var nome: String,
        val codCurso: Int,
        var professorTitular: ProfessorTitular,
        var professorAdjunto: ProfessorAdjunto,
        var qtdMaximaAlunos: Int,
        val listaAlunosMatriculados: MutableList<Aluno>
) {

    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Curso) {
            false
        } else {
            codCurso == other.codCurso
        }
    }
}