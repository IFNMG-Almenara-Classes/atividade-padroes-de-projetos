package comportamentais.iterator.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.adicionar("Música A");
        playlist.adicionar("Música B");
        playlist.adicionar("Música C");

        // O cliente não sabe (nem precisa saber) que por dentro a Playlist
        // usa uma List — ele só conhece Iterador:
        Iterador<String> iterador = playlist.criarIterador();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // A Playlist pode trocar sua estrutura interna (array, lista
        // encadeada, banco de dados...) sem quebrar nenhum código cliente,
        // desde que continue devolvendo um Iterador válido.
    }
}
