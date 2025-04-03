package tempodeviagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distancia, velocidade;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a distância que será percorrida (em km): ");
        distancia = input.nextInt();
        System.out.println("Insira a velocidade em que será realizado o percurso (em km/h): ");
        velocidade = input.nextInt();
        input.close();

        System.out.println(calcularTempo(distancia, velocidade));
        
    }

    public static String calcularTempo(int distancia, int velocidade)
    {
        double tempo = (double) distancia/velocidade;
        String msg = " ";
        if (tempo >= 1)
        {        
            msg = "O tempo que levará para chegar ao destino será de: " + tempo + " horas.";
        }
        else {
            tempo = tempo*60;
            msg = String.format("%s %.0f %s", "O tempo que leverá para chegar ao destino será de:", tempo, "minutos");
        }
        return msg;
    }
}