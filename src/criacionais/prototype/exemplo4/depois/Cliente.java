package criacionais.prototype.exemplo4.depois;

public class Cliente {

    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana");
        Pessoa bruno = new Pessoa("Bruno");

        ana.setMelhorAmigo(bruno);
        bruno.setMelhorAmigo(ana);

        Pessoa anaCopia = ana.copiar();

        System.out.println("Original: " + ana
                + " | amigo do amigo é a própria Ana? " + (ana.getMelhorAmigo().getMelhorAmigo() == ana));
        System.out.println("Copia: " + anaCopia
                + " | amigo do amigo é a própria copia? " + (anaCopia.getMelhorAmigo().getMelhorAmigo() == anaCopia));
        System.out.println("A copia do amigo é o Bruno original? " + (anaCopia.getMelhorAmigo() == bruno));
        // O ciclo foi reconstruído na cópia (anaCopia <-> brunoCopia), mas
        // com objetos totalmente novos — nada é compartilhado com Ana e
        // Bruno originais.
    }
}
