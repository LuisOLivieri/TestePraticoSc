import java.util.ArrayList;
import java.util.List;

public class Modulo extends ItemAmbiente{
    private final List<Luminaria> canais;

    public Modulo(String nome) {
        super(nome);
        this.canais = new ArrayList<>();
    }

    public void adicionarLuminaria(Luminaria luminaria){
        canais.add(luminaria);
    }

    public void removerLuminaria(Luminaria luminaria){
        canais.remove(luminaria);
    }
}