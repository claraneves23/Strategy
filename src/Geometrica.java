package src;

public class Geometrica implements iMediaStrategy{
    @Override
    public double calcularMedia(double a, double b) {
        return  Math.sqrt(a*b);
    }

    @Override
    public String verificarSituacao(double media) {
        if(media >= 7)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
