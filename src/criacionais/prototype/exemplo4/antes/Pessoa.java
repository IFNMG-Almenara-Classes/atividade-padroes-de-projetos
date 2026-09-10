package criacionais.prototype.exemplo4.antes;

public class Pessoa {

    private final String nome;
    private Pessoa melhorAmigo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setMelhorAmigo(Pessoa melhorAmigo) {
        this.melhorAmigo = melhorAmigo;
    }

    public Pessoa getMelhorAmigo() {
        return melhorAmigo;
    }

    public Pessoa copiar() {
        Pessoa copia = new Pessoa(this.nome);
        // melhorAmigo é do MESMO TIPO de Pessoa — copiamos recursivamente,
        // igual faríamos com qualquer atributo mutável.
        if (this.melhorAmigo != null) {
            copia.melhorAmigo = this.melhorAmigo.copiar();
        }
        return copia;
    }

    @Override
    public String toString() {
        String amigo = (melhorAmigo != null) ? melhorAmigo.nome : "ninguém";
        return nome + " (melhor amigo: " + amigo + ")";
    }
}
