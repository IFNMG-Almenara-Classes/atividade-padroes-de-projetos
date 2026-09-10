package comportamentais.iterator.exemplo1.depois;

import java.util.List;

public class PlaylistIterador implements Iterador<String> {

    private final List<String> musicas;
    private int posicaoAtual = 0;

    public PlaylistIterador(List<String> musicas) {
        this.musicas = musicas;
    }

    @Override
    public boolean hasNext() {
        return posicaoAtual < musicas.size();
    }

    @Override
    public String next() {
        return musicas.get(posicaoAtual++);
    }
}
