package src;

public class Aritmetica implements iMediaStrategy{
    @Override
    public double calcularMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String verificarSituacao(double media) {
        if (media>= 5)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
