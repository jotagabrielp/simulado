public class Questao {
        private String enunciado;
        private String alternativa1;
        private String alternativa2;
        private String alternativa3;
        private String alternativa4;
        private String alternativa5;
        private int resposta_correta;

    public Questao(String enunciado, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5, int resposta_correta) {
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.alternativa5 = alternativa5;
        this.resposta_correta = resposta_correta;
    }

    public void mostrarquestao(){
            System.out.println(getEnunciado());
            System.out.println(getAlternativa1());
            System.out.println(getAlternativa2());
            System.out.println(getAlternativa3());
            System.out.println(getAlternativa4());
            System.out.println(getAlternativa5());
        }
        public void Informarresultado(){
            System.out.println(getResposta_correta());
        }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getAlternativa5() {
        return alternativa5;
    }

    public void setAlternativa5(String alternativa5) {
        this.alternativa5 = alternativa5;
    }

    public int getResposta_correta() {
        return resposta_correta;
    }

    public void setResposta_correta(int resposta_correta) {
        this.resposta_correta = resposta_correta;
    }
}
