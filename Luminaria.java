import java.util.ArrayList;
import java.util.List;

public class Luminaria extends ItemAmbiente {
    private boolean ligada;
    private final List<Teclado> acionadores;

    public Luminaria(String nome) {
        super(nome);
        this.ligada = false;
        this.acionadores = new ArrayList<>();
    }

    public boolean adicionarAcionadores(Teclado teclado){
        if (!acionadores.contains(teclado)){
            acionadores.add(teclado);
            return true;
        }
        return false;
    }
    public void ligar() {
        if (!ligada) {  // Verifica se a luminária já não está ligada
            System.out.println("Ligando a luminária: " + getNome());
            ligada = true;
        } else {
            System.out.println("A luminária já está ligada.");
        }
    }
    public void desligar() {
        if (ligada) {  // Verifica se a luminária já não está desligada
            System.out.println("Desligando a luminária: " + getNome());
            ligada = false;
        } else {
            System.out.println("A luminária já está desligada.");
        }
    }
}