import java.math.BigDecimal;
import java.math.RoundingMode;

public class Mulher extends PessoaIMC
{
    public String genre = "F";

    public Mulher(String n, String sN, int diaNasc, int mesNasc, int anoNasc)
    {
        super(n, sN, diaNasc, mesNasc, anoNasc);
    }

    public Mulher(String n, String sN, int diaNasc, int mesNasc, int anoNasc, double alt, double pes)
    {
        super(n, sN, diaNasc, mesNasc, anoNasc, alt, pes);
    }

    public String resultIMC()
    {
        double imc = super.calculaIMC(super.getPeso(), super.getAltura());

        if (imc < 19)
        {
            return "essa mulher está abaixo do peso ideal.";
        }
        else if ((imc >= 19) && (imc <= 25.8))
        {
            return "essa mulher está no peso ideal.";
        }
        else
        {
            return "essa mulher está acima do peso ideal.";
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
        return super.toString() + ", é uma mulher, possui um IMC de " + round(super.calculaIMC(super.getPeso(), super.getAltura()), 2) + " e " + this.resultIMC();
    }
}
