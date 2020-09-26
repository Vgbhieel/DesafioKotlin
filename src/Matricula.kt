import java.util.*

data class Matricula(
        val aluno: Aluno,
        var curso: Curso
) {

    val dtMatricula: Date = Date()
}