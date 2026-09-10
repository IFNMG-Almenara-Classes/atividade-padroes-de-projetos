package criacionais.prototype.exemplo4.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana");
        Pessoa bruno = new Pessoa("Bruno");

        // Ana e Bruno são melhores amigos um do outro — uma referência
        // cíclica: ana -> bruno -> ana -> bruno -> ...
        ana.setMelhorAmigo(bruno);
        bruno.setMelhorAmigo(ana);

        try {
            Pessoa anaCopia = ana.copiar();
            System.out.println(anaCopia);
        } catch (StackOverflowError e) {
            // Só capturamos aqui para o exemplo não travar o terminal — em
            // código real, isso seria simplesmente um crash.
            System.out.println("Erro: StackOverflowError! copiar() entrou em loop infinito"
                    + " porque Ana e Bruno referenciam um ao outro (ciclo).");
            e.printStackTrace();
        }
    }
}
