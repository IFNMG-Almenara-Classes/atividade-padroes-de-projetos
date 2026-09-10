package comportamentais.iterator.exemplo1.antes;

public class Playlist {

    private final String[] musicas = new String[10];
    private int quantidade = 0;

    public void adicionar(String musica) {
        musicas[quantidade++] = musica;
    }

    // Para percorrer a playlist, o cliente precisa conhecer que ela guarda
    // as músicas num array de tamanho fixo e que só as primeiras
    // "quantidade" posições são válidas.
    public String[] getMusicas() {
        return musicas;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
