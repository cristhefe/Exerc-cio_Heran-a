public class Principal {
    public static void main(String[] args) {


        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Visitante v1 = new Visitante();

        a1.setNome("Marcos");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.setCurso("Analise e desenvolvimento de sistemas");
        a1.setMatricula(875510);

        a1.fazerniver();
        a1.pagarMensalidade();


        b1.setNome("Júllia");
        b1.setIdade(18);
        b1.setSexo("F");
        b1.setCurso("Infermagem");
        b1.setMatricula(866986);
        b1.setBolsa(90f);

        b1.fazerniver();
        b1.pagarMensalidade();

        t1.setNome("Caio");
        t1.setIdade(26);
        t1.setSexo("M");
        t1.setCurso("Engenharia");
        t1.setMatricula(856455);

        t1.fazerniver();
        t1.pagarMensalidade();

        p1.setNome("Antonio");
        p1.setIdade(47);
        p1.setSexo("M");
        p1.setEspecialidade("Ciências Biológicas");
        p1.setSalario(3.457f);

        p1.fazerniver();
        p1.receberAum(400f);

        f1.setNome("Carla");
        f1.setIdade(35);
        f1.setSexo("F");
        f1.setSetor(05);

        f1.fazerniver();
        f1.setTrabalhando(true);

        v1.setNome("Gabriel");
        v1.setIdade(19);
        v1.setSexo("M");

        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        System.out.println(p1.toString());
        System.out.println(f1.toString());
        System.out.println(v1.toString());











    }
}