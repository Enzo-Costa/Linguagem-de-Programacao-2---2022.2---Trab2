import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homem extends PessoaIMC
{
    private String genre = "M";

    public Homem(String n, String sN, int diaNasc, int mesNasc, int anoNasc)
    {
        super(n, sN, diaNasc, mesNasc, anoNasc);
    }

    public Homem(String n, String sN, int diaNasc, int mesNasc, int anoNasc, Double alt, Double pes)
    {
        super(n, sN, diaNasc, mesNasc, anoNasc, alt, pes);
    }

    public String resultIMC()
    {
        double imc = super.calculaIMC(super.getPeso(), super.getAltura());

        if (imc < 20.7)
        {
            return "esse homem está abaixo do peso ideal.";
        }
        else if ((imc >= 20.7) && (imc <= 26.4))
        {
            return "esse homem está no peso ideal.";
        }
        else
        {
            return "esse homem está acima do peso ideal.";
        }
    }

    public static double round(double value, int places) 
    {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String getGenre()
    {
        return this.genre;
    }

    public String toString()
    {
        return super.toString() + ", é um homem, possui um IMC de " + round(super.calculaIMC(super.getPeso(), super.getAltura()), 2) + " e " + this.resultIMC();
    }

}
