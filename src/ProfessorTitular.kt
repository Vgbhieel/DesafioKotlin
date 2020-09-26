class ProfessorTitular(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codProfessor: Int,
        var especialidade: String
) : Professor(
        nome = nome,
        sobrenome = sobrenome,
        tempoDeCasa = tempoDeCasa,
        codProfessor = codProfessor
)