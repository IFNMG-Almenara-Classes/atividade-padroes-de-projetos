package estruturais.composite.exemplo2.antes;

import java.util.ArrayList;
import java.util.List;

public class Pasta {

    private final String nome;
    private final List<Arquivo> arquivos = new ArrayList<>();
    private final List<Pasta> subpastas = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void adicionarSubpasta(Pasta subpasta) {
        subpastas.add(subpasta);
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public List<Pasta> getSubpastas() {
        return subpastas;
    }
}
