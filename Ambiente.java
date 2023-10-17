import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ambiente {
    private String nome;
    private final List<ItemAmbiente> listaItensAmbiente;

    public Ambiente(String nome) {
        this.nome = nome;
        listaItensAmbiente = new ArrayList<>();
    }

    public String getNome() { //Este é um método de acesso (getter) que retorna o valor do campo nome.
        return nome;
    }

    public void SetName(String nome) { //Este método é um setter para modificar o valor do campo nome.
        this.nome = nome;
    }

    public boolean adicionarItemAmbiente(ItemAmbiente item) {
        if (!listaItensAmbiente.contains(item)){
            listaItensAmbiente.add(item);
            return true;
        }
        return false;
    }

    public boolean removerItemAmbiente(ItemAmbiente item) {
        if (listaItensAmbiente.contains(item)){
            listaItensAmbiente.remove(item);
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ambiente ambiente = (Ambiente) o;
        return Objects.equals(nome, ambiente.nome);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

}
