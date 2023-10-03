import java.util.GregorianCalendar;

public abstract class PessoaIMC extends Pessoa
{
    protected double peso = 0;
    protected double altura = 0;

    public PessoaIMC(String n, String sN, int diaNasc, int mesNasc, int anoNasc, double alt, double pes)
    {
        super(n, sN, diaNasc, mesNasc, anoNasc);
        altura = alt;
        peso = pes;
    }

    public PessoaIMC(String n, String sN, int diaNasc, int mesNasc, int anoNasc)
    {
        super(n, sN, diaNasc, mesNasc, anoNasc);
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getSobreNome()
    {
        return this.sobreNome;
    }

    public double getPeso()
    {
        return this.peso;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public GregorianCalendar getDataNasc()
    {
        return this.dataNasc;
    }

    public int getDia()
    {
        return this.dia;
    }

    public int getMes()
    {
        return this.mes;
    }

    public int getAno()
    {
        return this.ano;
    }

    public String toString()
    {
        if ((this.altura != 0) && (this.peso != 0))
        {
            return super.toString() + ", possui um peso de " + this.peso + " kg e uma altura de " + this.altura + " m";
        }

        return super.toString() + " e seu peso e altura não foi declarado.";
    }

    protected double calculaIMC(double p, double a)
    {
        double IMC = p / (a * a);
        return IMC;
    }

    abstract String resultIMC();
    
}
