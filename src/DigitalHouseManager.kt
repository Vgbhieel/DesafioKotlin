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

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codProfessor: Int, qtdHorasMonitoria: Int) {
        val novoProfessor = ProfessorAdjunto(nome = nome, sobrenome = sobrenome, codProfessor = codProfessor, qtdHorasMonitoria = qtdHorasMonitoria)
        professores.add(novoProfessor)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codProfessor: Int, especialidade: String) {
        val novoProfessor = ProfessorTitular(nome = nome, sobrenome = sobrenome, codProfessor = codProfessor, especialidade = especialidade)
        professores.add(novoProfessor)
    }

    fun excluirProfessor(codProfessor: Int) {
        professores.removeIf { it.codProfessor == codProfessor }
    }

    fun matricularAluno(nome: String, sobrenome: String, codAluno: Int) {
        val novoAluno = Aluno(nome = nome, sobrenome = sobrenome, codAluno = codAluno)
        alunos.add(novoAluno)
    }

    fun matricularAluno(codAluno: Int, codCurso: Int) {
        // PESQUISA E VALIDA O codCurso
        val curso = cursos.find { it.equals(codCurso) }

        if (curso !is Curso) {
            println("Nenhum curso com o código $codCurso foi encontrado.")
            return
        }

        // PESQUISA E VALIDA O codAluno
        val aluno = alunos.find { it.equals(codAluno) }

        if (aluno !is Aluno) {
            println("Nenhum aluno com o código $codAluno foi encontrado.")
            return
        }

        // ADICIONA O ALUNO NO CURSO, CASO SEJA POSSÍVEL
        if (curso.adicionarUmAluno(aluno)) {
            println("Não há vagas para o curso ${curso.nome}.")
            return
        }

        // MATRICULA O ALUNO NO CURSO
        val matricula = Matricula(aluno = aluno, curso = curso)
        matriculas.add(matricula)
        println("Matrícula do aluno(a): ${aluno.nome} realizada com sucesso.")
        println("Curso da Matrícula: ${curso.nome}.")
    }
}