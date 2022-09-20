public class Teste {
    public static void main(String[] args) {
        Questao q1 = new Questao("Quantos planetas tem o sistema solar", "0", "1", "2", "3", "7", 1);
        Questao q2 = new Questao("Quanto eh um mais um", "0", "1", "11", "2", "10", 4);
        Questao q3 = new Questao ("Qual o melhor dia", "Hoje", "Ontem", "Amanhã", "Nenhum", "26/09", 5);
        Questao q4 = new Questao("Quantas pernas o ser humano NORMAL tem", "0", "1", "3", "-1", "2", 5);
        Questao q5 = new Questao("Qual nota voce da para essa prova mt bem feita", "0", "1", "2", "3", "4", 5);
        Aluno aluno = new Aluno("2217233", "Thai", 19);
        Prova prova = new Prova("13/09/2022", q1, q2, q3, q4 ,q5, aluno);
        prova.apresentarProva();
    }
}
