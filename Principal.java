public class Principal {
    public static void main(String[] args) {
        Professor p1 = new Professor("Carlos");
        Turma t1 = new Turma("INF01");

        t1.setProfessor(p1);
        t1.resumo();

        Professor p2 = new Professor("Mariana");
        t1.setProfessor(p2);
        t1.resumo();
    }
}
