public class Programa {
    public static void main(String[] args) {

        AlunoPOO.professor = "Adriel";

        AlunoPOO aluno1 = new AlunoPOO();
        aluno1.nome = "Rikelme";
        aluno1.turma = 204;

        AlunoPOO aluno2 = new AlunoPOO();
        aluno2.nome = "Roberto";
        aluno2.turma = 204;

        AlunoPOO aluno3 = new AlunoPOO();
        aluno3.nome = "Carla";
        aluno3.turma = 204;

        System.out.println("O aluno " + aluno1.nome + " tem o professor " + aluno1.professor);
        System.out.println("O aluno " + aluno2.nome + " tem o professor " + aluno2.professor);
        System.out.println("O aluno " + aluno3.nome + " tem o professor " + aluno3.professor);

    }
}
