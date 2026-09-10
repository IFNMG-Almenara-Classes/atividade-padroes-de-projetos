package comportamentais.iterator.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.adicionar("Música A");
        playlist.adicionar("Música B");
        playlist.adicionar("Música C");

        // O cliente precisa saber que só as "quantidade" primeiras
        // posições do array são válidas — se usar musicas.length, imprime
        // as posições vazias (null) do array de tamanho fixo.
        String[] musicas = playlist.getMusicas();
        for (int i = 0; i < playlist.getQuantidade(); i++) {
            System.out.println(musicas[i]);
        }

        // Se a Playlist trocar o array fixo por uma lista sem limite de
        // tamanho por dentro, todo código cliente que depende de array e
        // de "quantidade" quebra.
    }
}
