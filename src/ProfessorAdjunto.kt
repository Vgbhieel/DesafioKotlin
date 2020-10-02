class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codProfessor: Int,
        var qtdHorasMonitoria: Int
) : Professor(
        nome = nome,
        sobrenome = sobrenome,
        codProfessor = codProfessor
)