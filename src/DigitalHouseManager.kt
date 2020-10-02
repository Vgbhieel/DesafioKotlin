class DigitalHouseManager() {

    val alunos: MutableList<Aluno> = mutableListOf()
    val professores: MutableList<Professor> = mutableListOf()
    val cursos: MutableList<Curso> = mutableListOf()
    val matriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codCurso: Int, qtdMximaAlunos: Int) {
        val novoCurso = Curso(nome = nome, codCurso = codCurso, qtdMaximaAlunos = qtdMximaAlunos)
        cursos.add(novoCurso)
    }

    fun excluirCurso(codCurso: Int) {
        cursos.removeIf { it.codCurso == codCurso }
    }
}