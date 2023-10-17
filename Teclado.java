import java.util.Objects;

public class Teclado extends ItemAmbiente {

    private Corteclado corTeclado;

    public Teclado(String nome, Corteclado corTeclado) {
        super(nome);
        this.corTeclado = corTeclado;
    }

    public Corteclado getCorTeclado() {
        return corTeclado;
    }

    public void setCorTeclado(Corteclado corTeclado) {
        this.corTeclado = corTeclado;
    }
}