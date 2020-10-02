fun main() {
    val DH = DigitalHouseManager()

    // REGISTRANDO DOIS PROFESSORES TITULARES E DOIS PROFESSORES ADJUNTOS
    DH.registrarProfessorTitular("Vitor", "Nascimento", 1, "Android")
    DH.registrarProfessorTitular("Gabriel", "Silva", 2, "Kotlin")
    DH.registrarProfessorAdjunto("Lucas", "Porto", 3, 6)
    DH.registrarProfessorAdjunto("Arthur", "Souza", 4, 6)

    // REGISTRANDO DOIS CURSOS
    DH.registrarCurso("Full Stack", 20001, 3)
    DH.registrarCurso("Android", 20002, 2)

    // ALOCANDO PROFESSORES (UM DE CADA TIPO PARA CADA CURSO)
    DH.alocarProfessores(20001, 1, 3)
    DH.alocarProfessores(20002, 2, 4)

    // MATRICULANDO DOIS ALUNOS NO CURSO DE FULL STACK
    DH.matricularAluno("João", "Wist", 1)
    DH.matricularAluno(1, 20001)

    DH.matricularAluno("Matheus", "Wozz", 2)
    DH.matricularAluno(2, 20001)

    // MATRICULANDO DOIS ALUNOS NO CURSO DE ANDROID
    DH.matricularAluno("Julia", "Calixto", 3)
    DH.matricularAluno(3, 20002)

    DH.matricularAluno("Isabela", "Peres", 4)
    DH.matricularAluno(4, 20002)
}