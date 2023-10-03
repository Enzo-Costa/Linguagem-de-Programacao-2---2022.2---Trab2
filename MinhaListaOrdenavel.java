import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinhaListaOrdenavel 
{
    static ArrayList<PessoaIMC> pessoas = new ArrayList<PessoaIMC>();

    public static void Add(Homem p)
    {  
        pessoas.add((PessoaIMC)p);
    }

    public static void Add(Mulher p)
    {  
        pessoas.add((PessoaIMC)p);
    }

    public static PessoaIMC Get(int index)
    {
        return pessoas.get(index);
    }

    public static void Imprime()
    {
        Homem h;
        Mulher m;

        for(int i = 0; i < 10; i++)
        {
            if(MinhaListaOrdenavel.Get(i) instanceof Homem)
            {
                h = (Homem) MinhaListaOrdenavel.Get(i);
                System.out.println(h.toString());
            }
            else
            {
                m = (Mulher) MinhaListaOrdenavel.Get(i);
                System.out.println(m.toString());
            }
        }
    }

    public static Comparator<Object> porNome = new Comparator<Object>() 
    {
        public int compare(Object o1, Object o2) 
        {
            PessoaIMC p1 = (PessoaIMC) o1;
            PessoaIMC p2 = (PessoaIMC) o2;
            int tamanho = 0;

            String nome1 = (p1.getNome() + " " + p1.getSobreNome());
            String nome2 = (p2.getNome() + " " + p2.getSobreNome());

            if (nome1.length() > nome2.length())
            {
                tamanho = nome1.length();
            }
            else
            {
                tamanho = nome2.length();
            }

            char[] nom1 = nome1.toCharArray();
            char[] nom2 = nome2.toCharArray();

            for(int x = 0; x < tamanho ; x++) 
            {
				if (Character.toLowerCase(nom1[x]) > Character.toLowerCase(nom2[x]))
                {
                    return 1;
                }

                if (Character.toLowerCase(nom1[x]) < Character.toLowerCase(nom2[x]))
                {
                    return -1;
                }
			}

            return 0;

        }    
    };

    public static Comparator<Object> porGenre = new Comparator<Object>() 
    {
        public int compare(Object o1, Object o2)
        {
            String genrep1 = "";
            String genrep2 = "";

            if(o1 instanceof Homem)
            {
                Homem p1 = (Homem) o1;

                genrep1 = p1.getGenre();
            }
            else if(o1 instanceof Mulher)
            {
                Mulher p1 = (Mulher) o1;

                genrep1 = p1.getGenre();
            }

            if(o2 instanceof Homem)
            {
                Homem p2 = (Homem) o2;

                genrep2 = p2.getGenre();
            }
            else if(o2 instanceof Mulher)
            {
                Mulher p2 = (Mulher) o2;

                genrep2 = p2.getGenre();
            }

            char[] g1 = genrep1.toCharArray();
            char[] g2 = genrep2.toCharArray();

            if(g1[0] >= g2[0])
            {
                return 1;
            }
            else
            {
                return -1;
            }
        } 
    };

    public static Comparator<Object> porPeso = new Comparator<Object>() 
    {
        public int compare(Object o1, Object o2)
        {
            PessoaIMC p1 = (PessoaIMC) o1;
            PessoaIMC p2 = (PessoaIMC) o2;

            if(p1.getPeso() >= p2.getPeso())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    };

    public static Comparator<Object> porAltura = new Comparator<Object>()
    {
        public int compare(Object o1, Object o2)
        {
            PessoaIMC p1 = (PessoaIMC) o1;
            PessoaIMC p2 = (PessoaIMC) o2;

            if(p1.getAltura() >= p2.getAltura())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    };

    public static Comparator<Object> porIMC = new Comparator<Object>() 
    {
        public int compare(Object o1, Object o2)
        {
            PessoaIMC p1 = (PessoaIMC) o1;
            PessoaIMC p2 = (PessoaIMC) o2;

            if(p1.calculaIMC(p1.getPeso(), p1.getAltura()) >= p2.calculaIMC(p2.getPeso(), p2.getAltura()))
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    };

    public static Comparator<Object> porDataNasc = new Comparator<Object>() 
    {
        public int compare(Object o1, Object o2) 
        {
            PessoaIMC p1 = (PessoaIMC) o1;
            PessoaIMC p2 = (PessoaIMC) o2;

            if(p1.getAno() <= p2.getAno())
            {
                if(p1.getMes() <= p2.getMes())
                {
                    if(p1.getDia() <= p2.getDia())
                    {
                        return 1;
                    }
                }
            }

            return -1;
        }
        
    };

    public static ArrayList<PessoaIMC> Ordenar(int opcao)
    {
        switch(opcao)
        {
            case 1:
            {
                Collections.sort(pessoas, porNome);
                return pessoas;
            }
            case 2:
            {
                Collections.sort(pessoas, porNome.reversed());
                return pessoas;
            }
            case 3:
            {
                Collections.sort(pessoas, porGenre);
                return pessoas;
            }
            case 4:
            {
                Collections.sort(pessoas, porAltura.reversed());
                return pessoas;
            }
            case 5:
            {
                Collections.sort(pessoas, porAltura);
                return pessoas;
            }
            case 6:
            {
                Collections.sort(pessoas, porPeso.reversed());
                return pessoas;
            }
            case 7:
            {
                Collections.sort(pessoas, porPeso);
                return pessoas;
            }
            case 8:
            {
                Collections.sort(pessoas, porIMC.reversed());
                return pessoas;
            }
            case 9:
            {
                Collections.sort(pessoas, porIMC);
                return pessoas;
            }
            case 10:
            {
                Collections.sort(pessoas, porDataNasc);
                return pessoas;
            }
            default:
            {
                System.out.println("Número inválido, por favor escolha um número de 1 a 9");
                return pessoas;
            }
        }
    }  
}
