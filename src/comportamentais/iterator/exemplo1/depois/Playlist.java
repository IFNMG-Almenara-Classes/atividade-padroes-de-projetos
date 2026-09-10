package comportamentais.iterator.exemplo1.depois;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Iteravel<String> {

    private final List<String> musicas = new ArrayList<>();

    public void adicionar(String musica) {
        musicas.add(musica);
    }

    @Override
    public Iterador<String> criarIterador() {
        return new PlaylistIterador(musicas);
    }
}
