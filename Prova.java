import java.util.Scanner;
public class Prova {
    public Prova(String data, Questao q1, Questao q2, Questao q3, Questao q4, Questao q5, Aluno aluno) {
        this.data = data;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.candidato = aluno;
    }

    private String data;
    private Questao q1;
    private Questao q2;
    private Questao q3;
    private Questao q4;
    private Questao q5;
    private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int r5;
    private Aluno candidato;
    private int nota;
    Scanner sc = new Scanner(System.in);
    private int CorrigeProva() {
        int pontos = 0;
        assert getQ1() != null;
        if(getR1() == getQ1().getResposta_correta()) {
            pontos += 2;
        }
        assert getQ2() != null;
        if(getR2() == getQ2().getResposta_correta()) {
            pontos += 2;
        }
        assert getQ3() != null;
        if(getR3() == getQ3().getResposta_correta()) {
            pontos += 2;
        }
        assert getQ4() != null;
        if(getR4() == getQ4().getResposta_correta()) {
            pontos += 2;
        }
        assert getQ5() != null;
        if(getR5() == getQ5().getResposta_correta()) {
            pontos += 2;
        }
        return pontos;
    }
    public void apresentarProva() {
        getQ1().mostrarquestao();
        System.out.println("Insira a resposta da questão 1");
        setR1(sc.nextInt());
        getQ2().mostrarquestao();
        System.out.println("Insira a resposta da questão 2");
        setR2(sc.nextInt());
        getQ3().mostrarquestao();
        System.out.println("Insira a resposta da questão 3");
        setR3(sc.nextInt());
        getQ4().mostrarquestao();
        System.out.println("Insira a resposta da questão 4");
        setR4(sc.nextInt());
        getQ5().mostrarquestao();
        System.out.println("Insira a resposta da questão 5");
        setR5(sc.nextInt());
        setNota(CorrigeProva());
        System.out.println("Nota de " + candidato.getNome() + ": " + getNota());
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Questao getQ1() {
        return q1;
    }

    public void setQ1(Questao q1) {
        this.q1 = q1;
    }

    public Questao getQ2() {
        return q2;
    }

    public void setQ2(Questao q2) {
        this.q2 = q2;
    }

    public Questao getQ3() {
        return q3;
    }

    public void setQ3(Questao q3) {
        this.q3 = q3;
    }

    public Questao getQ4() {
        return q4;
    }

    public void setQ4(Questao q4) {
        this.q4 = q4;
    }

    public Questao getQ5() {
        return q5;
    }

    public void setQ5(Questao q5) {
        this.q5 = q5;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getR4() {
        return r4;
    }

    public void setR4(int r4) {
        this.r4 = r4;
    }

    public int getR5() {
        return r5;
    }

    public void setR5(int r5) {
        this.r5 = r5;
    }

    public Aluno getCandidato() {
        return candidato;
    }

    public void setCandidato(Aluno candidato) {
        this.candidato = candidato;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
