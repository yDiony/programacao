package AULA22.exemplos.exemploPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setSobrenome("Jonas");
        p1.setNome("Silva");
        Aluno a1 = new Aluno();
        a1.setNome("Diony");
        a1.setSobrenome("Rinker");
        a1.setMatricula("a1234");

        System.out.println(p1.obterDados());
        System.out.println(a1.obterDados());
    }
}
