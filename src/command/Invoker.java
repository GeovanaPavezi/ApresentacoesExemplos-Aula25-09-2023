package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<>(); // Mantém uma lista de comandos executados

    public void executarComando(Command command) {
        commands.add(command); // Adiciona o comando à lista de comandos executados
        command.execute();  // Executa o comando
    }

    public void undoDesfazerAcao() { // Método para desfazer a última ação (desligar o dispositivo)
        if (!commands.isEmpty()) {// Verifica se existem comandos na lista
            Command lastCommand = commands.remove(commands.size() - 1);// Pega o último comando
            lastCommand.undo(); // Desfaz a ação executando o método undo()
        } else {
            System.out.println("Nada para desfazer.");
        }
    }
}