public class Turma {
    String codigo;
    Professor professor; 
    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        System.out.println("Código da turma: " + codigo);
        System.out.println("Professor: " + professor.nome);
        System.out.println();
    }
}
