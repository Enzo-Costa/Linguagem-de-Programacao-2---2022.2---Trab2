import java.util.ArrayList;
import java.util.Scanner;

public class P2nX 
{
    public static void main(String[] args) 
    {
        int escolha = 1;

        try (Scanner s = new Scanner(System.in)) 
        {
            String op = "";

            new ArrayList<PessoaIMC>();

            //NÚMEROS DE PESO E ALTURA ESCOLHIDOS DE FORMA ALEATÓRIA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

            Homem h1 = new Homem("Enzo", "Costa", 4, 11, 2002, 1.84, 72.8);
            Homem h2 = new Homem("Gabriel", "Balthazar", 9, 1, 2001, 1.83, 75.2);
            Homem h3 = new Homem("Andre", "Ribeiro", 17, 8, 2001, 1.68, 70.7);
            Homem h4 = new Homem("Caio", "Guedes", 2, 5, 2000, 1.78, 73.9);
            Homem h5 = new Homem("Lucas", "Gonçalves", 20, 2, 1999, 1.82, 71.6);

            Mulher m1 = new Mulher("Ana", "Beatriz", 15, 4, 2001, 1.68, 69.3);
            Mulher m2 = new Mulher("Laura", "Loureiro", 12, 9, 1998, 1.62, 65.3);
            Mulher m3 = new Mulher("Estephany", "Costa", 7, 1, 2001, 1.67, 68.7);
            Mulher m4 = new Mulher("Victoria", "Moraes", 20, 7, 2002, 1.68, 70.1);
            Mulher m5 = new Mulher("Julia", "Colpas", 26, 12, 2005, 1.68, 70.1);

            MinhaListaOrdenavel.Add(h1);
            MinhaListaOrdenavel.Add(h2);
            MinhaListaOrdenavel.Add(h3);
            MinhaListaOrdenavel.Add(h4);
            MinhaListaOrdenavel.Add(h5);
            MinhaListaOrdenavel.Add(m1);
            MinhaListaOrdenavel.Add(m2);
            MinhaListaOrdenavel.Add(m3);
            MinhaListaOrdenavel.Add(m4);
            MinhaListaOrdenavel.Add(m5);

            for(;;)
            {
                System.out.println("____________________________________________");
                System.out.println("|                                           |");
                System.out.println("|      Escolha a opção de ordenação         |");
                System.out.println("|                                           |");
                System.out.println("| 1- Nome (A-Z)       2- Nome (Z-A)         |");
                System.out.println("| 3- Gênero           4- Altura (+ pro -)   |");
                System.out.println("| 5- Altura (- pro +) 6- Peso (+ pro -)     |");
                System.out.println("| 7- Peso (- pro +)   8- IMC (+ pro -)      |");
                System.out.println("| 9- IMC (- pro +)   10- Dia de Nascimento  |");
                System.out.println("|                                           |");
                System.out.println("|          Aperte 0 para sair               |");
                System.out.println("|___________________________________________|");

                try
                {
                    System.out.println("\nEscolha o método de ordenação: ");

                    op = s.nextLine();

                    escolha = Integer.parseInt(op);

                    if(escolha == 0)
                    {
                        break;
                    }

                    MinhaListaOrdenavel.Ordenar(escolha);

                    MinhaListaOrdenavel.Imprime();

                }
                catch(Exception ex)
                {
                    System.out.println("Entrada inválida, por favor digite um número.");
                }

                System.out.println("Deseja continuar? (S/N)");

                String sn = s.nextLine().toUpperCase();

                if (sn.equals("N"))
                {
                    break;
                }

                System.out.flush();

            }

            s.close();
        }

    }
    
}
