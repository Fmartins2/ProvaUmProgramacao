import java.util.Scanner;

//Fernando Martins

public class UC1AtividadeUm {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);                               

    System.out.println("Informe a placa do veículo: ");
    String placa = input.nextLine();

    System.out.println("Informe o valor do litro do combustível: ");
    double valorLitro = input.nextDouble();

    System.out.println("Informe a quantidade de quilômetros rodados a 60 km/h: ");
    int km60 = input.nextInt();

    System.out.println("Informe a quantidade de quilômetros rodados a 80 km/h: ");
    int km80 = input.nextInt();

    System.out.println("Informe a quantidade de quilomêtros rodados a 100 km/h: ");
    int km100 = input.nextInt();

    System.out.println("Informe a quantidade de quilomêtros rodados a 120 km/h: ");
    int km120 = input.nextInt();

    System.out.println("Informe a quantidade de quilomêtros rodados a 140 km/h: ");
    int km140 = input.nextInt();

    double combustivel60 = km60 / 30.7;
    double combustivel80 = km80 / 26.8;
    double combustivel100 = km100 / 22.4;
    double combustivel120 = km120 / 18.1;
    double combustivel140 = km140 / 14.5;

    double combustivelTotal = combustivel60 + combustivel80 + combustivel100 + combustivel120 + combustivel140;

    double distanciaTotal = km60 + km80 + km100 + km120 + km140;

    double velocidadeMediaPonderada = ((km60 * 60) + (km80 * 80) + (km100 * 100) + (km120 * 120) + (km140 * 140)) / distanciaTotal;
    

    double custoTotal = combustivelTotal * valorLitro; 


    System.out.println("Placa do veículo: " + placa);
    
    System.out.printf("Custo total da viagem: R$ %.2f\n ", custoTotal);
    
    System.out.printf("Velocidade média ponderada da viagem: %.4f km/h\n", velocidadeMediaPonderada);
    
    System.out.printf("Quantidade total de combustível: %.4f litros \n", combustivelTotal);

    input.close();

    }
    
}