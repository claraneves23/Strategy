package src;

public class Disciplina {
     private String nome, situacao;
     private double p1, p2, media;
     private iMediaStrategy estrategia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }


    public Disciplina(iMediaStrategy estrategia){
         this.estrategia = estrategia;
    }

    public void calcularMedia(){
       media= estrategia.calcularMedia(p1,p2);
       situacao = estrategia.verificarSituacao(media);
    }

}
