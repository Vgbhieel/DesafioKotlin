class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codProfessor: Int,
        var qtdHorasMonitoria: Int
) : Professor(
        nome = nome,
        sobrenome = sobrenome,
        tempoDeCasa = tempoDeCasa,
        codProfessor = codProfessor
)