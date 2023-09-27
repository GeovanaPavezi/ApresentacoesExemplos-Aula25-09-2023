package command;
// Receiver - Representa um dispositivo (TV, SOM, Ar Condicionado)
public class Receiver {
    private String nome;  // Nome do dispositivo
    private boolean estado; // Estado do dispositivo (ligado/desligado)

    public Receiver(String name) {
        this.nome = name;
        this.estado = false; // Inicialmente, o dispositivo está desligado
    }

    public void turnOn() {
        estado = true;
        System.out.println("_________________________________________________");
        System.out.println(nome + " está ligado.");
    }

    public void turnOff() {
        estado = false;
        System.out.println("_________________________________________________");
        System.out.println(nome + " está desligado.");

    }


    // Método para verificar se o dispositivo está ligado
    public boolean isEstado() {
        return estado;
    }
}