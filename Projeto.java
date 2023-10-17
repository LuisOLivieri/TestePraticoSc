import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private final List<Ambiente> listaAmbientes;

    public Projeto(String nome) {
        this.nome = nome;
        listaAmbientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean adicionarAmbiente(Ambiente ambiente) {
        if (!listaAmbientes.contains(ambiente)) {
            listaAmbientes.add(ambiente);
            return true;
        }
        return false;
    }
}