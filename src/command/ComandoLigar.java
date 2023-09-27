package command;

public class ComandoLigar implements Command {
    private Receiver dispositivo;

    public ComandoLigar(Receiver dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void execute() {
        dispositivo.turnOn();
    }

    public void undo() {
        dispositivo.turnOff();
    }
}