class ProfessorTitular(
        nome: String,
        sobrenome: String,
        codProfessor: Int,
        var especialidade: String
) : Professor(
        nome = nome,
        sobrenome = sobrenome,
        codProfessor = codProfessor
)