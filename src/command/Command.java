package command;

public interface Command {
    void execute();// Método para executar um comando

    void undo();// Método para desfazer um comando
}
