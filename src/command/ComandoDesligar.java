package command;

// ConcreteCommand - Comandos para ligar e desligar um dispositivo
class ComandoDesligar implements Command {
    private Receiver dispositivo;// O dispositivo Recebido.

    // Construtor que recebe o dispositivo a ser controlado
    public ComandoDesligar(Receiver dispositivo) {
        this.dispositivo = dispositivo;
    }

    // Implementação do método execute para ligar o dispositivo
    public void execute() {
        dispositivo.turnOff();
    }


    // Implementação do método undo para desligar o dispositivo (desfazer)
    public void undo() {
        dispositivo.turnOn();
    }
}
