package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Classe principal que cria dispositivos, comandos e controla o Invoker (controle remoto).
public class SmartHome {
    private static boolean sistema = true;

    public static void main(String[] args) {
        // Cria dispositivos (TV, SOM, Ar Condicionado).
        Receiver tv = new Receiver("TV");
        Receiver SistemaDeSom = new Receiver("SOM");
        Receiver arCondicionado = new Receiver("Ar Condicionado");

        // Cria um Invoker (controle remoto).
        Invoker invoker = new Invoker();

        // Mapeia os dispositivos disponíveis
        List<Receiver> dispositivos = new ArrayList<>();
        dispositivos.add(tv);
        dispositivos.add(SistemaDeSom);
        dispositivos.add(arCondicionado);

        // Solicita ao usuário qual dispositivo deseja ligar ou desligar
        Scanner scanner = new Scanner(System.in);
        while (sistema) {
            System.out.println("_________________________________________________");
            System.out.println("Escolha o dispositivo \n" +
                    "_________________________________________________\n" +
                    "0 - TV \n" +
                    "1 - SOM\n" +
                    "2 - Ar Condicionado \n" +
                    "3 - Desfazer ultima ação \n" +
                    "_________________________________________________\n" +
                    "Qualquer número para sair ");
            int opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Saindo...");
                sistema = false;
                break;
            } else if (opcao == 3) {
                invoker.undoDesfazerAcao();
                continue;
            }

            System.out.println("_________________________________________________");

            System.out.println("Escolha a ação \n" +
                    "0 - Ligar \n" +
                    "1 - Desligar \n" +
                    "_________________________________________________\n" +
                    " Qualquer Número para Sair ");
            int acao = scanner.nextInt();

            switch(acao){
                case 0:
                    invoker.executarComando(new ComandoLigar(dispositivos.get(opcao)));
                    break;
                case 1:
                    invoker.executarComando(new ComandoDesligar(dispositivos.get(opcao)));
                    break;

                default:
                    System.out.println("Saindo...");
                    sistema = false;
                    break;
            }

        }
    }
}

