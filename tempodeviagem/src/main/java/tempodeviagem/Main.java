package tempodeviagem;

import java.util.Scanner;

// programa que calcula o tempo que será levado para chegar a um local baseado na distancia e velocidade
public class Main {
    public static void main(String[] args) {
        // inicializa as variaveis
        int distancia, velocidade;
        // inicializa o scanner input, pergunta e armazena nas variaveis
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a distância que será percorrida (em km): ");
        distancia = input.nextInt();
        System.out.println("Insira a velocidade em que será realizado o percurso (em km/h): ");
        velocidade = input.nextInt();
        // fecha o scanner
        input.close();

        // exibe o resultado
        System.out.println(calcularTempo(distancia, velocidade));
        
    }

    // metódo que fará os calculos e retornará a mensagem a ser exibida
    public static String calcularTempo(int distancia, int velocidade)
    {
        // inicializa a variavel tempo em formato double
        double tempo = (double) distancia/velocidade;
        // inicializa a variavel que ficará a mensagem
        String msg = " ";
        // se o tempo for mais de 1, exibirá uma mensagem com horas
        if (tempo >= 1)
        {        
            msg = "O tempo que levará para chegar ao destino será de: " + tempo + " horas.";
        }
        // senao, exibirá uma mensagem com minutos
        else {
            // converte o tempo para minutos multiplicando por 60
            tempo = tempo*60;
            // formata a string para não exibir os valores decimais do minuto
            msg = String.format("%s %.0f %s", "O tempo que leverá para chegar ao destino será de:", tempo, "minutos");
        }
        // retorna a string msg
        return msg;
    }
}